interface AnimalHandling
{
    void food();
    void lifeSpan();    
}

class Dog implements AnimalHandling
{
    public void food()
    {
        System.out.println("Dogs eat Biscuit");
    }
    public void lifeSpan()
    {
        System.out.println("Dog's life span is about 8 to 10 years");
    }
}

class Bird implements AnimalHandling
{
    public void food()
    {
        System.out.println("Birds eat Grains");
    }
    public void lifeSpan()
    {
        System.out.println("Bird's Life Span is about 1 to 2 years ");
    }
}
public class InterfaceDemo
{
    public static void main(String[] args)
    {
        Dog d=new Dog();
        Bird b=new Bird();
        d.food();
        d.lifeSpan();
        b.food();
        b.lifeSpan();                
    }
    
}
