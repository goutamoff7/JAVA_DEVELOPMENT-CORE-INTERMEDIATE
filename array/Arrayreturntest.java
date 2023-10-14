import java.io.*;
class Arrayreturntest
{
	static int[] get(){return new int[]{10,20,30,40,50};}
	public static void main(String a[])
	{
		int ar[]=get();
		for(int i=0;i<ar.length;i++)
			System.out.println(ar[i]);
	}
}