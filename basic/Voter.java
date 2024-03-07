package basic;

import java.util.Scanner;
class Voter {

   static void eligibility(int age)
    {
        if(age>=18)
            System.out.println("The candidate is eligible to Vote");
        else
            System.out.println("The candidate is not eligible to Vote");
    }
    public static void main(String[] args) {
        System.out.print("Enter the age the candidate: ");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        eligibility(age);
    }
}
