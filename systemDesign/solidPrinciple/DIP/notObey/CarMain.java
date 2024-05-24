package systemDesign.solidPrinciple.DIP.notObey;
interface Vehicle
{
    void drive();
}
class Car implements Vehicle
{
    @Override
    public void drive()
    {
        System.out.println("Driving car....");
    }
}

class Driver
{
    Vehicle vehicle;
    public Driver(Vehicle vehicle)
    // new vehicle has given to each driver
    {
        this.vehicle = vehicle;
    }
    public void driveCar()
    {
        vehicle.drive();
    }
}
public class CarMain
{
    public static void main(String[] args)
    {
        Vehicle car = new Car();
        Driver driver = new Driver(car);
        driver.driveCar();
    }
}
