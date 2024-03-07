package leetCodeProblems;
/* 1684. Count the Number of Consistent Strings
You are given a string allowed consisting of distinct characters and an array of strings words. 
A string is consistent if all characters in the string appear in the string allowed.
Return the number of consistent strings in the array words. 

Example 1:
Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.

Example 2:
Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
Output: 7
Explanation: All strings are consistent.

Example 3:
Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
Output: 4
Explanation: Strings "cc", "acd", "ac", and "d" are consistent.*/

class Problem1684 {
	public int countConsistentStrings(String allowed, String[] words) {
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			String s = words[i];
			boolean consistent = true;
			for (int j = 0; j < s.length(); j++) {
				if (allowed.indexOf(String.valueOf(s.charAt(j))) == -1) {
					consistent = false;
					break;
				}
			}
			if (consistent)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// String allowed = "ab";
		// String words[] = { "ad", "bd", "aaab", "baa", "badab" };
		String allowed = "abc";
		String words[] = {"a","b","c","ab","ac","bc","abc"};
		// String allowed = "cad";
		// String words[] = { "cc", "acd", "b", "ba", "bac", "bad", "ac", "d" };
		System.out.println(new Problem1684().countConsistentStrings(allowed, words));
	}
}