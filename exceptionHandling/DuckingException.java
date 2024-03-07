package exceptionHandling;
public class DuckingException {
	public static void a() throws ArithmeticException {
		System.out.println(10 / 0);
	}

	public static void b() throws ArithmeticException {
		System.out.println(20 / 0);
	}

	public static void main(String[] args) {
		try{
			a();
			b();
			}
			catch(Exception e)
			{
				System.out.println("Error : "+e.getMessage());
			}
				
	}
}
