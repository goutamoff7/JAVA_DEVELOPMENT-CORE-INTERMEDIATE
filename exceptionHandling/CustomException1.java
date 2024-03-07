package exceptionHandling;
public class CustomException1 extends RuntimeException {
	public static void main(String[] args) throws CustomException1 {
	}
}
// if CustomException1 class does not extend Throwable class or any sub class of
// it like RuntimeException
// class the we cant use throws CustomException1 it will cause
// Compilation error:No exception of type CustomException1 can be thrown;
// an exception type must be a subclass of ThrowableJava(16777536)