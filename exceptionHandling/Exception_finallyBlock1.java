package exceptionHandling;
//Finally Block - if there is no exception
public class Exception_finallyBlock1 {
	public static void main(String[] args) {
		try { // System.out.println("try block executed");
		} catch (Exception e) {
			System.out.println("catch block executed");
		} finally {
			System.out.println("finally block executed");
		}
	}

}
