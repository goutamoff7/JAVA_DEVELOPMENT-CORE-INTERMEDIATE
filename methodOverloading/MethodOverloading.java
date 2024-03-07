public class MethodOverloading {
    void method(int a)
    {
        System.out.println("int method: "+a);
    }

    void method(float a)
    {
        System.out.println("float method: "+a);
    }

    void method(double a)
    {
        System.out.println("double method: "+a);
    }
    public static void main(String[] args) {
        new MethodOverloading().method(10);
        new MethodOverloading().method(10.5f);
        new MethodOverloading().method(10.5);
    }
}
