//Demonstration of proper Handled the Exception
public class DefaultExceptionHandling2 {
	public static void main(String[] args) {
		System.out.println("Main Method Starts");
		int a = 10;
		int b = 0;
		System.out.println("a = " + a + " ,b = " + b);
		try {
			int res = a / b;
			System.out.println("Addition= " + res);
		} catch (Exception obj) {
			System.out.println("Number can't Divide by Zero \n" + obj);
		}
		System.out.println("Main Method Exit");
	}
}
