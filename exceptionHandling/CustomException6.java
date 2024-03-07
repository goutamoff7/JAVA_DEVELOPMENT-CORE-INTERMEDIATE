package exceptionHandling;
class CustomException6{
	public static void main(String[] args) {
		throw new ArithmeticException();
		System.out.println("Hello"); // this statement is unreachable
		
	}
}