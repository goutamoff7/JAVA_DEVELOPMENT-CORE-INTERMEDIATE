package interfaceDemo;
@FunctionalInterface
interface Aa {
	void m();
}

@FunctionalInterface
interface Bb {
	int m(String a);
}

@FunctionalInterface
interface Cc {
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
		Aa obA1 = () -> System.out.println("implements m() method of interface 'Aa'");
		obA1.m();
		Aa obA2 = () -> // multiple statement requires curly brace and semi colon "{ };"
		{
			System.out.println("implements m() method of interface 'Aa' 1st ");
			System.out.println("implements m() method of interface 'Aa' 2nd ");
		};
		obA2.m();

		Bb obB1 = (a) -> {System.out.println("implements m() method of interface 'Bb' : "+a);return a.length();};
		obB1.m("G");
		Bb obB2 = x -> {System.out.println("implements m() method of interface 'Bb' : "+x);return x.length();};
		// for single parameter parenthesis are optional
		obB2.m("D");

		Cc obC1 = (x, y) -> System.out.println("implements m() method of interface 'Cc' "+x+" , "+y);
		// for more than one parameter parenthesis are mandatory, data type are optional
		obC1.m(10, 20);

		Cc obC2 = (int x, int y) -> System.out.println("implements m() method of interface 'Cc' "+x+" , "+y);
		// for more than one parameter parenthesis are mandatory, data type are optional
		obC2.m(30, 40);

	}
}