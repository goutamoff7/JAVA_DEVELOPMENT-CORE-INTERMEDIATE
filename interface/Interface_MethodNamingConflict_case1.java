interface A {
	void m();
}

interface B {
	void m();
}

class Child implements A, B {
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
		A ob1 = new Child();
		ob1.m();
		B ob2 = new Child();
		ob2.m();
		Child ob3 = new Child();
		ob3.m();
	}
}
