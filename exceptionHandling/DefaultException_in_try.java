class DefaultException_in_try {
	public static void main(String[] args) {
		System.out.println("Enter main method");
		try {
			System.out.println("Enter try block");
			System.out.println(10 / 0);
			System.out.println("Exit try block");
		} catch (ArithmeticException e) {
			System.out.println("Enter catch block");
			System.out.println("Exit catch block");
		} finally {
			System.out.println("Enter finally block");
			System.out.println("Exit finally block");
		}
		System.out.println("Exit main method ");

	}
}