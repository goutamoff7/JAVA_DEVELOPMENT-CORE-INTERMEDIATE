package inheritanceDemo;

//Multilevel Inheritance
import java.util.Scanner;

class A_in
{
	int a;
	Scanner read = new Scanner(System.in);
	void enterValue_A()
	{
		System.out.print("Enter 1st Number: ");
		a=read.nextInt();
	}
}

class B_in extends A_in
{
	int b;
	void enterValue_B()
	{
		System.out.print("Enter 2nd Number: ");
		b=read.nextInt();
	}
}
class C_in extends B_in
{
	void findGreater()
	{
		System.out.println((a>b?a:b)+" is greater");
	}
}

class MultiLevelInheritanceExample
{
	public static void mA_in(String[] args) {
		C_in ob=new C_in();
		ob.enterValue_A();
		ob.enterValue_B();
		ob.findGreater();
	}
}