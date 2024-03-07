package exceptionHandling;
//Demonstration for un-handled Exception
public class DefaultExceptionHandling1 {
	public static void main(String[] args) {
		System.out.println("Main Method Starts");
		int a = 10;
		int b = 0;
		System.out.println("a = " + a + " ,b = " + b);
		int res = a / b;
		System.out.println("Addition= " + res);
		System.out.println("Main Method Exit");
	}
}
