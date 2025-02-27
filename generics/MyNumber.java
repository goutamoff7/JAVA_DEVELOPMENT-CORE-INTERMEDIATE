
// This is a class which will be used as type - T for creating object of BoundedBox2 class
public class MyNumber extends Number implements Printable{

    private final int value;

    public MyNumber(int value){
        this.value=value;
    }

    @Override
    public void print() {
        System.out.println("MyNumber : "+value);
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}
