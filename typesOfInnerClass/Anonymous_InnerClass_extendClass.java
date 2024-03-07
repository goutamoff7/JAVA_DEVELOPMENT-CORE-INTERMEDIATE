class A {
	void m1() {
		System.out.println("method m1() of class A");
	}

	void m2() {
		System.out.println("method m2() of class A");
	}
}

/*
 * If a Parent class has some methods
 * and a Child class want to override those method only once throughout the
 * project
 * then there
 * is not a requirement for making a separate class we can use Anonymous Inner
 * class.
 * 
 * class B extends A {
 * public void m1() {
 * System.out.println("Class B override m1() method of class 'A'");
 * }
 * 
 * public void m2() {
 * System.out.println("Class B override m2() method of class 'A'");
 * }
 * }
 */

class Anonymous_InnerClass_extendClass {
	public static void main(String[] args) {
		A ob1 = new A() { //
			public void m1() { // override of all methods of class 'A'
								// through Anonymous class
								// new class file generated "Anonymous_InnerClass_extendClass$1.class"
				// this child class is physically does not exists so JVM named it as
				// '1' .
				System.out.println("Anonymous class override m1() method of class 'A'");
			}

			public void m2() {
				System.out.println("Anonymous class override m2() method of class 'A'");
			}
		};
		ob1.m1(); // ob1 is the reference variable of class A contains
		ob1.m2(); // the object of Anonumous class

		A ob2 = new A();
		ob2.m1();
		ob2.m2();
	}
}