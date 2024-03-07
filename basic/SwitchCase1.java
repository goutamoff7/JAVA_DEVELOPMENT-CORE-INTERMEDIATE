package basic;

import java.util.Scanner;
public class SwitchCase1 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter case Number:");
       int num=sc.nextInt();
       switch(num)
       {
        case 100:   System.out.println("Case 1");
                    break;
        case 200:   System.out.println("Case 2");
                    break;
        case 300:   System.out.println("Case 3");
                    //break;
        default:    System.out.println("No case Found");
       } 
    }
}
