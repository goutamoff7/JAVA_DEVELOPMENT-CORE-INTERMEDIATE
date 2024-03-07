package stringDemo;
import java.io.*;
import java.util.Scanner;
import java.lang.*;
class Remove_duplicate
{
  public static void main(String args[])
  {
    int i,j,flag;
    String str2="";
    Scanner in =new Scanner(System.in);
    System.out.println("Enter a String");
    String str1=in.nextLine();
    for(i=0;i<str1.length();i++)
    {
	if(i==0)	    
	  str2=str2+str1.charAt(0);
    	else
	{
	  flag=0;	
	  for(j=0;j<str2.length();j++)
	  {	
 	    if(str1.charAt(i)==str2.charAt(j))
	    {
            flag=1;
		break;
	    }
	  }
	  if(flag==0)
	    str2=str2+str1.charAt(i);
	}
    }
    System.out.println(str2);
  }
}