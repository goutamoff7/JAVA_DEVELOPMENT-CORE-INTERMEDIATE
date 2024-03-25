package multiThreading;

//car is a single instance resource and can be used by 3 Person (Thread)
class Car implements Runnable
{
    synchronized public void run() //check with and without synchronized keyword
    {
        try
        {
            System.out.println(Thread.currentThread().getName()+" Entered into the Parking lot");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" Got the Car to Drive");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" Started the Car");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" Came back and parked the car");            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}
public class Synchronized_Method {
   public static void main(String[] args) {
    Car c = new Car();
    
    Thread s1 = new Thread(c);
    Thread s2 = new Thread(c);
    Thread s3 = new Thread(c);

    s1.setName("Son-1");
    s2.setName("Son-2");
    s3.setName("Son-3");

    s1.start();
    s2.start();
    s3.start();
   } 
}
