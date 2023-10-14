import java.util.Scanner;
public class ExceptionHandleExample6 extends Exception
{
       public static void main(String[] args)
       {
            while(true)
            {
                try 
                {
                    Scanner in = new Scanner(System.in);
                    System.out.print("Enter a Value:");
                    int b=in.nextInt();
                    if(b>10)
                    {
                        throw new ExceptionHandleExample6();
                    }    
                    System.out.println("The value you have entered is "+b);
                    System.out.println("Best of Luck");
                    break;
                } catch (Exception e) 
                {
                    System.out.println("Please Enter the value less than equal to 10");
                    System.out.println("Try again");
                }
            }      
       }
}
