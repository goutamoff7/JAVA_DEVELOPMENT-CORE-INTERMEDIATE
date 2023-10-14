//Single inheritance
import java.util.Scanner;
class A
{
	int a,b;
	Scanner read = new Scanner(System.in);
	void enterValue()
	{
		System.out.println("Enter two Number: ");
		a=read.nextInt();
		b=read.nextInt();
	}
}

class B extends A
{
	void findGreater()
	{
		System.out.println((a>b?a:b)+" is greater");
	}
}

class SingleInheritanceExample
{
	public static void main(String[] args) {
		B ob=new B();
		ob.enterValue();
		ob.findGreater();
	}
}