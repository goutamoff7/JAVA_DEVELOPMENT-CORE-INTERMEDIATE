package exceptionHandling;
//Finally Block executes first then catch block returned value (with Exception)

public class Exception_finallyBlock_returnStatement2 {
	public static int method() {
		try {
			System.out.println("try block executed");
			System.out.println(10 / 0);
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
