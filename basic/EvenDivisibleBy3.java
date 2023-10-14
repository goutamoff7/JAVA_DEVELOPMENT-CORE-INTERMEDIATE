import java.util.Scanner;
public class EvenDivisibleBy3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number=sc.nextInt();
        if(number%2==0 && number%3==0)
            System.out.println(number+" is a Even Number and Divisible by 3");
        else if(number%2!=0 && number%3!=0)
            System.out.println(number+" is a Odd Number and not Dvisible by 3");
        else if(number%2!=0 && number%3==0)
            System.out.println(number+" is a Odd Nmber and Divisible by 3");
        else
            System.out.println(number+" is a Even Number and Not Divisible by 3 ");
    }
}
