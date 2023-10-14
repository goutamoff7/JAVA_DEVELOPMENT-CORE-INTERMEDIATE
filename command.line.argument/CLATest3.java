class CLATest3
{
	public static void main(String args[])
	{
		int n=5;
		int []ar=new int[5];
		for(int i=0;i<n;i++)
			ar[i]=Integer.parseInt(args[i]);
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int swap=ar[j+1];
					ar[j+1]=ar[j];
					ar[j]=swap;
				}
			}
		}
		for(int i=0;i<n;i++)
			System.out.println(ar[i]);
	}
}