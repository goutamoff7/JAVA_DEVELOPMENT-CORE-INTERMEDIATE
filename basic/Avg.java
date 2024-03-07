package basic;
import java.io.*;
public class Avg
{
	public static void main(String args[])throws IOException
	{
		int a,b,c,avg;
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		System.out.println("Enter 3 Number :");
		a=Integer.parseInt(in.readLine());
		b=Integer.parseInt(in.readLine());
		c=Integer.parseInt(in.readLine());
		avg=(a+b+c)/3;
		System.out.println("The Average of Three Number= "+avg);
		
	}
}
