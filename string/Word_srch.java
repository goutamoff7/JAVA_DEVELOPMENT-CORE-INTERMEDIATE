//WORD SEARCH
import java.io.*;
import java.util.Scanner;
import java.lang.*;
class Word_srch
{
  public static void main(String args[])
  {
    int j,k=0,flag=0;
    Scanner in =new Scanner(System.in);
    System.out.print("Enter a String:");
    String str=in.nextLine();
    System.out.print("Enter the search Word: ");
    String srch = in.nextLine();
    str=str+' ';
    while(k<str.length())
    {
      for(j=k;j<str.length();j++)
	{
	  if(str.charAt(j)==' ')
	  {
	    if(str.substring(k,j).equalsIgnoreCase(srch))
	    {
		System.out.println(srch+" is found");
		flag=1;
		break;
	    }
	    k=j+1;	
	  }
	}
	if(flag==1)
	  break;
    }
    if(flag==0)
	System.out.println(srch+" is not found");
    }
}