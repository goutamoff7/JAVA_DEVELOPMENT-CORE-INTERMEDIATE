package constructorOverloading;
class Test {
	Test(double d) {
		System.out.println("double argument constructor");
	}
	Test(int i) {
		
		this(10.5); // calling double argument constructor
		System.out.println("int argument constructor");
	}

	Test() {
		this(10); // calling int argument construc
		System.out.println("no argument constructor");
	}

}
public class ConstructorOverloading_Chaining {
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test(10);
		Test t3 = new Test(10.5);
	}
}