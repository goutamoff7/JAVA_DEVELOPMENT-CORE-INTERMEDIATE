
class Parent {
	int a, b;

	public Parent() {
		System.out.println("Parent class Constructor");
	}

	public Parent(int x, int y) {
		System.out.println("parameterized Parent  class Constructor");
		a = x;
		b = y;
	}

	{
		System.out.println("This is Parent Instance Block");
	}
}

class Child extends Parent {
	int m, n;

	public Child() {
		this(10, 20);
		System.out.println("Child class Constructor");
	}

	public Child(int x, int y) {
		// super();
		System.out.println("parameterized child class Constructor");
		m = x;
		n = y;
	}

	{
		System.out.println("This is Child Instance Block");
	}
}

public class Constructor_InstanceBlock_ExecutionInheritance {
	public static void main(String[] args) {

		Child ob1 = new Child();

		System.out.println();

		Child ob2 = new Child(10, 20);
	}

}
