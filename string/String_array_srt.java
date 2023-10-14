import java.io.*;
import java.util.Scanner;
import java.lang.*;
class String_array_srt
{
	public static void main(String args[])
	{
		String ar[]={"rabi","asit","Devi","Kabi"};
		int n=ar.length;
		for(int i=0;i<n;i++)  // selection sort method
		{
			String s=ar[i];
			int pos=i;
			for(int k=i+1;k<n;k++)
			{
				if(s.toLowerCase().charAt(0)>ar[k].toLowerCase().charAt(0))
				{
					s=ar[k];
					pos=k;
				}
			}
			ar[pos]=ar[i];
			ar[i]=s;
		}
		for(int j=0;j<n;j++)
			System.out.print(ar[j]+" ");
			
	}
}