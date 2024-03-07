public class DuckingException_ReThrow {
	public static void a() throws ArithmeticException 
	{
		System.out.println(10 / 0);
	}

	public static void b() throws ArithmeticException
	 {
		a();
	}

	public static void main(String[] args) {
		try{
			a();
			}
			catch(Exception e)
			{
				System.out.println("Error : "+e.getMessage());
			}
				
	}
}
