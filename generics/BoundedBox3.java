class BoundedBox3<T extends Printable> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        BoundedBox3<PrintableImpl> boundedBox3 = new BoundedBox3<>();
        PrintableImpl printableImpl = new PrintableImpl(30);
        boundedBox3.setValue(printableImpl);
        boundedBox3.getValue().print();
        printableImpl.print();
    }

}

/*
Type Erasure of BoundedBox3<T extends Printable>
At compile-time, Java removes generic type parameters and replaces
them with their upper bounds.
Since T is bounded by Printable, it gets erased to Printable.

Erased Version (After Type Erasure)

class BoundedBox3 {
    private Printable value; // T is erased to Printable

    public Printable getValue() { // T is erased to Printable
        return value;
    }

    public void setValue(Printable value) { // T is erased to Printable
        this.value = value;
    }

    public static void main(String[] args) {
        BoundedBox3 boundedBox3 = new BoundedBox3(); // Raw type after erasure
        PrintableImpl printableImpl = new PrintableImpl(30);
        boundedBox3.setValue(printableImpl);
        boundedBox3.getValue().print(); // No cast needed, since getValue() returns Printable
        printableImpl.print();
    }
}

 */
