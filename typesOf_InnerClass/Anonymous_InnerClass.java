interface A {
	void m1();

	void m2();
}

/*
 * If a interface has some methods
 * and a class which implements those method only once throughout the project
 * then there
 * is not a requirement for making a separate class we can use Anonymous Inner
 * class.
 * 
 * class B implements A{
 * public void m1()
 * {
 * System.out.println("Class B implements m1() method of interface 'A'");
 * }
 * public void m2()
 * {
 * System.out.println("Class B implements m2() method of interface 'A'");
 * }
 * }
 */
class Anonymous_InnerClass {
	public static void main(String[] args) {
		A ob = new A() { //
			public void m1() { // implementation of all methods of interface 'A'
								// through Anonymous class
								// new class file generated "Anonymous_InnerClass$1.class"
				// this implementation class is physically does not exists so JVM named it as
				// '1' .
				System.out.println("implements m1() method of interface 'A'");
			}

			public void m2() {
				System.out.println("implements m2() method of interface 'A'");
			}
		};
		ob.m1();
		ob.m2();
	}
}