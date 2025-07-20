package enumDemo;

enum Laptop{   
    DELL(600), MACBOOK(2000), LENOVO, SURFACE(1500);

    int price;    

    // public constructor not allowed, Compilation error 
    // Enum constructors must be private.
    // Java enforces this so no outside class can create enum instances.

    Laptop(){
    System.out.println("Default Constructor: " + this.name());
    }

    Laptop(int price) {
        this.price = price;
        System.out.println("Parameterized Constructor: " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }
    
}

//behind the scene : 
/*
final class Laptop extends java.lang.Enum<Laptop> {
    public static final Laptop DELL = new Laptop("DELL", 0, 600);
    public static final Laptop MACBOOK = new Laptop("MACBOOK", 1, 2000);
    public static final Laptop LENOVO = new Laptop("LENOVO", 2);
    public static final Laptop SURFACE = new Laptop("SURFACE", 3, 1500);

    private int price;

    private Laptop(String name, int ordinal) {
        super(name, ordinal);
        System.out.println("Default Constructor: " + this.name());
    }

    private Laptop(String name, int ordinal, int price) {
        super(name, ordinal);
        this.price = price;
        System.out.println("Parameterized Constructor: " + this.name());
    }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public static Laptop[] values() {
        return new Laptop[] { DELL, MACBOOK, LENOVO, SURFACE };
    }

    public static Laptop valueOf(String name) {
        // implementation that returns the enum constant by name
    }
}

*/

public class Enum_Constructor2 {
    public static void main(String[] args) {

        Laptop.LENOVO.setPrice(500);

        Laptop[] laptops = Laptop.values(); 

        for(Laptop laptop : laptops){
            System.out.println(laptop + ": " + laptop.getPrice());
        }
    }
    
}
