class DefaultHandler_handles_NullPointerException {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println(20 / 0);
		} finally {
			String s = null;
			System.out.println(s.length());
		}
		System.out.println("Hello");

	}
}