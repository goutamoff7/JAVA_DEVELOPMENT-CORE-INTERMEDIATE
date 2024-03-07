package basic;

import java.util.Scanner;
class Greatest
{
    static int returnlarger(int a,int b)
    {
        if(a>b)
            return a;
        else
            return b;
        }

    public static void main(String[] args) 
    {
        System.out.print("Enter two Number: ");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int p=returnlarger(a,b);
        System.out.println(p+" is Larger");
    }
}
