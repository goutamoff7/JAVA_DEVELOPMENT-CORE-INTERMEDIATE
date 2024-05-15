package stringDemo;
import java.util.*;
public class RemoveDuplicateFromEachWord3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Sentence :");
		String s = scan.nextLine();
		String ar[]=s.split(" ");
		s="";		
		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		LinkedList<Character> ll = new LinkedList<>();
		for(int i=0;i<ar.length;i++)
		{
			String s2="";
			String temp =ar[i];
			for(int j=0;j<temp.length();j++)
				lhs.add(temp.charAt(j));
			ll.addAll(lhs);
			for(int k=0;k<ll.size();k++)
				s2=s2+String.valueOf(ll.get(k));
			s=s+s2+" ";
		}					
		System.out.println(s.trim());
	}
}
