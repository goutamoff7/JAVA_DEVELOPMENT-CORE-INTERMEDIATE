package streamAPI;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Comparator;

public class StreamAPI_OtherMethods {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(list);

        // Optional<T> reduce(BinaryOperator<T> accumulator) method : Example-1
        Stream<Integer> str = list.stream();                
        Optional<Integer> sum1 = str.reduce((i,j)->i+j);        
        System.out.println("Summation of Element = "+sum1);
        System.out.println("Summation of Element = "+sum1.get());

        // Optional<T> reduce(BinaryOperator<T> accumulator) method : Example-2
        String ar[] = {"Computer","Science","Engineering"};
        Stream<String> str2 = Arrays.stream(ar);                
        Optional<String> combined = str2.reduce((i,j)->i+" "+j);        
        System.out.println(combined.get());

        // T reduce(T identity, BinaryOperator<T> accumulator) method
        Stream<Integer> str1 = list.stream();                
        int sum2 = str1.reduce(100,(i,j)->i+j);  // 100 is added to the summation of elements      
        System.out.println("Summation of Element = "+sum2);
        

        // long count() method
        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> str3 = list2.stream();
        System.out.println("No. of Element = "+str3.count());

        // Object[] toArray() method and Arrays.toString(Object[] a) method
        Stream<Integer> str4 = list2.stream();
        Object ar2[] = str4.toArray();
        System.out.println(Arrays.toString(ar2));
        
        List<Integer> list3 = Arrays.asList(5,67,16,95,10);
       //Optional<T> max(Comparator<? super T> comparator) method with compareTo() method of Integer class
        Stream<Integer> str5 = list3.stream();
        Optional<Integer> maxElement = str5.max((n1, n2) -> n1.compareTo(n2));  
        System.out.println("Largest Element : "+maxElement.get());

        //Optional<T> min(Comparator<? super T> comparator) method with Integer.compare() method of Integer class
        Stream<Integer> str6 = list3.stream();
        Optional<Integer> minElement = str6.min((n1, n2) -> Integer.compare(n1,n2)); 
        System.out.println("Smallest Element : "+minElement.get());


        List<Integer> numbers = Arrays.asList(3, 50, 10, 41, 12);

        //Optional<T> max(Comparator<? super T> comparator) method with static method Comparator.naturalOrder()
        Optional<Integer> maxNumber = numbers.stream().max(Comparator.naturalOrder());
        System.out.println("Largest Element : "+maxNumber.get());

        //Optional<T> min(Comparator<? super T> comparator) method with static method Comparator.naturalOrder()
        Optional<Integer> minNumber = numbers.stream().min(Comparator.naturalOrder());
        System.out.println("Smallest Element : "+minNumber.get());


         //public static<T> Stream<T> of(T... values) method
        Stream str7 = Stream.of("Goutam",5,10.5f,13.6,'c',true);
        str7.forEach(n->System.out.print(n+", "));

        System.out.println();

        Integer ar3[]={3, 51, 1, 41, 12};
        Stream<Integer> str8 = Stream.of(ar3);
        str8.forEach(n->System.out.print(n+", "));

        System.out.println();
       
        Double ar4[]={34.5, 51.6, 10.4, 41.2, 12.3};
        Stream<Double> str9 = Stream.of(ar4);
        str9.forEach(System.out::println);

        //<R, A> R collect(Collector<? super T, A, R> collector) method
        Stream<Integer> str10 = numbers.stream();
        Set<Integer> evenNumbers = str10.filter(x -> x % 2 == 0).collect(Collectors.toSet());
        System.out.println(evenNumbers);




    }
    
}
