import java.util.Scanner;

class PalindromeString {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Enter the String to know Palindrome or not: ");
        String s = read.nextLine();
        int startIndex = 0, lastIndex = s.length() - 1, flag = 0;
        for (; startIndex <= s.length() / 2; startIndex++) {
            if (s.charAt(startIndex) != s.charAt(lastIndex)) {
                flag = 1;
                break;
            }
            lastIndex--;
        }
        if (flag == 0)
            System.out.println(s + " is Palindrome");
        else
            System.out.println(s + " is not Palindrome");
    }

}