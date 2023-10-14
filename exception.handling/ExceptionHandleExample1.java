import java.util.Scanner;
class ExceptionHandleExample1
{
    public static void main(String args[])
    {
        try
        {
            Scanner ob=new Scanner(System.in);
            System.out.println("Enter the value for a:");
            int a=ob.nextInt();
            System.out.println("Enter the value for b:");
            int b=ob.nextInt();
            int c=a/b;
            System.out.println("c="+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Enter positive value Greater thean 0");
        }
        finally
        {
            System.out.println("Finally Block is always execultable block Remember it");
        }        
    }
}
