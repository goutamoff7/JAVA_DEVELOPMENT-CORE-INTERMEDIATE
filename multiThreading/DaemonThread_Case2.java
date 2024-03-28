package multiThreading;
class Daemon2 implements Runnable
{
    public void run()
    {
        if(Thread.currentThread().isDaemon())
            System.out.println("Daemon Thread");
        else
            System.out.println("Child Thread");
    }
}
class DaemonThread_Case2
{
    public static void main(String[] args) 
    {
        Thread.currentThread().setDaemon(true); // can't set main thread as Deamon Thread cause java.lang.IllegalThreadStateException as the main thread has already been started by jvm
       System.out.println("Main Thread");
        
        Daemon2 d1 = new Daemon2();
        Thread t = new Thread(d1);
      
        t.setDaemon(true);
        t.start(); 


    }
}