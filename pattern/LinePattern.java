package pattern;
import java.util.Scanner;
class LinePattern
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range greater than 10:");
        int n = sc.nextInt();
        if(n%2==0)
            n++;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==0 || i==n-1 || j==n-1 || i==j || i+j==n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");             
            }

            System.out.print("  ");

            for(int j=0;j<n;j++)
            {
                if(i+j == (n-1)/2 || i-j == (n-1)/2 || j-i == (n-1)/2 || i+j==(n-1)/2*3 )
                    System.out.print("* ");
                else
                    System.out.print("  ");             
            }

            System.out.print("  ");

            for(int j=0;j<n;j++)
            {
                if(i==0 && j<=(n-1)/2 || j==0 && i<=(n-1)/2 || i+j<=(n-1)/2 ||
                    i==0 && j>(n-1)/2 || j==0 && i<=(n-1)/2 || j-i>=(n-1)/2 || 
                    j==0 && i>(n-1)/2 || i==n-1 && j<=(n-1)/2 || i-j>=(n-1)/2 ||
                    j==n-1 && i>(n-1)/2 || i==n-1 && j>(n-1)/2 || i+j>=(n-1)/2*3) 
                    System.out.print("* ");
                else
                    System.out.print("  ");             
            }  

            System.out.println();
        }
        
    }
}