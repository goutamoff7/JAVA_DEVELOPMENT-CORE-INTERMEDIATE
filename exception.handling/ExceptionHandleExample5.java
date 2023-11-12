public class ExceptionHandleExample5
{
    public static void main(String[] args) 
    {
        try 
        {  
            int b=20/0;
            
        } 
        catch (Exception e) 
        {
            String s="Ram";
            System.out.println(s.charAt(3));
        }
        finally
        {
            int ar[]=new int[]{2,7,8};
            System.out.println("3rd Position value is "+ar[3]);
        }        
    }
}
