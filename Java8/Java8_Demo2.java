import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.*;

class MobilePhone{
    String name;
    MobilePhone(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "name='" + name + '\'' +
                '}';
    }
}

//    class Task implements Runnable{
//
//        @Override
//        public void run() {
//            System.out.println("Hello");
//        }
//    }

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class Java8_Demo2 {
    public static void main(String[] args) {
        // Streams
        // java 8 --> minimal code, functional programming
        // java 8 -->   lambda expression, Streams, Date and Time API

        // lambda expression
        // lambda expression is an anonymous function ( no name, no return type, no access modifier )

        Thread t1 = new Thread(() -> System.out.println("Hello"));
        t1.start();

        MathOperation sumOperation = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        System.out.println(sumOperation.operate(10, 15));
//                  or use
//        MathOperation addition = Integer::sum;
//                  or use
        MathOperation addition = (a, b) -> a + b;
        System.out.println(addition.operate(10, 15));

        MathOperation subtraction = (a, b) -> a - b;
        System.out.println(subtraction.operate(10, 15));

        // Predicate --> Functional Interface (Boolean valued Function)

        Predicate<Integer> predicate = new Predicate<>() {
            @Override
            public boolean test(Integer x) {
                return x % 2 == 0;
            }
        };
        System.out.println(predicate.test(15));
//                              or use

        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(15));

        Predicate<String> isStartsWithR = x -> x.toUpperCase().startsWith("R");
        Predicate<String> isEndsWithM = x -> x.toUpperCase().endsWith("M");
        Predicate<String> check = isStartsWithR.and(isEndsWithM.negate());

        System.out.println(check.test("Ram"));
        System.out.println(check.test("Rohan"));

        // Function --> Functional Interface
        Function<Double, Double> doubleIt = x -> (double) (x * 2);
        Function<Double, Double> sqrt = x -> Math.pow(x, 0.5);

//            Function<T, R> firstFunction
//            Function<R, U> secondFunction
//            Function<T, U> combined = firstFunction.andThen(secondFunction);
//
//            compose: The second function's output must match the first function's input.//
//            Function<V, T> secondFunction
//            Function<T, R> firstFunction
//            Function<V, R> combined = firstFunction.compose(secondFunction);`

        Function<Double, Double> doubleItAndSqrt = doubleIt.andThen(sqrt);
        Function<Double, Double> sqrtAndDoubleIt = doubleIt.compose(sqrt);

        System.out.println("doubleItAndSqrt = " + doubleItAndSqrt.apply(10.0));
        System.out.println("sqrtAndDoubleIt = " + sqrtAndDoubleIt.apply(10.0));

        Function<Integer, Integer> identity = Function.identity();
        System.out.println(identity.apply(50));

//          Consumer --> Functional Interface
        Consumer<Integer> print = System.out::println;
        print.accept(100);

        List<Integer> list = new ArrayList<>(Arrays.asList(5, 6, 7));
        Consumer<List<Integer>> printList = x -> {
            for (int num : x) {
                System.out.println(num);
            }
        };
        printList.accept(list);

        Consumer<String> greet = x -> System.out.println("Hello " + x);
        Consumer<String> farewell = x -> System.out.println("Goodbye " + x);
        Consumer<String> combined = greet.andThen(farewell);

        combined.accept("Goutam");

//      Supplier --> Functional Interface
        Supplier<String> printHello = () -> "Hello Learners";
        System.out.println(printHello.get());

        Supplier<Integer> random1 = () -> (int) (Math.random() * 9000) + 1000;
        System.out.println(random1.get());

        Supplier<Integer> random2 = () -> new Random().nextInt(9000) + 1000;
        System.out.println(random2.get());

//        combined Example

        Supplier<Integer> supplier = () -> (int) (Math.random() * 90) + 10;
        Predicate<Integer> checkEven = x -> x % 2 == 0;
        Function<Integer, Integer> makeDouble = x -> x * 2;
        Consumer<Integer> consumer = x -> System.out.println("Consumer Accepts " + x);

//        if supplied value is even then consumer will accept the double of the supplied value
        int value =supplier.get();
        System.out.println("Supplied Value = "+value);
        if (checkEven.test(value))
            consumer.accept(makeDouble.apply(value));
        else
            System.out.println("Consumer will not accept " + value);

//        BiPredicate, BiFunction, BiConsumer

        BiPredicate<Integer, Double> isSumEven = (x, y) -> (x + y) % 2 == 0;
        System.out.println(isSumEven.test(2, 5.0));

        BiFunction<Integer, Float, Double> average = (x, y) -> (double) (x + y) / 2;
        System.out.println(average.apply(2, 5.0f));

        BiConsumer<Integer, Double> consume = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };
        consume.accept(5,2.0);

        //    UnaryOperator --> extends Function, used When type of input and type of result are same
        UnaryOperator<Integer> fun1 = x->x*2;
        System.out.println(fun1.apply(10));

//        BinaryOperator --> extends BiFunction, used When type of both inputs and type of result are same
        BinaryOperator<Integer> fun2=(x,y)->x*y;
        System.out.println(fun2.apply(5,2));

//        Method reference --> use method without invoking and use in place of lambda expression
        List<String> student = Arrays.asList("Goutam","Arpan","Manojit");
        student.forEach(x-> System.out.println(x));
        student.forEach(System.out::println); // :: --> Method reference

//        Constructor reference
        List<String> name = Arrays.asList("Apple","Vivo","Samsung");

        List<MobilePhone> mobilePhoneList = new ArrayList<>();
        for(String x:name){
            mobilePhoneList.add(new MobilePhone(x));
        }
        System.out.println(mobilePhoneList);

//        or use constructor reference
        List<MobilePhone> mobilePhoneList1 = name.stream().map(MobilePhone::new).toList();
        System.out.println(mobilePhoneList1);
    }
}


