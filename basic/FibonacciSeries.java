import java.io.*;
import java.util.Scanner;
class FibonacciSeries
{
    public static void main(String[] args) 
    {
        int a=0,b=1,count=2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No of Fibonacci Terms Required:");
        int n=sc.nextInt();
	  System.out.print("Fibonacci Series:");
        System.out.print(a+" "+b+" ");
        while(count<n)
        {
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            count++;
        }
    }
}