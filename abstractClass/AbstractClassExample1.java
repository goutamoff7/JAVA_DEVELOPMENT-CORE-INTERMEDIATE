package abstractClass;
/*class Parent {
	public void m() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	@Override
	public void m()
	{
		System.out.println("Child Method");
	}
}

class AbstractClassExample {
	public static void main(String[] args) {
		Parent p = new Child();
		p.m();
	}
}*/

//Convertion of the above Example to below one

abstract class Parent1 {
	// abstract int a=10; // CE: Illegal modifier for the field a
	abstract public void m();
}

class Child1 extends Parent1 {

	public void m() {
		System.out.println("Child Method");
	}
}

public class AbstractClassExample1 {
	public static void main(String[] args) {
		Parent1 p = new Child1();
		p.m();
	}
}
