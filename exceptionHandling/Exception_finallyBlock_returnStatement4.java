package exceptionHandling;
//Finally Block overrides the value returned by catch blocks (With Exception)

public class Exception_finallyBlock_returnStatement4 {
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
			return 20;
		}
	}

	public static void main(String[] args) {
		System.out.println(method());
	}

}
