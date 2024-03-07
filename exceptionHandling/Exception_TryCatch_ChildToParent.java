class Exception_TryCatch_ChildToParent {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Exception caught by catch block for Arithmetic Exception");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Exception caught by catch block for Exception");
		}
	}
}