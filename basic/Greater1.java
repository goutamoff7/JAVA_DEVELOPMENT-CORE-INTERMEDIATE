package basic;

interface Abc
{
	int a=10,b=20,c=30;
	void Greater(int a,int b);
	void Greater(int a,int b,int c);
}
class Greater1 implements Abc
{
	public static void main(String args[])
	{
		Greater1 obj=new Greater1();
		obj.Greater(a,b);
		obj.Greater(a,b,c);
	}
	public void Greater(int a,int b)
	{
		if(a>b)
			System.out.println(a);
		else
			System.out.println(b);
	}
	public void Greater(int a,int b,int c)
	{
		if(a>b)
		{
			if(a>c)
				System.out.println(a);
			else
				System.out.println(b);
		}
		else
		{
			if(b>c)
				System.out.println(b);
			else
				System.out.println(c);
		}
	}
		
}