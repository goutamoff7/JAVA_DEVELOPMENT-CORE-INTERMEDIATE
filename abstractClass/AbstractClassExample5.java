package abstractClass;

class Parent5 // concrete class
{
	public void m1() {
		System.out.println("Parent method m1");
	}
}

abstract class Child5_A extends Parent5 // abstract class Child5_A extends concrete class Parent5
{
	abstract public void m2();
}

class Child5_B extends Child5_A // concrete class Child5_B extends abstract class Child5_A
{
	public void m2() {
		System.out.println("Child5_B implements Child5_A method m2");
	}

	public void m3() {
		System.out.println("Child5_B specialized method m3");
	}
}

public class AbstractClassExample5 {
	public static void main(String[] args) {
		Child5_B cb = new Child5_B();
		cb.m1();
		cb.m2();
		cb.m3();

	}
}
