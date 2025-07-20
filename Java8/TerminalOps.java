import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class TerminalOps {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3);

        // 1. collect()
        list.stream().collect(toList());
        list.stream().toList();

        // 2. forEach()
        list.stream().forEach(x -> System.out.println(x));

        // 3. reduce() : Combines elements to produce a single result
        Optional<Integer> optionalInteger = list.stream().reduce((x, y) -> x + y);
        System.out.println("Sum of elements = " + optionalInteger.get());
        Integer sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Sum of elements = " + sum);

        // 4. count()
        long count = list.stream().count();
        System.out.println("No of Elements : " + count);

        // 5. anyMatch(), allMatch(), noneMatch()
        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println("Is there any even number : " + b);

        boolean b1 = list.stream().allMatch(x -> x > 1);
        System.out.println("Is all the elements are greater than 1 : " + b1);

        boolean b2 = list.stream().noneMatch(x -> x < 0);
        System.out.println("Not all the elements are less than 0 : " + b2);

        // 6. findFirst(), findAny()
        Optional<Integer> first = list.stream().findFirst();
        System.out.println("First Element : " + first);

        Optional<Integer> any = list.stream().findAny();
        System.out.println("Any element : " + any);

        // 7. toArray()
        Object[] array = Stream.of(1, 2, 3).toArray();

        // 8. min(), max()
        System.out.println("min : " + Stream.of(58, 46, 97, 12).min(Comparator.naturalOrder()));
        System.out.println("max : " + Stream.of(58, 46, 97, 12).max(Comparator.naturalOrder()));
        System.out.println("min : " + Stream.of(58, 46, 97, 12)
                .min((o1, o2) -> o1 - o2)); // ascending order 1st value = min
        System.out.println("max : " + Stream.of(58, 46, 97, 12)
                .min((o1, o2) -> o2 - o1)); // descending order 1st value = max
        // for (o1,o2) order
        // Negative (o1 - o2 < 0): No swap (o1 is less than o2).
        //Zero (o1 - o2 == 0): No swap (o1 is equal to o2).
        //Positive (o1 - o2 > 0): Swap (o1 is greater than o2).

        // 8. flatMap()
        // Handles the stream of collections, list or arrays where each element is itself a collection
        // Flatten nested structures (e.g., lists within lists) so that they can be processed
        // as a single sequence of elements
        // Transform and flatten elements at the same time.
        List<List<String>> listOfList = Arrays.asList(
                Arrays.asList("Apple", "Banana"),
                Arrays.asList("Mango", "Guava"),
                Arrays.asList("Pineapple", "Lemon")
        );
        System.out.println(listOfList);
        // Getting Pineapple
        System.out.println(listOfList.get(2).get(0));
        // flatten the list and make uppercase
        System.out.println(listOfList.stream()
                .flatMap(x -> x.stream())
                .map(String::toUpperCase)
                .toList());
        System.out.println(listOfList.stream()
                .flatMap(Collection::stream)
                .map(String::toUpperCase)
                .toList());

        //Example : take each word of the sentence and make single list with all uppercase letter
        List<String> sentences = Arrays.asList(
                "Hello World",
                "Java Streams are powerful",
                "flatMap is useful");
        System.out.println(sentences);
        List<String> list1 = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .map(String::toUpperCase)
                .toList();
        System.out.println(list1);

        // 9. forEachOrdered() --> used for parallel stream to maintain the order
        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("forEach() with parallel stream : ");
        list3.parallelStream().forEach(System.out::println);
        System.out.println("forEachOrdered() with parallel stream : ");
        list3.parallelStream().forEachOrdered(System.out::println);

        // Examples
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");

        // Question 1: Find the names whose length is greater than 3.
        System.out.println("Names whose length is greater than 3 :" + names.stream().filter(x -> x.length() > 3).toList());

        // Question 2: Square and sort the given numbers
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 6);
        System.out.println(numbers.stream().map(x -> x * x).sorted().toList());

        // Question 3: Sum all the values
        System.out.println(numbers.stream().reduce(0, (x, y) -> x + y));

        // Question 4: Counting occurrence of a character 'l'
        String sentence = "Hello World";
        long frequencyOfCharacter = sentence.chars().filter(x -> x == 'l').count();
        System.out.println("Occurrence of character 'l' : " + frequencyOfCharacter);

        //  Streams cannot be reused after a terminal operation has been called
        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);
//     List<String> list2 = stream.map(String::toUpperCase).toList();
        // Exception: stream has already been operated

        // Question 4: list of cubes from 1 to 30
        Stream.iterate(1, x -> x + 1)
                .limit(30)
                .map(x -> {
                    int y=x*x*x;
                    System.out.println(x+"^3="+y);
                    return y;
                }).toList();

    }
}
