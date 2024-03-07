package interfaceDemo;
interface Abc1
{
	int a=10,b=20,x=10;
}
class Rb implements Abc1
{
	public static void main(String agrs[])
	{
		System.out.println(x);
		if(a>b)
			System.out.println("THE GREATER ONE IS "+a);
		else
			System.out.println("THE GREATER ONE IS "+b);
	}
}