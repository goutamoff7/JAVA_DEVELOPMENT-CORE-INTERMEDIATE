package inheritanceDemo;

//Multilevel Inheritance
import java.util.Scanner;

class A
{
	int a;
	Scanner read = new Scanner(System.in);
	void enterValue_A()
	{
		System.out.print("Enter 1st Number: ");
		a=read.nextInt();
	}
}

class B extends A
{
	int b;
	void enterValue_B()
	{
		System.out.print("Enter 2nd Number: ");
		b=read.nextInt();
	}
}
class C extends B
{
	void findGreater()
	{
		System.out.println((a>b?a:b)+" is greater");
	}
}

class MultiLevelInheritanceExample
{
	public static void main(String[] args) {
		C ob=new C();
		ob.enterValue_A();
		ob.enterValue_B();
		ob.findGreater();
	}
}