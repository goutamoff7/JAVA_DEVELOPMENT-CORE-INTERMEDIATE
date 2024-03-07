package stringDemo; 
import java.util.Scanner;

class CaseCovertionChar {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = read.nextLine();
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                s1 += (char) (s.charAt(i) + 32);
            else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                s1 += (char) (s.charAt(i) - 32);
            else
                s1 += s.charAt(i);
        }
        System.out.println(s1);
    }
}
