package stringDemo;

class StringDeleteConsonants {
	public static void main(String[] args) {
		String s = new String("Hello, have a good day");
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) != 'a') && (s.charAt(i) != 'A') && (s.charAt(i) != 'e')
					&& (s.charAt(i) != 'E') && (s.charAt(i) != 'i') && (s.charAt(i) != 'I')
					&& (s.charAt(i) != 'o') && (s.charAt(i) != 'O') && (s.charAt(i) != 'u')
					&& (s.charAt(i) != 'U')) {
				s = s.substring(0, i) + " " + s.substring(i + 1);
				
			}

		}
		System.out.println(s);
	}
}