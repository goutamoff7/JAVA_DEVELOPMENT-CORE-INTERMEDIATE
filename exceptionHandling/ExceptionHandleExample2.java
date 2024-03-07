package exceptionHandling;


class ExceptionHandleExample2
{
    public static void main(String[] args) 
    {
        try
        {
            // int a=10;
            // int b=a/0;
            // System.out.println("The value of c is"+b);
            int ab[]=new int[]{2,4,6,7,8};
            System.out.println("The sixth value of the array is"+ab[5]);
        }
        catch(ArithmeticException e)//This is for Known Exception
        {
            System.out.println("Enter Positive value Greater than 0");
        }
        catch(Exception d)//This is for Upcasting Mechanism
        {
            System.out.println("Not Identified Exception");
            d.printStackTrace();
        }
    }
}    

