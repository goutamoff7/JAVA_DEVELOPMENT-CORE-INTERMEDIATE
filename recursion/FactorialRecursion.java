package recursion;

import java.util.Scanner;
class FactorialRecursion
{
    int fact(int n)
    {
        if(n==1)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter any number to find its Factorial: ");
        int n=read.nextInt();
        System.out.println("The factorial of "+n+" = "+ new FactorialRecursion().fact(n));
        
    }
}
