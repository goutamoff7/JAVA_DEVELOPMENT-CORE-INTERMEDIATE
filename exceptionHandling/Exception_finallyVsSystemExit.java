public class Exception_finallyVsSystemExit {
	public static void main(String[] args) {
		try {
			System.out.println("Inside try block");
			//System.out.println((10 / 0));
		} catch (Exception e) {
			System.out.println("Inside catch block");
			System.exit(0);
			System.out.println("After system.exit");
		} finally {
			System.out.println("Finally block");
		}

	}
}
