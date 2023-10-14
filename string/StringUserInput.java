import java.util.Scanner;

public class StringUserInput {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s1 = read.next(); // for single word input
		System.out.println(s1);
		read.nextLine(); 
		System.out.print("Enter another String : ");
		String s2 = read.nextLine(); // for more than one word input
		System.out.println(s2);

	}
}
