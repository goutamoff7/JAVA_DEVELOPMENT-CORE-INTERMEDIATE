package multiThreading;
import java.util.Scanner;

class MultiThreading implements Runnable
{
    public void calculator()
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter First Number : ");
        int a =sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b =sc.nextInt();
        System.out.println("Result : "+(a+b));       
    }

    public void messagePrint()
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
        calculator();
       else
        messagePrint(); 
    }
}
class MultiThread_Single_RunMethod2
{
    public static void main(String[] args) {
        MultiThreading m1 = new MultiThreading();
        MultiThreading m2 = new MultiThreading();
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);

        t1.setName("calc");
        t2.setName("mPrint");

        t1.start();
        t2.start();
    }
}