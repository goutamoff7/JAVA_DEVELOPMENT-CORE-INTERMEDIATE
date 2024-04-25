package interfaceDemo;
interface Calculator2
{
    static void add()
    {
        printInfo();
        System.out.println(10+20);
    }

    static void sub()
    {
        printInfo();
        System.out.println(10-20);
    }

    static void mul()
    {
        printInfo();
        System.out.println(10*20);
    }

    static void div()
    {
        printInfo();
        System.out.println(10/20);
    }

    private static void printInfo()
    {
        System.out.println("This is an Interface Method");
        System.out.println("This Method enhances Functionality");
        System.out.println("This Method performs Calculation");
    }
}
public class PrivateStaticInterfaceMethods
{
    public static void main(String[] args) {
        Calculator2.add();
        Calculator2.sub();
        Calculator2.mul();
        Calculator2.div();
    }
}
