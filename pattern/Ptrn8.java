package pattern;
import java.util.Scanner;
public class Ptrn8
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the range: ");
		int n=sc.nextInt();
		int A=64,i,j,k;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
				System.out.print(" ");
			for(k=-1;k<=i*2-1;k++)
			{
				if(k==1 || k==i*2-1)
					System.out.print((char)(A+i)+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for(i=n-1;i>=1;i--)
		{
			for(j=1;j<=n-i;j++)
				System.out.print(" ");
			for(k=-1;k<=i*2-1;k++)
			{
				if(k==1 || k==i*2-1)
					System.out.print((char)(A+i)+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

