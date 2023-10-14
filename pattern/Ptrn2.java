import java.io.*;
import java.util.Scanner;
public class Ptrn2
{
	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the range: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.println(i+""+j);

				
			}		
		}
	}
}

