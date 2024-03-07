package exceptionHandling;
public class Exception_Two_tryCatch {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Divide by Zero error");
		}
		try {
			System.out.println(args[0]);
		} finally {
			System.out.println("Command line argument should be passed");
		}
	}
}
