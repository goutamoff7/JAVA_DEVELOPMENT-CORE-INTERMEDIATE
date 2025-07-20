package interfaceDemo;
interface Calculator
{    
    static  void add()
    {
        
        System.out.println(10+20);
    }

    default void sub()
    {
        printInfo();
        System.out.println(10-20);
    }

    default void mul()
    {
        printInfo();
        System.out.println(10*20);
    }

    default void div()
    {
        printInfo();
        System.out.println(10/20);
    }

    private void printInfo()
    {
        System.out.println("This is an Interface Method");
        System.out.println("This Method enhances Functionality");
        System.out.println("This Method performs Calculation");
    }
}

class Casio implements Calculator
{

}
public class PrivateInterfaceMethods
{
    public static void main(String[] args) {
        Casio cs = new Casio();
        Calculator.add();
        cs.sub();
        cs.mul();
        cs.div();
    }
}
