/* 500. Keyboard Row
Given an array of strings words, return the words that can be typed 
using letters of the alphabet on only one row of American keyboard like 
the image below.

In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".

Example 1:
Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]

Example 2:
Input: words = ["omk"]
Output: []

Example 3:
Input: words = ["adsdf","sfd"]
Output: ["adsdf","sfd"]*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem500 {
	public String[] findWords(String[] words) {
		List<String> list = new ArrayList<String>();
		String row1 = "qwertyuiop";
		String row2 = "asdfghjkl";
		String row3 = "zxcvbnm";
		for (int i = 0; i < words.length; i++) {
			String s = words[i].toLowerCase();
			boolean match = true;
			int ch = 0;
			if (row1.indexOf(s.charAt(0)) >= 0)
				ch = 1;
			else if (row2.indexOf(s.charAt(0)) >= 0)
				ch = 2;
			else if (row3.indexOf(s.charAt(0)) >= 0)
				ch = 3;
			switch (ch) {
				case 1:
					for (int j = 1; j < s.length(); j++) {
						if (row1.indexOf(s.charAt(j)) == -1) {
							match = false;
							break;
						}
					}
					break;

				case 2:
					for (int j = 1; j < s.length(); j++) {
						if (row2.indexOf(s.charAt(j)) == -1) {
							match = false;
							break;
						}
					}
					break;

				case 3:
					for (int j = 1; j < s.length(); j++) {
						if (row3.indexOf(s.charAt(j)) == -1) {
							match = false;
							break;
						}
					}
			}
			if (match)
				list.add(words[i]);
		}
		String res[] = new String[list.size()];
		for (int i = 0; i < list.size(); i++)
			res[i] = list.get(i);
		return res;
	}

	public static void main(String[] args) {
		String words[] = { "Hello", "Alaska", "Dad", "Peace" };
		// String words[] = {"adsdf","sfd"};
		String res[] = new Problem500Incomplete().findWords(words);
		System.out.println(new ArrayList<>(Arrays.asList(res)));
	}

}
