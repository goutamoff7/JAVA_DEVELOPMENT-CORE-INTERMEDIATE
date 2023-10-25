package abstractClass;

abstract class Parent4 {
	abstract public void m1();

	abstract public void m2();

	abstract public void m3();
}

abstract class Child4_A extends Parent4 {
	public void m1() {
		System.out.println("Child4_A implements Parent method m1");
	}
}

class Child4_B extends Child4_A {
	public void m2() {
		System.out.println("Child4_B implements Parent method m2");
	}

	public void m3() {
		System.out.println("Child4_B implements Parent method m3");
	}
}

public class AbstractClassExample4 {
	public static void main(String[] args) {
		Parent4 p = new Child4_B();
		p.m1();
		p.m2();
		p.m3();

	}
}
