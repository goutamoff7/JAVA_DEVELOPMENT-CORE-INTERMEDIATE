package multiThreading;

//Car1 and Car2 are two instance resource and can be used by 3 Person (Thread)
class Car implements Runnable
{
    public void entered()
    {
        System.out.println(Thread.currentThread().getName()+" Entered into the Parking lot");
    }
    public static synchronized void useCar1() 
    {
        try
        {            
            System.out.println(Thread.currentThread().getName()+" Got the Car1 to Drive");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" Came back and parked the Car1");            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    public synchronized void useCar2() 
    {
        try
        {
            System.out.println(Thread.currentThread().getName()+" Got the Car2 to Drive");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" Came back and parked the Car2");            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }

    public void run()
    {
        entered();
        useCar1();
        useCar2();
    }
}
public class Synchronized_StaticMethod {
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
