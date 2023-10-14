//AVERAGE OF 3 VARIABLE (LOCAL,STATIC,INSTANCE)
import java.io.*;
class Avg_3VAR
{
	int a=40;
	static int b=20;
	Avg_3VAR(int a)
	{
		int d=(this.a+b+a)/3;
		System.out.println("Average="+d);
	}
	public static void main(String args[])throws IOException
	{
		new Avg_3VAR(50);

	}
}