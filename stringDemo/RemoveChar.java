package stringDemo;
import java.util.Scanner;

class RemoveChar {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s = read.nextLine();
		String s1 = "";
		System.out.print("Enter the position to remove character : ");
		int pos = read.nextInt();
		s1 += s.substring(0, pos) + s.substring(pos + 1);
		System.out.println(s1);
	}

}
