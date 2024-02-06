import java.util.*;
import PAP.*;

class PAPImplements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        ArmstrongNumber ob1 = new ArmstrongNumber();
        ob1.armstrong(n);

        Palindrome ob2 = new Palindrome();
        System.out.println(ob2.palindrome(n));

        PerfectNumber ob3 = new PerfectNumber();
        ob3.perfect(n);
    }
}