package exceptionHandling;
import java.util.Scanner;

class ExceptionHandlingExample8 extends Exception
{
    public static void main(String[] args) 
    {
        Scanner read = new Scanner(System.in);
        try
        {
                System.out.print("Enter 1st value: ");
                int a=read.nextInt();
                System.out.print("Enter 2nd value: ");
                int b=read.nextInt();
                    try
                    {
                        int result= a/b; 
                        System.out.println("Result = "+result);
                        System.out.print("Enter a Number: ");
                        int c=read.nextInt();
                        System.out.println("Entered number = "+c);                        
                    }
                    catch(ArithmeticException e)
                    {
                        System.out.println("Enter 2nd value greater than 0"+e);
                    }
                    catch(Exception e)
                    {
                        System.out.println("Enter a number not a character "+e);
                    }       
        }
            catch(Throwable e)
            {
                System.out.println("Enter 1st and 2nd Number not a character "+e);
            }      
    }
}