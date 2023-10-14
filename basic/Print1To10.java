public class Print1To10 
{
    public static void main(String[] args)
    {
        int i=1;
        for(;i<=10;i++)
            System.out.print(i+" ");
        
        System.out.println();        
        
        i=1;
        while(i<=10)
        {
            System.out.print(i+" ");
            i++;
        }

        System.out.println();        
        
        int j=1;
        do
        {
            System.out.print(j+" ");
            j++;
        }while(j<=10);
    }
    
}
