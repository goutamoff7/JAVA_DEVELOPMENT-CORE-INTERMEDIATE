package multiThreading;
import java.util.Scanner;

class Demo
{
    
}
//If we need to extend Demo class in this approach (implementing Runnable interface) it is be possible
class Calculator extends Demo implements Runnable
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+" - Calculator");
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter First Number : ");
        int a =sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b =sc.nextInt();
        System.out.println("Result : "+(a+b));       

    }
}

class Message  implements Runnable

{
    public void run()
    {
        try
        {
            System.out.println(Thread.currentThread().getName()+" - Message");
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
}

public class CreateThread_ImplementsRunnable_Demo1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" - MainThread");
        Calculator cal = new Calculator();
        Message msg = new Message();

        Thread t1 = new Thread(cal);
        Thread t2 = new Thread(msg);
        t1.start();
        t2.start();
    }
}
