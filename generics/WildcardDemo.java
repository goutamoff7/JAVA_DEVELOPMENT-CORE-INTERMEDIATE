import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WildcardDemo {

    public static int sum(List<Integer> list) {
        return list.stream().reduce(0, Integer::sum);
    }

    // Upper Bound - any class which extends Number class can be used
//    also Number class itself is allowed --- read operation
    public static int sum1(List<? extends Number> list) {
        int sum = 0;
        for (Number number : list)
            sum += number.intValue();
        Number num = list.getFirst();
        list.add(null); // Allowed because null is a valid reference
//        list.add(5); // Compilation error: Cannot add because of unknown subtype
//        List<? extends Number> means that list can hold any subtype of
//        Number (Integer, int, Float, etc.).
//        However, since the exact type of ? is unknown
//        (it could be List<Integer>, List<int>, etc.),
//        Java prevents adding elements because adding an
//        Integer (5) to a List<int> would be unsafe.
//        You can only read from the list, not modify it.
        return sum;
    }

    // Lower Bound - any class which is Parent class of Number class can be used
    // also Number class itself is allowed  --- write operation
    public static int sum2(List<? super Number> list) {
        int sum = 0;
        for (Object object : list)
            sum += (int)object;
        list.add(5); // no error , as 5 is Integer (which extends Number)
//        Number num = list.get(0); // Compilation error - type safety issue
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(WildcardDemo.sum(new ArrayList<>(List.of(1, 2, 3, 4))));
        System.out.println(WildcardDemo.sum1(new ArrayList<>(List.of(1, 2, 3, 4))));
        System.out.println(WildcardDemo.sum2(new ArrayList<>(List.of(1, 2, 3, 4))));

    }
}

/*Conclusion :

Wildcard ? extends T allows reading (get() works) but prevents writing (add() fails except null).

Wildcard ? super T allows writing (add() works for T or subclasses) but makes get() unsafe.
*/

/*
Type Erased Version

import java.util.ArrayList;
import java.util.List;

public class WildcardDemo {

    public static int sum(List list) { // <Integer> is erased to raw List
        return list.stream().reduce(0, (a, b) -> (Integer) a + (Integer) b);
    }

    public static int sum1(List list) { // <? extends Number> is erased to raw List
        int sum = 0;
        for (Number number : (List<Number>) list) // Explicit cast needed
            sum += number.intValue();
        Number num = (Number) list.get(0); // Safe, as <? extends Number> ensures it's Number or a subclass
        list.add(null); // Allowed, as null is valid for any reference type
//        list.add(5); // Compilation error: Cannot add elements
        return sum;
    }

    public static int sum2(List list) { // <? super Number> is erased to raw List
        int sum = 0;
        for (Object object : list)
            sum += (int) object; // Potential runtime exception if object is not an Integer
        list.add(5); // Allowed, as 5 is Integer (which extends Number)
//        Number num = list.get(0); // Compilation error: Type safety issue
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(WildcardDemo.sum(new ArrayList<>(List.of(1, 2, 3, 4))));
        System.out.println(WildcardDemo.sum1(new ArrayList<>(List.of(1, 2, 3, 4))));
        System.out.println(WildcardDemo.sum2(new ArrayList<>(List.of(1, 2, 3, 4))));
    }
}


 */
