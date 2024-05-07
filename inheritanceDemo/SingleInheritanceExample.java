package inheritanceDemo;

//Single inheritance
import java.util.Scanner;

class A_in3
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

class B_in3 extends A_in3
{
	void findGreater()
	{
		System.out.println((a>b?a:b)+" is greater");
	}
}

class SingleInheritanceExample
{
	public static void main(String[] args) {
		B_in3 ob=new B_in3();
		ob.enterValue();
		ob.findGreater();
	}
}