package basic;

import java.io.*;
public class Large
{
	public static void main(String args[])throws IOException
	{
		int a,b;
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		System.out.println("Enter 2 Number :");
		a=Integer.parseInt(in.readLine());
		b=Integer.parseInt(in.readLine());
		if(a>b)
		System.out.println("The value of "+a+" is Largest");
		else
		System.out.println("The value of "+b+" is Largest");
		
	}
}
