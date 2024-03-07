package basic;

// print Prime number within a range 
import java.io.*;
import java.util.Scanner;
class PrimeRange 
{
    public static void main(String[] args)
     {
        int flag=0,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Start Range: ");
        int start=sc.nextInt();
        System.out.print("Enter End Range: ");
        int end=sc.nextInt();
        for(int i=start;i<=end;i++)
        {
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
		{
		    c++;
                System.out.print(i+",");
		}
            flag=0;
        }
		System.out.println("Total Prime No from "+start+" to "+end+" = "+c);
     }    
}
