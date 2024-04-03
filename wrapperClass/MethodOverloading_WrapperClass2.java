package wrapperClass;
class Demo2
{
    void disp(byte i)
    {
    System.out.println("byte");
    }
    void disp(int i) 
    {
    System.out.println("int");
    }
    void disp(float i) 
    {
    System.out.println("float");
    }
    void disp(double i) 
    {
    System.out.println("double");
    }
    void disp(Integer i) 
    {
    System.out.println("Integer");
    }
    void disp(Float i)
    {
    System.out.println("Float");
    }
    void disp(Double i)
    {
    System.out.println("Double");
    }
    void disp(Number i) 
    {
    System.out.println("Number");
    }
    void disp(Object i) 
    {
    System.out.println("Object");
    }
}
public class MethodOverloading_WrapperClass2 {
    public static void main(String[] args)
    {
        Demo2 d = new Demo2();
        Integer a = 10;
        d.disp(a);
    }
}
