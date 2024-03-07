import java.io.IOException;

class Exception_tryCatch_fullyChecked2 {
	public static void main(String[] args) {
		try {
			System.out.println("Hello");
		} catch (IOException e) {
		}
	}
}
// If there is no chance of exception then we can't write catch block
// for that exception, applicable for fully Checked Exception only.
// CE: Unreachable catch block for IOException.
// CE:This exception is never thrown from the try statement body
// Here IOException class belongs to fully Checked Exception
// hence, compilation error arise.