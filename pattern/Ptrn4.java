import java.io.*;
import java.util.Scanner;
public class Ptrn4
{
	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the range: ");
		int n=sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i%2!=0)
				{
					if(j%2!=0)
						System.out.print("1");
					else
						System.out.print("0");
				}
				else
				{
					if(j%2!=0)
						System.out.print("0");
					else
						System.out.print("1");
				}
			}
			System.out.println();
		}
	}
}

