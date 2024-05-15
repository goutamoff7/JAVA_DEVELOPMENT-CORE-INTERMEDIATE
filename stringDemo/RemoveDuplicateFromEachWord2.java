package stringDemo;
import java.util.Scanner;
import java.util.*;

class Remove2 {
	String remove(String s)
	{
		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		LinkedList<Character> ll = new LinkedList<>();
		for(int i=0;i<s.length();i++)
			lhs.add(s.charAt(i));
		ll.addAll(lhs);
		s="";
		for(int i=0;i<ll.size();i++)
			s=s+String.valueOf(ll.get(i));
		return s;
	}
}
public class RemoveDuplicateFromEachWord2 {
	public static void main(String[] args) {
		Remove2 obj = new Remove2();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Sentence :");
		String s = scan.nextLine();
		String ar[]=s.split(" ");
		s="";
		for(int i=0;i<ar.length;i++)
		{
			s=s+obj.remove(ar[i]);
			s=s+" ";
		}					
		System.out.println(s);
	}
}
