package exceptionHandling;
//Finally Block executes first then try block returned value (No Exception)

public class Exception_finallyBlock_returnStatement1 {
	public static int method() {
		try {
			System.out.println("try block executed");
			return 5;
		} catch (Exception e) {
			System.out.println("catch block executed");
			return 10;
		} finally {
			System.out.println("finally block executed");
		}
	}
	public static void main(String[] args) {
		System.out.println(method());
	}

}
