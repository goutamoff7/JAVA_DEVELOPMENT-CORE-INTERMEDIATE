import java.util.Scanner;

class Try_with_Resources1 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number : ");
			int n = sc.nextInt();
			System.out.println("Entered Number: " + n);
		}

	}
}