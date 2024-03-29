package multiThreading;
class Daemon implements Runnable
{
    public void run()
    {
        if(Thread.currentThread().isDaemon())
            System.out.println("Daemon Thread");
        else
            System.out.println("Child Thread");
    }
}
class DaemonThread_Demo
{
    public static void main(String[] args) 
    {
        System.out.println("Main Thread");
        
        Daemon d1 = new Daemon();
        Thread t = new Thread(d1);

        t.setDaemon(true); 
        t.start(); 
         


    }
}