package abstractClass;

abstract class Car2
{
    void start()
    {
        System.out.println("Car is Starting");
    } 
    abstract void accelerate();
    abstract void drive();
    abstract void combustion();
    void stop()
    {
        System.out.println("Car is Stopping");
    }
} 

class Maruti800 extends Car2
{
    void accelerate()
    {
        System.out.println("Maruti800 accelerates at the speed of 120km/hr"  );
    }
    void drive()
    {
        System.out.println("Maruti800 has Manual gear system");
    }
    void combustion()
    {
        System.out.println("Maruti800 has a Petrol Engine");
    }
}

class Innova extends Car2
{
    void accelerate()
    {
        System.out.println("Innova accelerates at the speed of 180km/hr");
    }
    void drive()
    {
        System.out.println("Innova has Automatic gear system");
    }
    void combustion()
    {
        System.out.println("Innova has a Diesel Engine");
    }
}

class Ferrari extends Car2
{
    void accelerate()
    {
        System.out.println("Ferrari accelerates at the speed of 340km/hr");
    }
    void drive()
    {
        System.out.println("Innova has Turbo gear system");
    }
    void combustion()
    {
        System.out.println("Innova has a White-Petrol Engine");
    }
}

class Road
{
    void permit(Car2 c)
    {
        c.start();
        c.accelerate();
        c.drive();
        c.combustion();
        c.stop();
    }
}
public class CarAbstraction {
    public static void main(String[] args) {
        Maruti800 m = new Maruti800();
        Innova i = new Innova();
        Ferrari f = new Ferrari();

        Road r = new Road();
        r.permit(m);
        r.permit(i);
        r.permit(f);
    }
    
}
