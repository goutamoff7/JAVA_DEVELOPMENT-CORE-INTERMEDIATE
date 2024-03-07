package pattern;
import java.util.Scanner;
public class Ptrn7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the range: ");
		int n=sc.nextInt();
		int A=65;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
				System.out.print(" ");
			for(int k=0;k<=i;k++)
				System.out.print((char)(A+k)+" ");
			System.out.println();
		}
	}
}

