import java.io.*;
import java.util.Scanner;
import java.lang.*;
class String_array_srt2
{
	public static void main(String args[])
	{
		String ar[]=new String[]{"Rabi","Asit","Devi","Kabi"};  // or String ar[]={"Rabi","Asit","Devi","Kabi"};
		String s;
		int n=ar.length;
		for(int i=0;i<n-1;i++)  // bubble sort method
		{
			for(int k=0;k<n-1-i;k++)
			{
				if(ar[k].toLowerCase().charAt(0)>ar[k+1].toLowerCase().charAt(0))
				{
					s=ar[k];
					ar[k]=ar[k+1];
					ar[k+1]=s;
				}
			}
		}
		for(int j=0;j<n;j++)
			System.out.print(ar[j]+" ");
			
	}
}