import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI_demo2 {
    public static void main(String[] args) {
        // Feature introduced in java 8
        // Process collections of data in a functional and declarative manner
        // Simplify data processing
        // Embrace Functional Programming
        // Improve readability and maintainability
        // Enable easy parallelism

        // How to use Streams?
        // A sequence of elements supporting functional and declarative programming
        // Source, intermediate operations and terminal operations

        List<Integer> numbers = Arrays.asList(1,3,6,7,8); // Source
//        Problem 1: Find the number of odd element in the list

//        Traditional Approach

        int count = 0;
        for(int n:numbers) {
            if (n % 2 != 0)
                count++;
        }
            System.out.println("No of Odd Element: "+count);

        // Using Streams
        System.out.println("No of Odd Element: "+numbers.stream().filter(x->x%2!=0).count());
        // source - converting numbers list to stream
        // intermediate Operation - filter
        // terminal operation - count

        // Creating Streams
        // 1. From collection
        List<Integer> list = Arrays.asList(1,3,6,7,8);
        Stream<Integer> stream = list.stream();
        // 2. From Arrays
        Integer[] array = {1,2,5,3};
        Stream<Integer> stream1 = Arrays.stream(array); // primitive type array not allowed
        // 3. Using Stream.of()
        Stream<String> ram = Stream.of("Ram","Shyam");
        // 4. Infinite Stream
        Stream<Integer> generate = Stream.generate(() -> 1).limit(100);
        generate.forEach(System.out::println);

        Stream<Integer> iterate = Stream.iterate(2,x -> x + 1).limit(200);
        iterate.forEach(System.out::println);


    }


}
