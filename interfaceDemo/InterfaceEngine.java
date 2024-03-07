package interfaceDemo;
interface Engine
{
    void speedLimit();
    void fuelType();
    void engineCapacity(); 
}

class Bike implements Engine
{
    public void speedLimit()
    {
       System.out.println("Max Speed Limit of Bike Engine is 200 km/hr"); 
    }
    public void fuelType()       
    {
        System.out.println("Bike Engine runs on Petrol");
    }
    public void engineCapacity()
    {
        System.out.println("Engine capacity of Bike : 1000 CC");
    } 
}

class Car implements Engine
{
    public void speedLimit()
    {
       System.out.println("Max Speed Limit of car Engine is 300 km/hr"); 
    }
    public void fuelType()       
    {
        System.out.println("Car Engine can run on both Petrol and Deisel");
    }
    public void engineCapacity()
    {
        System.out.println("Engine capacity of Car : 5000 CC");
    } 
}

class Train implements Engine
{
    public void speedLimit()
    {
       System.out.println("Max Speed Limit of Train Engine is 400 km/hr"); 
    }
    public void fuelType()       
    {
        System.out.println("Train Engine can run on both Electric and Deisel");
    }
    public void engineCapacity()
    {
        System.out.println("Engine capacity of Train : 10000 CC");
    } 
}


public class InterfaceEngine
{
    public static void main(String[] args) 
    {
        Bike b=new Bike();
        Car c=new Car();
        Train t=new Train();
        b.speedLimit();
        b.fuelType();
        b.engineCapacity();
        System.out.println();
        c.speedLimit();
        c.fuelType();
        c.engineCapacity();
        System.out.println();
        t.speedLimit();
        t.fuelType();
        t.engineCapacity();
    }
}
