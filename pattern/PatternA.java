import java.util.Scanner;
public class PatternA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 || j==(n-1)/2 && i>0 || i==(n-1)/2 && j<=(n-1)/2)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
