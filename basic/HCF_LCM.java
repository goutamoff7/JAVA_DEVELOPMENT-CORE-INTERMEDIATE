package basic;

import java.util.Scanner;
class HCF_LCM
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=1,m=a,n=b;
        while(c>0)
        {
            c=a % b;
            a=b;
            b=c;
        }
        System.out.println("The HCF of "+m+" and "+n+" = "+a);
        System.out.println("The LCM of "+m+" and "+n+" = "+m*n/a);        
    }
}