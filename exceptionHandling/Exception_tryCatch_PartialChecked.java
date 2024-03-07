class Exception_tryCatch_PartialChecked {
	public static void main(String[] args) {
		try {
			System.out.println("Hello");
		} catch (Exception e) {
		}
	}
}
// If there is no chance of exception then we can't write catch block
// for that exception, applicable for fully Checked Exception only.
// Here Exception class(Partial checked Exception) is not belongs to fully
// Checked Exception,
// hence, no compilation error arise.