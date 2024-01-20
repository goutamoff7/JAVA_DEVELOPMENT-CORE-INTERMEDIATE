import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_MultiCatch1 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter 1st Number: ");
			int a = sc.nextInt();
			System.out.print("Enter 2nd Number: ");
			int b = sc.nextInt();
			if (b <= 0 || a <= 0)
				throw new ArithmeticException();
			else
				System.out.println("Result (1st/2nd) = " + a / b);
		} catch (ArithmeticException | InputMismatchException e) {
			System.out.println("Enter Number only and should greater than Zero " + e);
		}
	}
}
