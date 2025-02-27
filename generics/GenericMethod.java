import java.util.Arrays;
import java.util.List;

public class GenericMethod {

    // Generic method syntax
    // public <<Type>> <returnType> methodName(Type argument)
    public <T> void printArray(T[] array) {
        for (T element : array)
            System.out.print(element + ", ");
        System.out.println();
    }

    public <K extends String, V extends Number> void printKeyValue(K key, V value) {
        System.out.println("key : value :: "+key+" : "+value);
    }

    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        Integer[] ar = {1, 2, 3, 4, 5};
        genericMethod.printArray(ar);
        String[] str = {"Hello", "World"};
        genericMethod.printArray(str);

        genericMethod.printKeyValue("Age",27);
//        genericMethod.printKeyValue(27,"Age"); error
    }
}

/*
Type Erasure Version of GenericMethod
At compile-time, Java removes generic type parameters,
replacing them with their upper bounds or Object (if no bound is specified).
Here's how the code looks after type erasure:

Erased Version of GenericMethod
public class GenericMethod {

    // Type Erasure of printArray(T[] array)
    public void printArray(Object[] array) { // T is erased to Object
        for (Object element : array)
            System.out.print(element + ", ");
        System.out.println();
    }

    // Type Erasure of printKeyValue(K key, V value)
    public void printKeyValue(String key, Number value) { // K -> String, V -> Number
        System.out.println("key : value :: " + key + " : " + value);
    }

    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();

        Integer[] ar = {1, 2, 3, 4, 5};
        genericMethod.printArray(ar); // Works because Integer[] can be treated as Object[]

        String[] str = {"Hello", "World"};
        genericMethod.printArray(str); // Works because String[] can be treated as Object[]

        genericMethod.printKeyValue("Age", 27); // Works, since "Age" is String, 27 is Number

        // genericMethod.printKeyValue(27, "Age");
        // ERROR: First argument must be a String, second must be a Number
    }
}


 */
