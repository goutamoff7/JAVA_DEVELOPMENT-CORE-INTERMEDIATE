class Exception_tryCatch_UnChecked {
	public static void main(String[] args) {
		try {
			System.out.println("Hello");
		} catch (RuntimeException e) {
		}
	}
}
// If there is no chance of exception then we can't write catch block
// for that exception, applicable for fully Checked Exception only.
// Here RuntimeException class (unchecked Exception) is not belongs to fully Checked Exception,
// hence, no compilation error arise.