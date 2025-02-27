// Box is a Generic type with 1 value
public class Box<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setValue(6);
        Integer value = box.getValue();
        System.out.println(value);
    }
}


/*
At compile-time, Java erases the generic type <T> and replaces it with its upper bound.
If no explicit bound is given, it defaults to Object. Here’s how your Box<T>
class will look after type erasure:

Type Erasure version

public class Box {
    private Object value; // T is erased to Object

    public Object getValue() { // T is erased to Object
        return value;
    }

    public void setValue(Object value) { // T is erased to Object
        this.value = value;
    }

    public static void main(String[] args) {
        Box box = new Box(); // Box<Integer> is erased to raw Box
        box.setValue(6); // Allowed, as 6 (int) is autoboxed to Integer (which is an Object)
        Integer value = (Integer) box.getValue(); // Explicit cast needed (unsafe)
        System.out.println(value);
    }
}

 */
