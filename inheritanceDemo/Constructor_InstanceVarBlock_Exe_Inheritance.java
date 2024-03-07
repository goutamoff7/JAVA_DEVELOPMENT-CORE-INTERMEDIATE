package inheritanceDemo;
class Parent {
	int x = 10;
	{
		m1();
		System.out.println("Parent first instance Block");
	}

	Parent() {
		System.out.println("Parent class Constructor");
	}

	public void m1() {
		System.out.println(x);
		System.out.println(y);
	}

	int y = 20;
}

class Child extends Parent {
	int i = 100;
	{
		m2();
		System.out.println("Child first instance Block");
	}

	Child() {
		System.out.println("Child class Constructor");
	}

	public void m2() {
		System.out.println(i);
		System.out.println(j);
	}

	int j = 200;
}

public class Constructor_InstanceVarBlock_Exe_Inheritance {
	public static void main(String[] args) {
		Child c = new Child();
	}
}
