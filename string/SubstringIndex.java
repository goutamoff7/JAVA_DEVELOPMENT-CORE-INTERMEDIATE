import java.util.Scanner;

public class SubstringIndex {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s = read.nextLine();
		System.out.print("Enter the String to find Index : ");
		String sub = read.nextLine();
		int index, start = 0;
		if (s.indexOf(sub) == -1)
			System.out.println(sub + " not found");
		else {
			do {
				index = s.indexOf(sub, start);
				if (index != -1) {
					System.out.println(sub + " found at Index : " + index);
					start = index + 1;
				}

			} while (index != -1);
		}

	}
}
