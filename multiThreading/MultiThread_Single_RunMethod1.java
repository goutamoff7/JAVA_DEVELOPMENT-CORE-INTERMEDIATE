package multiThreading;
import java.util.Scanner;

class MyThread extends Thread
{
    public void calculator1()
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter First Number : ");
        int a =sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b =sc.nextInt();
        System.out.println("Result : "+(a+b)); 
        sc.close();      
    }

    public void messagePrint1()
    {
        try
        {
            System.out.println("Practice Multi-Threading-1");
            System.out.println("Practice Multi-Threading-2");
            Thread.sleep(3000);
            System.out.println("Practice Multi-Threading-3");
            System.out.println("Practice Multi-Threading-4");
            System.out.println("Practice Multi-Threading-5");
        }
        catch(InterruptedException e)
        {
            System.out.println("No issue , Just Sleep");
        }
    }
    public void run()
    {
        String name = Thread.currentThread().getName(); 
       if(name.equals("calc")) 
        calculator1();
       else
        messagePrint1(); 
    }
}
class MultiThread_Single_RunMethod1
{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("calc");
        t2.setName("mPrint");

        t1.start();
        t2.start();
    }
}