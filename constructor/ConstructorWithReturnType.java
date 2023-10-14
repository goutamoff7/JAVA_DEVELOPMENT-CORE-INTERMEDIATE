class Test {
	void Test() // JVM Treated this as method not constructor
	// as we have given return type
	{
		System.out.println("This is a method not Constructor");
	}

}

public class ConstructorWithReturnType {
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.Test();
	}
}
