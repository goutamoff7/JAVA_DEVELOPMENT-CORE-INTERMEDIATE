class StringSortChar {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("dgythgakjzjshiudhajaaaa");
		for (int i = 0; i < s1.length() - 1; i++) // using Bubble Sort Technique
		{
			for (int j = 0; j < s1.length() - i - 1; j++) {
				if (s1.charAt(j) > s1.charAt(j + 1)) {
					char swap = s1.charAt(j);
					s1.setCharAt(j, s1.charAt(j + 1));
					s1.setCharAt(j + 1, swap);
				}
			}
		}
		System.out.println(s1);
	}
}
