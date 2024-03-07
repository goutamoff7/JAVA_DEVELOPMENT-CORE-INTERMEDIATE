package pattern;
import java.util.Scanner;
class Ptrn3B
{
    public static void main(String[] args) 
    {
        System.out.print("Enter the Range:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0)
            n++;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i<=n/2+1)
                {
                    if(i==1 || i+j==n+1 || i==j)
                        System.out.print(" * ");
                    else
                        System.out.print("   ");
                }
            }
            System.out.println();
        }
        
    }
}
