// This is a Interface which will be used as type - T for creating object of BoundedBox3 class
public class PrintableImpl implements Printable {
    private final int value;
    public PrintableImpl(int value){
        this.value=value;
    }
    @Override
    public void print() {
        System.out.println("Printable Number : "+value);
    }
}
