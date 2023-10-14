import java.io.*;
public class Ptrn1
{
	public static void main(String args[])throws IOException
	{
		int i,j,k,n;
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		System.out.print("Enter The Range: ");
		n=Integer.parseInt(in.readLine());
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
				System.out.print("   ");
			for(k=1;k<=i;k++)
				System.out.print(" * ");
			System.out.println();
		}		
	}
}
