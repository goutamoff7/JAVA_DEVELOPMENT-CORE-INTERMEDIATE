@FunctionalInterface
interface A {
	void m();
}

@FunctionalInterface
interface B {
	void m(int a);
}

@FunctionalInterface
interface C {
	void m(int a, int b);
}
/*
 * If a interface has only one abstract method (called Functional Interface)
 * and a class which implements those method only once throughout the project
 * then there
 * is not a requirement for making a separate class we can use Lambda Expression
 * 
 * class B implements A {
 * 
 * public void m1()
 * {
 * System.out.println("Class B implements m1() method of interface 'A'");
 * }
 * }
 */

class LambdaExp_FunctionalInterface {
	// implementation of the Single methods of interface 'A'
	// through Lambda Expression.
	// here Anonymous class file will not be generated
	public static void main(String[] args) {

		// no Parameter requires parenthesis "()"
		A obA1 = () -> System.out.println("implements m() method of interface 'A'");
		obA1.m();
		A obA2 = () -> // multiple statement requires curly brace and semi colon "{ };"
		{
			System.out.println("implements m() method of interface 'A' 1st ");
			System.out.println("implements m() method of interface 'A' 2nd ");
		};
		obA2.m();

		B obB1 = (a) -> System.out.println("implements m() method of interface 'B'");
		obB1.m(10);
		B obB2 = x -> System.out.println("implements m() method of interface 'B'");
		// for single parameter parenthesis are optional
		obB2.m(10);

		C obC = (x, y) -> System.out.println("implements m() method of interface 'C'");
		// for more than one parameter parenthesis are mandatory
		obC.m(10, 20);

	}
}