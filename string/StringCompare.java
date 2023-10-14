public class StringCompare {
	public static void main(String[] args) {
		String s1="Goutam";
		String s2=new String("Goutam");
		System.out.println(s1==s2); // Compares based on Object References
		System.out.println(s1.equals(s2)); // Compares based on Object content 
		System.out.println(s1.compareTo(s2)); //  Compares based on Object content (lexicographically)

	}
}
