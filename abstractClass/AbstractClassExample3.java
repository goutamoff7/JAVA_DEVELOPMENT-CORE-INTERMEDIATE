package abstractClass;

abstract class Parent3 {
	Parent3() {
		System.out.println("Parent Constructor");
	}
}

class Child3 extends Parent3 {

	Child3() {
		System.out.println("Child Constructor");
	}
}

public class AbstractClassExample3 {
	public static void main(String[] args) {
		// new Parent3(); // an abstract class is an incomplete class, hence, it is not
		// possible to create Objects for it (CE: Cannot instantiate the type Parent3 )
		// but it is possible to provide constructor
		// in it.
		new Child3(); // Anonymous object

	}
}
