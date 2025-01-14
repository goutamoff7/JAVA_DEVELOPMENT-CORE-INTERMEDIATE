import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        // A type of stream that enables parallel processing of elements
        // Allowing multiple threads to process parts of the stream simultaneously
        // This can significantly improve performance for the large data sets
        // workload is distributed across multiple threads

        // using stream
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20_000).toList();
        long startTime = System.currentTimeMillis();
        List<Long> factorialsList = list.stream().map(ParallelStreamDemo::factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("total time required using sequential stream : "+(endTime-startTime));

        // using parallelStream
        startTime = System.currentTimeMillis();
        factorialsList = list.parallelStream().map(ParallelStreamDemo::factorial).toList();
        endTime = System.currentTimeMillis();
        System.out.println("total time required using parallelStream : "+(endTime-startTime)+" ms");

        // parallelStream are more effective for CPU-intensive or large datasets where tasks are independent
        // They may add overhead for simple tasks or small datasets

        //Dependent tasks example
        // Cumulative sum using stream (getting correct result)
        // [1,2,3,4,5] --> [1,3,6,10,15] 15=1+2+3+4+5
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        int sum=0;
//       List<Integer> cumulativeSumList = numbers.stream().map(x -> {
//            return  sum+= x; // Variable used in lambda expression should be final or effectively final
//        }).toList();

        //final Variable--> A variable declared as final cannot be reassigned after its initial assignment.

        // Effectively Final Variable --> A variable is effectively final if it is not explicitly declared
        // as final, but its value does not change after it is initialized.

        AtomicInteger sum =new AtomicInteger(0);
        List<Integer> cumulativeSumList = numbers.stream().map(x->sum.addAndGet(x)).toList();
        System.out.println("Expected cumulative sum : [1, 3, 6, 10, 15]");
        System.out.println("Result with stream "+cumulativeSumList);

        // Cumulative sum using parallelStream (getting incorrect result as operation is dependent on other element)
        AtomicInteger sum2 = new AtomicInteger(0);
        List<Integer> cumulativeSumList2 = numbers.parallelStream().map(x->sum2.addAndGet(x)).toList();
        System.out.println("Result with parallelStream "+cumulativeSumList2);

//         sequential() --> This method is used to convert a parallel stream back to a sequential one.
//        Why Sequential is Required:
//        In parallel streams, the order of processing is not guaranteed, which could lead to an incorrect order when concatenating the strings.
//        By converting the stream to sequential after the parallel processing, we ensure that the concatenation respects the original list's order, which is crucial in this case.
        factorialsList = list.parallelStream().map(ParallelStreamDemo::factorial).sequential().toList();
    }



    static long factorial(int n){
        long fact = 1;
        for(int i=2;i<=n;i++)
            fact=fact*i;
        return fact;
    }
    static BigInteger BigFactorial(int n){
        BigInteger fact = new BigInteger("1");
        for(int i=2;i<=n;i++)
            fact=fact.multiply(new BigInteger(String.valueOf(i)));
        return fact;
    }
}
