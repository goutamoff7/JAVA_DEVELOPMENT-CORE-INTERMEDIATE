//1+a+a^2+a^3+.......a^n (a=2,n is given by user)
import java.io.*;
import java.util.Scanner;
class Series1
{
   public static void main(String[] args) 
   {
    int s=1,a=2;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Range: ");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
      int p=1;
      for(int j=1;j<=i;j++)
      {
        p=p*a;
      } 
      s=s+p;
    }
    System.out.println("S="+s);
   }
    
}
