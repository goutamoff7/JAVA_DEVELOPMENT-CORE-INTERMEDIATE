import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_MultiCatch2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int ar[] = { 1, 2, 3, 4, 5 };
			System.out.print(ar[5]);

		} catch (IndexOutOfBoundsException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Stay within your limits " + e);
		}

	}
}
