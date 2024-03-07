package stringDemo;
import java.util.Scanner;

class RemoveChar2 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s = read.nextLine();
		String s1 = "";
		System.out.print("Enter the character to remove : ");
		char ch = read.next().charAt(0);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ch)
				s1 += s.charAt(i);
		}
		System.out.println(s1);
	}

}
