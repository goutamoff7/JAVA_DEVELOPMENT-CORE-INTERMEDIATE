package basic;

//VOWEL FREQUENCY
import java.io.*;
import java.util.Scanner;
import java.lang.*;
class Vowel_freq
{
  public static void main(String args[])
  {
    int i,j,c=0;
    String vow="aeiou";	
    Scanner in =new Scanner(System.in);
    System.out.print("Enter a String:");
    String str=in.nextLine();
    str=str.toLowerCase();
    for(i=0;i<vow.length();i++)
    {
      for(j=0;j<str.length();j++)
	{
	  if(vow.charAt(i)==str.charAt(j))
	    c++;
	}
	  System.out.println(vow.charAt(i)+" = "+c+" Times");
	  c=0;
    }
  }
}
