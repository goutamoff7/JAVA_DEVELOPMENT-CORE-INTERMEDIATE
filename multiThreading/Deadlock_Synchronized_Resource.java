package multiThreading;

class Library implements Runnable
{
    // Here Books act as resource 
    String book1 = "JAVA";
    String book2 = "SQL";
    String book3 = "LINUX";
    public void run()
    {
        String threadName = Thread.currentThread().getName();
        if(threadName.equals("student1"))  // Student-1 getting chance to use Resource
        {
           try
           {
                Thread.sleep(3000); // Student-1 Searching book in library 
                synchronized(book1) // Holding the resource-1
                {
                    System.out.println("Student-1 acquired "+book1);
                    Thread.sleep(3000); // Student-1 holding the Resource-1 and go to waiting state
                    synchronized(book2) // keeping the resource-1 and again try to Hold the resource-2
                    {
                        System.out.println("Student-1 acquired "+book2);
                        Thread.sleep(3000); // Student-1 holding the Resource-1,2 and go to waiting state
                        synchronized(book3) // keeping the resource-1,2 and again try to Hold the resource-3
                        {   
                        System.out.println("Student-1 acquired "+book3);
                        Thread.sleep(3000); // Student-1 holding the Resource-1,2,3 and go to waiting state                        
                        }
                    }                    
                }


           }
           catch(Exception e)
           {
                System.out.println(e);
           } 
        }
        else  // Student-2 getting chance to use Resource
        {
            try
           {
                Thread.sleep(3000); // Student-2 Searching book in library 
                synchronized(book3) // Holding the resource-3
                {
                    System.out.println("Student-2 acquired "+book3);
                    Thread.sleep(3000); // Student-2 holding the Resource-3 and go to waiting state
                    synchronized(book2) // keeping the resource-3 and again try to Hold the resource-2
                    {
                        System.out.println("Student-2 acquired "+book2);
                        Thread.sleep(3000); // Student-2 holding the Resource-3,2 and go to waiting state
                        synchronized(book1) // keeping the resource-3,2 and again try to Hold the resource-1
                        {   
                        System.out.println("Student-2 acquired "+book1);
                        Thread.sleep(3000); // Student-2 holding the Resource-3,2,1 and go to waiting state                        
                        }
                    }                    
                }


           }
           catch(Exception e)
           {
                System.out.println(e);
           }
        }
    }
}

public class Deadlock_Synchronized_Resource {
    public static void main(String[] args) {
        Library l = new Library();
        
        Thread s1 = new Thread(l);
        Thread s2 = new Thread(l);
 
        s1.setName("student1");
        s2.setName("student2");

        s1.start();
        s2.start();
    }
}
