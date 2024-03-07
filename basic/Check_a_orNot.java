package basic;

// if the input character is 'a' or not??
import java.util.Scanner;
public class Check_a_orNot
{
public static void main(String[] args) 
{
    System.out.print("Enter a Single Character: ");
    Scanner sc = new Scanner(System.in);
    char ch=sc.next().charAt(0);
    if(ch=='a')
        System.out.println("The input character is : a");
    else  
        System.out.println("The input character is not : a");
}
}
