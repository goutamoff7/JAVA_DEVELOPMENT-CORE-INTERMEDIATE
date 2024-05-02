package multiThreading;

class MyThread extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+" - MyThread");
    }
}
public class CreateThread_ExtendThread_Demo1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" - MainThread");
        MyThread t = new MyThread();
        t.start();
    }
}
