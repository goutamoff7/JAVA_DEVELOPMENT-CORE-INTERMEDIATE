package pattern;
import java.util.Scanner;
public class Ptrn9 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the range:");
        int n=read.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>n-i;j--)
            {
                int p=1;
                for(int k=1;k<=i;k++)
                {
                    p=p*j;
                }
                System.out.print(" "+(p+i)+" ");
            }
            System.out.println();
        }

    }
}
