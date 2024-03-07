package basic;

//PRIME NO
import java.io.*;
import java.util.Scanner;
class Prime
{
  public static void main(String args[])
  {
    int flag=0;
    Scanner in =new Scanner(System.in);
    System.out.print("Enter a Number");
    int n=in.nextInt();
    for(int i=2;i<=n/2;i++)
	{
	  if(n%i==0)
	  {
	  	flag=1;
	  	System.out.println(n+" is not a Prime Number");
  		break;
        }	
      }
    if(flag==0)
      System.out.println(n+" is a Prime");
  }
}
 