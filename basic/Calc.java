package basic;

import java.io.*;
import java.util.Scanner;
class Calc
{
	Calc(int a,int b,int c)
	{
		int s;
		int avg;
		s=a+b+c;
		avg=(a+b+c)/3;
		System.out.println("Summation= "+s);
		System.out.println("Average= "+avg);
	}
	public static void main (String args[])
	{
		int a,b,c;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter Three Number: ");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		Calc ob = new Calc(a,b,c);
		new Calc(a,b,c);
	}
}
