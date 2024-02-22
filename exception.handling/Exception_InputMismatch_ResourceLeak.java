import java.util.Scanner;

public class Exception_InputMismatch_ResourceLeak {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n = sc.nextInt();
		System.out.println("Given Number : " + n);

	}
}
