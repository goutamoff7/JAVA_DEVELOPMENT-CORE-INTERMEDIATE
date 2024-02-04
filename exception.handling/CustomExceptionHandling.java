import java.util.InputMismatchException;
import java.util.Scanner;

class MyException extends Exception {
	MyException(String msg) {
		super(msg);
	}
}

public class CustomExceptionHandling {
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);
		int result = 0;
		try {
			System.out.print("Enter 1st Number :");
			int a = read.nextInt();
			System.out.print("Enter 2nd Number :");
			int b = read.nextInt();
			if (b < 0 || a < 0) {
				MyException ob = new MyException("Negetive Number not allowed");
				throw ob;
			} else if (b == 0)
				throw new ArithmeticException("Zero not allowed for 2nd Number");
			else {
				result = a / b;
				System.out.println("Result (1st/2nd) = " + result);
			}
		} catch (InputMismatchException e) {
			System.out.println("Enter a number only : " + e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		finally{read.close();}
	}
}
