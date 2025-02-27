public class GenericConstructor {
// Generic type constructor Syntax
//    public <<Type>> ClassName(Type argument)
    public <T extends Number & Printable> GenericConstructor(T value){
        value.print();
        System.out.println(value.doubleValue());
    }

    public static void main(String[] args) {
        GenericConstructor genericConstructor = new GenericConstructor(new MyNumber(20));
    }

}

/*
Type Erasure Version of GenericConstructor
At compile-time, Java removes the generic type parameters and
replaces them with their upper bounds.

Erased Version (After Type Erasure)
public class GenericConstructor {
    // Type Erasure: T -> Number (first bound)
    public GenericConstructor(Number value) {
        ((Printable) value).print(); // Explicit cast to Printable required
        System.out.println(value.doubleValue()); // Number method remains unchanged
    }

    public static void main(String[] args) {
        GenericConstructor genericConstructor = new GenericConstructor(new MyNumber(20));
    }
}

 */

