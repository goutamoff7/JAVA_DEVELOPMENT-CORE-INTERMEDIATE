//Finally Block - if an exception is raised and corresponding 
//catch block matched 
public class Exception_finallyBlock2 {
	public static void main(String[] args) {
		try {
			System.out.println("try block executed");
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.out.println("catch block executed");
		} finally {
			System.out.println("finally block executed");
		}
	}

}
