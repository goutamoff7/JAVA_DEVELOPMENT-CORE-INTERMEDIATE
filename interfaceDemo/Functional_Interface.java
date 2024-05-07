package interfaceDemo;

@FunctionalInterface
interface A1 {
	// void m();
	void m1();

	default void m2() {
		System.out.println("m2-A");
	}

	static void m3() {
		System.out.println("m3-A");
	}
}

class Child1 implements A1 {
	public void m1() {
		System.out.println("m1-child-Implements");
	}

}

public class Functional_Interface {
	public static void main(String[] args) {
		A1 ob = new Child1();
		ob.m1();
		ob.m2();
		A1.m3();
	}
}
