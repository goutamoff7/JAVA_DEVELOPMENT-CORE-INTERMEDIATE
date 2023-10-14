
class ExceptionHandleExample4
{
    static int method1()
    {
        try
        {
            System.out.println("The Try Block is Executing");
            int a=10/0;
            return 1;//If no Exception occurs and finally block does not return 
                        //value will be returned by try
        }  
        catch(Exception e)
        {
            System.out.println("The catch Block is Executing");
            return 2; //If Exception occurs and finally block does not return any value
                    //value only then the value will be returned
        }

        finally
        {
            System.out.println("Final Block is Executing");
            return 3; //This Statement will finally return the value
        }
    }
    public static void main(String[] args)
    {
        ExceptionHandleExample4 ob=new ExceptionHandleExample4();
        int p=ob.method1();
        System.out.println(p);  
    }
}
