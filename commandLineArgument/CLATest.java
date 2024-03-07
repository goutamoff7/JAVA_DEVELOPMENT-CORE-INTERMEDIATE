package commandLineArgument;
class CLATest
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		if(a>b)
			System.out.println(a+" is greater");
		else
			System.out.println(b+" is greater");
	}
}