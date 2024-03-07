package exceptionHandling;
class Exception_nested_try_catch_case1 {
	public static void main(String[] args) {
		System.out.println("Enter main method");
		try {
			System.out.println("Enter outer try block");
			System.out.println("Hello outer try");
			try {
				System.out.println("Enter inner try block");
				System.out.println("Hello inner try");

			} catch (ArithmeticException e) {
				System.out.println("Divide by Zero Exception in inner try");
			} finally {
				System.out.println("Exit inner finally ");
			}
			System.out.println("Exit outer try block");
		} catch (Exception e) {
			System.out.println("Divide by Zero Exception in outer try");

		} finally {
			System.out.println("Exit outer finally ");
		}
		System.out.println("Exit main method");
	}

}
