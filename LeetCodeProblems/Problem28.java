package leetCodeProblems;
/*28. Find the Index of the First Occurrence in a String
 * Given two strings needle and haystack, 
 * return the index of the first occurrence of needle in haystack, 
 * or -1 if needle is not part of haystack. 

Example 1:
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.

Example 2:
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
*/

class Problem28 {
	public int strStr(String haystack, String needle) {
		//int res = 0;
		
		return haystack.indexOf(needle);
	}

	public static void main(String[] args) {
		// String haystack = "sadbutsad";
		// String needle = "sad";
		String haystack ="leetcode";
		String needle = "leeto";
		System.out.println(new Problem28().strStr(haystack, needle));
	}
}