import java.util.Scanner;
class Char_at_fun
{
	public static void main(String args[])
	{
		String s;
		int i,j,c;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a String");
		s=ob.nextLine();
		j=s.length();
		for(i=0;i<j;i++)
		{
			if(i<=j-2)
			{
				if((s.charAt(i))!=(s.charAt(i+1)))
				System.out.print(s.charAt(i));
			}
			else
			{
				if((s.charAt(i))!=(s.charAt(i-1)))
				System.out.print(s.charAt(i));
			}
		}
	}
}
