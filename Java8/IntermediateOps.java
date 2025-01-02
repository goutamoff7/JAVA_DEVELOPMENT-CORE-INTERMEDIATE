import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {
        // Intermediate operations transform a stream into another stream
        // They are Lazy, meaning they don't execute until a terminal operation is invoked

        // 1. filter()
        List<String> list = Arrays.asList("Laxman","Ram","Shyam","Bharat","Ram");
        Stream<String> filteredStream = list.stream().filter(x->x.endsWith("m"));
        // No Filtering occurs at this point
        long count = filteredStream.count();
        System.out.println("No of Names ends with 'm'= "+count);

        // 2. map()
        List<String> uppercaseNames = list.stream().map(String::toUpperCase).toList();
        System.out.println(uppercaseNames);

        // 3. sorted()
        List<String>  sorted = list.stream().sorted().toList();
        System.out.println(sorted);

        // custom sorting using comparator
        List<String> sortedByLength=list.stream().sorted((a, b) -> a.length() - b.length()).toList();
        System.out.println(sortedByLength);

        // 4. distinct()
        long m = list.stream().filter(x -> x.endsWith("m")).distinct().count();
        System.out.println(m);

        // 5. limit()
        List<Integer> list1 = Stream.iterate(1, x -> x + 1).limit(20).toList();
        System.out.println(list1);

        // 6. skip()
        List<Integer> list2 = Stream.iterate(1, x -> x + 1).skip(20).limit(40).toList();
        // first 20 elements are skipped
        System.out.println(list2);
    }


}
