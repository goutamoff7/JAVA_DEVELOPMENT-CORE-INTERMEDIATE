public class Problem58 {
	public int lengthOfLastWord(String s) {
        int count=0,n=s.length();	
		for(int i=n-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ')
				count++;
			else if(count>0)
				return count;
			
		}
		return count;
    }

	public static void main(String[] args) {
		// String s= "Hello World";
		String s = "the moon   ";
		System.out.println(new Problem58().lengthOfLastWord(s));
	}
}
