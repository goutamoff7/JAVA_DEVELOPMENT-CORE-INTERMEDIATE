package multiThreading;
class Daemon3 implements Runnable
{
    public void run()
    {
        if(Thread.currentThread().isDaemon())
            System.out.println("Daemon Thread");
        else
            System.out.println("Child Thread");
    }
}
class DaemonThread_Case3
{
    public static void main(String[] args) 
    {   
       //If the thread (here main Thread) has no job to execute then to whom the Daemon thread will provide service? in this case we will not get output 
        
        Daemon3 d1 = new Daemon3();
        Thread t = new Thread(d1);
      
        t.setDaemon(true);
        t.start(); 


    }
}