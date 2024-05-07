package interfaceDemo;
interface A2 {
	void m();
}

interface B2 {
	void m();
}

class Child2 implements A2, B2 {
	public void m() {
		System.out.println("child implements method m of A & B");
	}
	// public void m() //no need to implement both method
	// as they have same signature and return type.
	// {
	// }
}

class Interface_MethodNamingConflict_case1 {
	public static void main(String[] args) {
		A2 ob1 = new Child2();
		ob1.m();
		B2 ob2 = new Child2();
		ob2.m();
		Child2 ob3 = new Child2();
		ob3.m();
	}
}
