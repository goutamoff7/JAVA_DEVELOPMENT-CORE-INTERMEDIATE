import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");

        Stream<String> filteredStream = names.stream().filter(x -> {
            System.out.println("Filtering : " + x);
            return x.length() > 3;
        });

        System.out.println("Before Terminal Operation");

        List<String> result = filteredStream.toList();
        System.out.println("After Terminal Operation");
        System.out.println("Result "+result);
    }
}
