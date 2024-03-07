package exceptionHandling;
//Demonstration for un-handled Exception
public class DefaultExceptionHandling5 {
	public static void main(String[] args) {
		System.out.println("Entering Main method");
		a();
		System.out.println(10/0);
		System.out.println("Exiting Main method");
	}

	public static void a() {
		System.out.println("Entering method a");
		b();
		System.out.println("Hiee");
		System.out.println("Exiting method a");
	}

	public static void b() {
		System.out.println("Entering method b");
		System.out.println("Hello");
		System.out.println("Exiting method b");
	}

}
