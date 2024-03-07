package basic;

import java.io.*;
public class Days
{
	public static void main(String args[])throws IOException
	{
		int a,b,c,y,d;
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		System.out.println("Enter Number of Days:");
		a=Integer.parseInt(in.readLine());
		y=a/365;
		b=a%365;
		c=b/30;
		d=b%30;
		System.out.println("The No. of Years= "+y);
		System.out.println("The No. of Months= "+c);
		System.out.println("The No. of Days= "+d);
	}
}
