package stringDemo;
public class MutableString {
	public static void main(String[] args) {
		String s1 = new String("Goutam");
		s1.concat("Dam");
		System.out.println("String : " + s1);
		StringBuffer s2 = new StringBuffer("Goutam");
		s2.append(" Dam");
		System.out.println("StringBuffer : " + s2);
		StringBuilder s3 = new StringBuilder("Goutam");
		s3.append(" Dam");
		System.out.println("StringBuilder : " + s3);
	}
}
