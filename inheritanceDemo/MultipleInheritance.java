package inheritanceDemo;

class A_in2
{
    void msg()
    {
        System.out.println("Hello");
    }
}
class B_in2
{
    void msg()
    {
        System.out.println("Welcome");
    }
}
class MultipleInheritance extends A_in2,B_in2 //Multiple Inheritance not allowed directly through classes
{
        public static void main(String[] args)
        {
            MultipleInheritance obj = new MultipleInheritance();
            obj.msg();            
        }
}
