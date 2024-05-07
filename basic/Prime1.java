package basic;

import java.util.*;
interface Abc1
{
	int n=7;
      void prime();
}
class Prime1 implements Abc1
{
		public void prime()
		{
			int flag=0;
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					System.out.println("non prime");
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println("prime");
		}
		public static void main(String agrs[])
		{
			Prime1 ob=new Prime1();
			ob.prime();
		}
}
			