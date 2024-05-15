package stringDemo;
import java.util.Scanner;

class Remove {
	String remove(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			char temp = s.charAt(i);						
			s=s.substring(0,i+1)+s.substring(i+1).replace(temp,'\0');
		}
		return s;
	}
}

public class RemoveDuplicateFromEachWord {
	public static void main(String[] args) {
		Remove obj = new Remove();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Sentence :");
		String s = scan.nextLine();
		String s2="";
		String ar[]=s.split(" ");
		for(int i=0;i<ar.length;i++)
		{
			s2=s2+obj.remove(ar[i]);
		}			
		s="";
		for(int i=0;i<s2.length();i++)
		{
			if(s2.charAt(i)!='\0')
				s=s+String.valueOf(s2.charAt(i));				
		}
		System.out.println(s);

	}

}
