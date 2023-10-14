import java.io.*;
class Abc
{

	public static void main (int a, int b, int c)
	{
		int avg,s;
		s=a+b+c;
		avg=(a+b+c)/3;
		System.out.println("Summation= "+s);
		System.out.println("Average= "+avg);
		Abc ob = new Abc(12,15,7);
	}
}
