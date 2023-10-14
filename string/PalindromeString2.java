import java.util.Scanner;

class PalindromeString2 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Enter the String to know Palindrome or not: ");
        String s = read.nextLine();
        StringBuilder s1 = new StringBuilder(s);
        s1.reverse();
        if (String.valueOf(s1).equals(s))
            System.out.println(s + " is Palindrome");
        else
            System.out.println(s + " is not Palindrome");
    }

}