public class CustomException4 {
	public static void main(String[] args) {
		throw new Error();
	}
}
// No compilation error as Error belongs to unchecked Exception type.
// But here ir shows Runtime Exception as we are creating an object or Error
// class and throw
// it to the jvm and jvm pass it to the Default Exception Handler and it prints
// the
// Exception Object Description.