package basic;

import java.util.Scanner;
public class SecondLargest 
{
    int large1,large2;
     void find2ndLarge(int ar[])
        {
            large1=ar[0];
            large2=0;
            for(int i=1;i<ar.length;i++)
            {
                if(large1<ar[i])
                {
                    large2=large1;
                    large1=ar[i];
                }
                else if(ar[i]>large2 && ar[i]<large1)
                    large2=ar[i];
            }
        }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
       SecondLargest ob= new SecondLargest();
       ob.find2ndLarge(ar);
        System.out.println("The Largest Number in the array ="+ob.large1);
        System.out.println("The Second Largest Number in the array ="+ob.large2);
    }
}
