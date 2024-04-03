package wrapperClass;

class Demo
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
class MethodOverloading_WrapperClass1
{
public static void main(String[] args)
    {
    Demo d = new Demo();
    int a = 10;
    d.disp(a);
    }
}

