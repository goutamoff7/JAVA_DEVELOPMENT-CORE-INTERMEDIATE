package abstractClass;

abstract class Parent2 {
	public void m1() {
		System.out.println("Parent2 m1 method");
	}

	abstract public void m2();

	abstract public void m3();
}

class Child2 extends Parent2 {
	public void m2() {
		System.out.println("Parent2 method m2 implements by Child2");
	}

	public void m3() {
		System.out.println("Parent2 method m3 implements by Child2");
	}

	public void m4() {
		System.out.println("Child2 specialized method m4");
	}
}

public class AbstractClassExample2 {
	public static void main(String[] args) {
		Parent2 p = new Child2();
		p.m1();
		p.m2();
		p.m3();
		// p.m4();// child2 specialized method m4 can't access using parent2 type
		// reference
		((Child2) p).m4();// child2 specialized method m4 can access using parent2 type reference through
							// the help of DownCasting.
		Child2 c = new Child2();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
	}
}
