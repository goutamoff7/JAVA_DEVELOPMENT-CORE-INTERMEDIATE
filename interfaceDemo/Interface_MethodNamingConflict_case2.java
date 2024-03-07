package interfaceDemo;
interface A {
	void m();
}

interface B {
	void m(int x);
}

class Child implements A, B {
	public void m() {
		System.out.println("child implements method m() of A");
	}

	public void m(int x) {
		System.out.println("child implements method m(int) of B : " + x);
	}
}

class Interface_MethodNamingConflict_case2 {
	public static void main(String[] args) {
		A ob1 = new Child();
		ob1.m();
		B ob2 = new Child();
		ob2.m(10);
		Child ob3 = new Child();
		ob3.m();
		ob3.m(10);
	}
}
