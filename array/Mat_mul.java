package array;
import java.util.Scanner;
class Mat_mul
{
	public static void main(String a[])
	{
		int sum=0,i,j,k;

		System.out.println("Enter the size of array: ");
		Scanner read=new Scanner(System.in);
		int size=read.nextInt();
		int ar1[][];//only declaring the array "ar1"
		ar1=new int[size][size];//after declaring "ar1" here allocating memory is done
		int ar2[][]=new int[size][size]; // both declaring and allocating memory is done 
		int ar3[][]=new int[size][size];
		System.out.println("Enter Element in First Array: ");
		for(i=0;i<size;i++)
		{
			for(j=0;j<size;j++)
				ar1[i][j]=read.nextInt();
		}
		System.out.println("Enter Element in Second Array: ");
		for(i=0;i<size;i++)
		{
			for(j=0;j<size;j++)
				ar2[i][j]=read.nextInt();
		}
		for(i=0;i<size;i++)
		{
			for(k=0;k<size;k++)
			{
				for(j=0;j<size;j++) 
					sum=sum+ar1[i][j]*ar2[j][k];
				ar3[i][k]=sum;
				sum=0;
			}
		}
		System.out.println("The Multiplication of the two matrix: ");
		for(i=0;i<size;i++)
		{
			for(j=0;j<size;j++)
				System.out.print(ar3[i][j]+" ");
			System.out.println();
		}
	}
}
