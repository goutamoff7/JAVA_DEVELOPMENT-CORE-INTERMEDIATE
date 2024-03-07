package interfaceDemo;
interface Computer {
	void compileCode();

	default void runCode() {
		System.out.println("Code is Running");
	}

	static void testingCode() {
		System.out.println("Testing the code before Deployment");
	}
}

class Laptop implements Computer {
	public void compileCode() {
		System.out.println("Laptop compiles code");
	}

	public void runCode() // It is optional to override a default method of an interface
	{
		System.out.println("Running code in Laptop");
	}

	static void testingCode() // act as specialized static method of Laptop class
	{
		System.out.println("Testing the code before Deployment Laptop");
	}
}

class Desktop implements Computer {
	public void compileCode() {
		System.out.println("Desktop compiles code faster");
	}
}

class Tablet implements Computer {
	public void compileCode() {
		System.out.println("Tablet Testing the codes");
	}
}

class Developer {
	void buildApp(Computer obj) {
		System.out.println("Building App");
		obj.compileCode();
		obj.runCode();
		Computer.testingCode();
		System.out.println("-----------------------------");
	}
}

public class Java8Features_Interface {
	public static void main(String[] args) {
		Laptop l = new Laptop();
		Desktop d = new Desktop();
		Tablet t = new Tablet();
		Developer de1 = new Developer();
		de1.buildApp(l);
		Developer de2 = new Developer();
		de2.buildApp(d);
		Developer de3 = new Developer();
		de3.buildApp(t);

		Computer.testingCode();
		Laptop.testingCode();

	}
}
