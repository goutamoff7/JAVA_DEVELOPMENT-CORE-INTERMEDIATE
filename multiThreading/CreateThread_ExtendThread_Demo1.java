package multiThreading;

class MyThread1 extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+" - MyThread1");
    }
}
public class CreateThread_ExtendThread_Demo1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" - MainThread");
        MyThread1 t = new MyThread1();
        t.start();
    }
}
