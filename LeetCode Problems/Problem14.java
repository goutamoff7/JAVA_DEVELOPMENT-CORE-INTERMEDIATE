/* 14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/

class Problem14 {
	public String longestCommonPrefix(String[] strs) {
		String res = "";
		int n = strs.length;
		String prefix = strs[0];
		for (int i = strs[0].length() - 1; i >= 0; i--) {
			boolean match = true;
			for (int j = 1; j < n; j++) {
				if (strs[j].indexOf(prefix) != 0) {
					match = false;
					break;
				}
			}
			if (match) {
				res = prefix;
				break;
			} else
				prefix = prefix.substring(0, i);
		}
		return res;
	}

	public static void main(String[] args) {
		// String strs[] = { "flower", "flow", "flight" };
		// String strs[] = { "dogcar", "racecar", "car" };
		// String strs[] = {"c","acc","ccc"};
		// String strs[] = { "a" };
		System.out.println(new Problem14().longestCommonPrefix(strs));
	}
}