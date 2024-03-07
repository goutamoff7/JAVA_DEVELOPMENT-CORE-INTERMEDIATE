package basic;

import java.io.*;
public class Esum
{
	public static void main(String args[])throws IOException
	{
		int i,d,sum=0,n;
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		System.out.print("Enter the Number :");
		n=Integer.parseInt(in.readLine());
		if(n>999 && n<=9999)
		{
			for(i=n;i>0;i/=10)
			{
				d=i%10;
				if(d%2==0)
				sum+=d;
			}
			if(sum==0)
				System.out.println("No Even Digit Found");
			else
				System.out.println("The Summation of the even Digit of the given Number= "+sum);
		}
		else
			System.out.println("Please Enter A Four Digit Number");
	}
}
