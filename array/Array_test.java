package array;
class Array_test
{
	public static void main(String a[])
	{
		int k;
		int ar1[]={3,4,5}; //declaring of array "ar1" and initilization is done
		int ar2[]=new int[]{7,8,9}; ////declaring of array "ar1" and initilization is done
		
		int ar3[];// only declaring of array "ar3"
		ar3=new int[5]; //allocating memory for the array "ar3" of 5 integer
		
		for(k=0;k<ar3.length;k++)//inserting values in array "ar3"
			ar3[k]=k;

		for(int i=0;i<ar1.length;i++)
		      System.out.print(ar1[i]+" ");
		
		System.out.println();

		for(int j=0;j<ar2.length;j++)
			System.out.print(ar2[j]+" ");
		
		System.out.println();

		for(k=0;k<ar3.length;k++)

			System.out.print(ar3[k]+" ");
		
	}
}