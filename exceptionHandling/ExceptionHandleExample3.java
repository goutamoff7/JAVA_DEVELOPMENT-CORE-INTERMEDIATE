package exceptionHandling;
class ExceptionHandleExample3 extends Exception
{
    public static void main(String[] args)
    {
        try
        {
            int a=0/0;
            System.out.print(a);
        }
        catch(ArithmeticException ae)
        {
            ae.printStackTrace();
        }
        try
        {
            int a[]={2,4,7};
            System.out.println(a[3]);
        }
        catch(ArrayIndexOutOfBoundsException ao)
        {
            ao.printStackTrace();
        }
        try
        {
            String s="Rahim";
            if(s.length()>3)
            {
                throw new ExceptionHandleExample3();
            }
        }
        catch(ExceptionHandleExample3 m)
        {
            m.printStackTrace();
            System.out.println("The String length is Greater than 3");
        }
        
    }
    
}
