package basic;

class Base
{
 	public static void display()
  	{
		System.out.println("Class method from Base class");
	}
	public void prnt()
	{
		System.out.println("Non-Static method from Base class");
	
	}
	public static void main(String args[])
	{
		Base ob = new Base();
		ob.display();
		ob.prnt();
	}
}
