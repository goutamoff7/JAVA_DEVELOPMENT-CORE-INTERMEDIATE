package pattern;
import java.util.Scanner;
public class Ptrn5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the range: ");
		int n=sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
				System.out.print("1");
			for(j=1;j<=i;j++)
				System.out.print(i);
			System.out.println();
		}
	}
}

