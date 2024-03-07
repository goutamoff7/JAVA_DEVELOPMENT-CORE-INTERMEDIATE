package basic;

import java.util.Scanner;
class Frequency_integer 
{   
    public static void main(String args[])
    {
        int i,j,c=1,n;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Size of the Array: ");
    n=sc.nextInt();
    int ar[]=new int[n];
    System.out.println("Enter "+n+" Elements:");
    for(i=0;i<n;i++)
        ar[i]=sc.nextInt();
    System.out.println("ELEMENTS        FREQUENCY");
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(ar[i]==ar[j] && ar[i]!=-1)
            {
                c++;
                ar[j]=-1;
            }
        }
            if(ar[i]!=-1)
                System.out.println("    "+ar[i]+"              "+c);
            c=1;
    }
    }
    
}
