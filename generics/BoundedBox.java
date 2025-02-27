// Bounded Generics Type
//  BoundedBox can hold only those type of object which extends Number class
public class BoundedBox<T extends Number> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        //    BoundedBox<String> StringBoundedBox = new BoundedBox<>(); Compilation error using String
        BoundedBox<Integer> integerBoundedBox = new BoundedBox<>();
        integerBoundedBox.setValue(50);
        System.out.println(integerBoundedBox.getValue());

        BoundedBox<Float> floatBoundedBox = new BoundedBox<>();
        floatBoundedBox.setValue(50.5f);
        System.out.println(floatBoundedBox.getValue());
    }
}

