// Bounded Generics Type
//  BoundedBox2 can hold only those type of object which extends Number class
//  and implements Printable interface (user defined interface)
// Note: If the type T only implements any interface then also we have to use
// extends keyword to bound
public class BoundedBox2<T extends Number & Printable> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {

        BoundedBox3<MyNumber> boundedBox3 = new BoundedBox3<>();
        MyNumber myNumber = new MyNumber(50);
        boundedBox3.setValue(myNumber);
        System.out.println(boundedBox3.getValue().intValue());
        System.out.println(boundedBox3.getValue().longValue());
        System.out.println(boundedBox3.getValue().floatValue());
        System.out.println(boundedBox3.getValue().doubleValue());
        boundedBox3.getValue().print();
        myNumber.print();


    }
}

