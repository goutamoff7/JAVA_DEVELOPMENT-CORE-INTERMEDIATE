import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOps {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3);

        // 1. collect()
        list.stream().collect(Collectors.toList());
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
        System.out.println("Occurrence of character 'l' : "+ frequencyOfCharacter);

    }
}
