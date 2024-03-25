package multiThreading;

//car is a single instance resource and can be used by 3 Person (Thread)
//all of them can enter into the parking lot at a time but can't use/drive the car at a time
class Car2 implements Runnable
{
    public void run()
    {
        try
        {
            //all of them can enter into the parking lot at a time but can't use/drive the car at a time
            System.out.println(Thread.currentThread().getName()+" Entered into the Parking lot");
            Thread.sleep(2000);

            //synchronized block
            synchronized(this) 
            {
                System.out.println(Thread.currentThread().getName()+" Got the Car to Drive");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName()+" Started the Car");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName()+" Came back and parked the car"); 
            }           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}
public class Synchronized_Block {
   public static void main(String[] args) {
    Car2 c = new Car2();
    
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
