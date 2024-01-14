class Exception_tryCatch_fullyChecked1 {
	public static void main(String[] args) {
		try {
			System.out.println("Hello");
		} catch (InterruptedException e) {
		}
	}
}
// If there is no chance of exception then we can't write catch block
// for that exception, applicable for fully Checked Exception only.
// CE: Unreachable catch block for InterruptedException.
// CE:This exception is never thrown from the try statement body
// Here InterruptedException class belongs to fully Checked Exception
// hence, compilation error arise.