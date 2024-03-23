package multiThreading;

import java.util.Scanner;

class Demo
{

}
//If we need to extend Demo class in this approach (extending Thread class) it will not be possible because in java multiple inheritance is not allowed (at a time we can't extends more than one class)
class Calculator extends Thread
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

class Message extends Thread
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

public class CreateThread_ExtendThread_Demo2 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" - MainThread");
        Calculator t1 = new Calculator();
        Message t2 = new Message();
        t1.start();
        t2.start();

        //If we call run() method directly then the program will behave as a single threaded program because in this case Thread Controller doesn't has the control over those threads
        // t1.run(); 
        // t2.run();
        
    }
}
