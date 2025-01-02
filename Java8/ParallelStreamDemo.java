import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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
        System.out.println("total time required using parallelStream : "+(endTime-startTime));

        // parallelStream are more effective for CPU-intensive or large datasets where tasks are independent
        // They may add overhead for simple tasks or small datasets

        //Dependent tasks example
        // Cumulative sum
        // [1,2,3,4,5] --> [1,3,6,10,15] 15=1+2+3+4+5
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum=0;
       List<Integer> cumulativeSumList = numbers.stream().map(x -> {
            return sum = sum + x; // Variable used in lambda expression should be final or effectively final
        }).toList();
    }

    static long factorial(int n){
        long fact = 1;
        for(int i=2;i<=n;i++)
            fact=fact*i;
        return fact;
    }
}
