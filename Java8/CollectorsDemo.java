import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class CollectorsDemo {
    public static void main(String[] args) {

        // Collectors is a utility class
        // provides a set of methods to create common collectors
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        List<String> res = names; // reference copied
        res.add("Henry");
        System.out.println(res);
        System.out.println(names);

        // 1. Collecting to a List
        List<String> list = names.stream().collect(Collectors.toList());
        list.add("Michel");
        System.out.println(list);
        System.out.println(names);

        // 2. Collecting to a Set
        List<Integer> nums = Stream.of(1, 2, 1, 3, 2, 4, 5, 6, 6).toList();
        Set<Integer> set = nums.stream().collect(Collectors.toSet());
        System.out.println(set);

        // 3. Collecting to a specific collection
        List<String> collectdLinkedList = names.stream()
                .collect(Collectors.toCollection(() -> new LinkedList<>()));
        System.out.println(collectdLinkedList);

        Set<String> collectedHashSet = names.stream()
                .collect(Collectors.toCollection(() -> new HashSet<>()));
        System.out.println(collectedHashSet);

        // 4. Joining Strings
        // concatenates String elements into a single String
        String concatenatedNames = names.stream().map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.println(concatenatedNames);

        // 5. Summarizing Data
        // Generates statistical summary (count, sum, min, max, average)
        List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11);
        System.out.println(numbers);
        IntSummaryStatistics stats = numbers.stream()
                .collect(Collectors.summarizingInt(x -> x));
        System.out.println(stats);
        System.out.println("Count : " + stats.getCount());
        System.out.println("Average : " + stats.getAverage());
        System.out.println("Sum : " + stats.getSum());
        System.out.println("Max : " + stats.getMax());
        System.out.println("Min : " + stats.getMin());


        // 6. Counting elements
        Long count = numbers.stream()
                .collect(Collectors.counting());
        System.out.println("Count : " + count);

        // 7. Calculating Average
        Double average = numbers.stream()
                .collect(Collectors.averagingInt(x -> x));
        System.out.println("Average : " + average);

        // 8. Calculating Sum
        Integer sum = numbers.stream()
                .collect(Collectors.summingInt(x -> x));
        System.out.println("Sum : " + sum);

        // 9. Calculating Max
        Optional<Integer> optionalMax = numbers.stream()
                .collect(Collectors.maxBy((a, b) -> a - b));
        System.out.println("Max : " + optionalMax.get());

        // 10. Calculating Min
        Optional<Integer> optionalMin = numbers.stream()
                .collect(Collectors.minBy((a, b) -> a - b));
        System.out.println("Min : " + optionalMin.get());

        // 11. Grouping elements
        List<String> words = Arrays
                .asList("Hello", "World", "Java", "Streams", "Collecting");

        // Signature 1: only grouping function (on which basis groups are created)
        Map<Integer, List<String>> groupByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Group By Length : " + groupByLength);

        // Signature 2: grouping function, after grouping what needs to be done
        Map<Integer, String> groupByLength2 = words.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.joining(", "))
                );
        System.out.println(groupByLength2);

        // length of words in the group = Number of words in each group
        // 5 = 2 means there are 2 words with length 5. (Hello and World)
        Map<Integer, Long> groupByLength3 = words.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.counting())
                );
        System.out.println(groupByLength3);

        // Signature 3: grouping function, store in any map, after grouping what needs to be done
        TreeMap<Integer, Long> groupByLength4 = words.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.counting())
                );
        System.out.println("TreeMap : " + groupByLength4);

        //
        HashMap<Integer, String> groupByLength5 = words.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        HashMap::new,
                        Collectors.joining(", "))
                );
        System.out.println("HashMap : " + groupByLength5);

        // 12. Partitioning elements
        // Partition elements into two groups (true and false) based on a predicate
        Integer[] num = {5, 3, 4, 9, 1, 2, 5, 7, 3, 6, 2, 0, 8};

        // Signature 1: using Predicate condition
        Map<Boolean, List<Integer>> evenCheck =
                Arrays.stream(num).collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(evenCheck);

        // Signature 2: using Predicate condition, after partitioning what needs to be done
        Map<Boolean, Long> evenCheck2 =
                Arrays.stream(num).collect(Collectors.partitioningBy(
                        x -> x % 2 == 0,
                        Collectors.counting())
                );
        System.out.println(evenCheck2);

        // 13. Mapping and collection
        // Applying a mapping function before collecting

        List<String> list1 = words.stream()
                .collect(Collectors.mapping(
                        String::toUpperCase,
                        Collectors.toList())
                );
        System.out.println(list1);

//         14. toMap() -- > keyMapper Function ,valueMapper Function
        // string = string.length
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println(fruits.stream()
                .collect(Collectors.toMap(
                        x -> x,
                        x -> x.length())));

        // Signature 2: keyMapper Function ,valueMapper Function, merger Function for duplicate
        // fruitsName = No. of Count
        // when apple comes once the Apple=1, after every time it comes new value added with the old value
        // the Apple = 2
        List<String> fruits2= Arrays.asList("Apple", "Banana","Apple", "Cherry", "Apple", "Banana","Mango" );
        System.out.println(fruits2.stream()
                .collect(Collectors.toMap(
                        k->k,
                        v->1,
                        (k,v)->k+v
                )));

        // Example 1: Collecting Names by Length
        List<String> nameList = Arrays.asList("Anna", "Bob", "Alexander", "Brian", "Alice");
        System.out.println(nameList.stream().collect(Collectors.groupingBy(String::length)));

        // Example 2: Counting word Occurrences
        String sentence = "hello world hello java world";
        System.out.println(Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(
                        x -> x,
                        Collectors.counting()))
        );

        // Example 3: Summing values in map
        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("orange", 15);
        Collection<Integer> values = items.values();
        System.out.println("Sum of items : " + values.stream().reduce((a, b) -> a + b).get());
        // or
        System.out.println("Sum of items : " + values.stream().collect(Collectors.summingInt(x -> x)));

        // Example 5: Create a map from stream elements based on square
        // number = number * number
        Stream<Integer> integerStream = Stream.of(3, 4, 9, 1, 5, 7, 6, 2, 0, 8);
        System.out.println(integerStream
                .collect(Collectors.toMap(
                        x -> x,
                        x -> x * x
                )));


    }
}
