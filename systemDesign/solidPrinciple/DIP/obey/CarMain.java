package systemDesign.solidPrinciple.DIP.obey;

class Car
{
    public void drive()
    {
        System.out.println("Driving car....");
    }
}

class Driver
{
    Car car;
    public Driver() // Driver can't make new Car
    {
        this.car = new Car();
    }
    public void driveCar()
    {
        car.drive();
    }
}
public class CarMain
{
    public static void main(String[] args)
    {
        Driver driver = new Driver();
        driver.driveCar();
    }
}
