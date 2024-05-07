package interfaceDemo;
interface Computer8 {
	void compileCode();

	default void runCode() {
		System.out.println("Code is Running");
	}

	static void testingCode() {
		System.out.println("Testing the code before Deployment");
	}
}

class Laptop8 implements Computer8 {
	public void compileCode() {
		System.out.println("Laptop8 compiles code");
	}

	public void runCode() // It is optional to override a default method of an interface
	{
		System.out.println("Running code in Laptop8");
	}

	static void testingCode() // act as specialized static method of Laptop8 class
	{
		System.out.println("Testing the code before Deployment Laptop8");
	}
}

class Desktop8 implements Computer8 {
	public void compileCode() {
		System.out.println("Desktop8 compiles code faster");
	}
}

class Tablet8 implements Computer8 {
	public void compileCode() {
		System.out.println("Tablet8 Testing the codes");
	}
}

class Developer8 {
	void buildApp(Computer8 obj) {
		System.out.println("Building App");
		obj.compileCode();
		obj.runCode();
		Computer8.testingCode();
		System.out.println("-----------------------------");
	}
}

public class Java8Features_Interface {
	public static void main(String[] args) {
		Laptop8 l = new Laptop8();
		Desktop8 d = new Desktop8();
		Tablet8 t = new Tablet8();
		Developer8 de1 = new Developer8();
		de1.buildApp(l);
		Developer8 de2 = new Developer8();
		de2.buildApp(d);
		Developer8 de3 = new Developer8();
		de3.buildApp(t);

		Computer8.testingCode();
		Laptop8.testingCode();

	}
}
