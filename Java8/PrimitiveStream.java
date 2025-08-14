import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStream {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(numbers);

        // range() --> 1 to 4
        IntStream rangeExclusive = IntStream.range(1, 5);
        // boxed() --> primitive to Wrapper class (convert to Stream)
        System.out.println(rangeExclusive.boxed().toList());

        // rangeClosed() --> 1 to 5
        IntStream rangeInclusive = IntStream.rangeClosed(1, 5);
        System.out.println(rangeInclusive.boxed().toList());

        // IntStream.of()
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6);
        System.out.println(intStream.boxed().toList());

        System.out.println(new Random().nextFloat());
        System.out.println(new Random().nextDouble());

        //Generating 5 random integer
        IntStream randomIntStream = new Random().ints(5);
//        System.out.println(randomIntStream.sum());
//        System.out.println(randomIntStream.average());
//        System.out.println(randomIntStream.max());
//        System.out.println(randomIntStream.min());
        System.out.println(randomIntStream.boxed().toList());

        //Generating 5 random double
        DoubleStream randomDoubleStream = new Random().doubles(5);
//        System.out.println(randomDoubleStream.sum());
//        System.out.println(randomDoubleStream.average());
//        System.out.println(randomDoubleStream.max());
//        System.out.println(randomDoubleStream.min());
        System.out.println(randomDoubleStream.boxed().toList());

        IntStream generatedIntStream = IntStream.iterate(1, x -> x + 1).skip(2).limit(10);
        System.out.println(generatedIntStream.boxed().toList());

        // Generates statistical summary (count, sum, min, max, average)
        int[] nums = {2, 3, 5, 7, 11};
        IntSummaryStatistics stats = Arrays.stream(nums).summaryStatistics();
        System.out.println(stats);
        System.out.println("Count : " + stats.getCount());
        System.out.println("Average : " + stats.getAverage());
        System.out.println("Sum : " + stats.getSum());
        System.out.println("Max : " + stats.getMax());
        System.out.println("Min : " + stats.getMin());

        // summaryStatistics() can be called by IntStream, LongStream, DoubleStream etc.
        // so Streams need to convert to IntStream, LongStream, DoubleStream etc. by using
        // mapToInt, mapToLong, mapToDouble etc.
        DoubleStream mapToDoubleStream = Stream.of(1, 2, 3, 4, 5).mapToDouble(x -> x);
        DoubleSummaryStatistics stats2 = mapToDoubleStream.summaryStatistics();
        System.out.println(stats);
        System.out.println("Count : " + stats2.getCount());
        System.out.println("Average : " + stats2.getAverage());
        System.out.println("Sum : " + stats2.getSum());
        System.out.println("Max : " + stats2.getMax());
        System.out.println("Min : " + stats2.getMin());

    }
}