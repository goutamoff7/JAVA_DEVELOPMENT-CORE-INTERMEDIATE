import java.util.*;
class RemoveSpace
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A STRING: ");
		String s=sc.nextLine();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				s1=s1+"";
			else
				s1=s1+s.charAt(i);
		}
		System.out.print(s1);
	}
}