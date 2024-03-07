package staticKeywordDemo;
public class StaticMethod {

	public static void method()
	{
		System.out.println("Method called without creating an object");
	}

	public static void main(String[] args) {
		method();
	}
}
