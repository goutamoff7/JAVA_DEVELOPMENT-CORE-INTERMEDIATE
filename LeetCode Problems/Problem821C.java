/* 821. Shortest Distance to a Character
Given a string s and a character c that occurs in s, 
return an array of integers answer where answer.length == s.length and 
answer[i] is the distance from index i to the closest occurrence of character c in s.
The distance between two indices i and j is abs(i - j), 
where abs is the absolute value function. 

Example 1:
Input: s = "loveleetcode", c = "e"
Output: [3,2,1,0,1,0,0,1,2,2,1,0]
Explanation: The character 'e' appears at indices 3, 5, 6, and 11 (0-indexed).
The closest occurrence of 'e' for index 0 is at index 3, so the distance is abs(0 - 3) = 3.
The closest occurrence of 'e' for index 1 is at index 3, so the distance is abs(1 - 3) = 2.
For index 4, there is a tie between the 'e' at index 3 and the 'e' at index 5, 
but the distance is still the same: abs(4 - 3) == abs(4 - 5) = 1.
The closest occurrence of 'e' for index 8 is at index 6, so the distance is abs(8 - 6) = 2.

Example 2:
Input: s = "aaab", c = "b"
Output: [3,2,1,0]
*/
class Problem821C {
	public int[] shortestToChar(String s, char c) {
		int n = s.length();
		String leftSubString = "", rightSubString = "";
		int leftDistance = 0, rightDistance = 0;
		int res[] = new int[n];
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == c)
				res[i] = 0;
			else {
				leftSubString = s.substring(0, i);
				rightSubString = s.substring(i + 1);
				if (leftSubString.lastIndexOf(c) != -1)
					leftDistance = leftSubString.length() - leftSubString.lastIndexOf(c);
				else
					leftDistance = Integer.MAX_VALUE;
				if (rightSubString.indexOf(c) != -1)
					rightDistance = rightSubString.indexOf(c) + 1;
				else
					rightDistance = Integer.MAX_VALUE;

				res[i] = leftDistance < rightDistance ? leftDistance : rightDistance;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		String s = "loveleetcode";
		char c = 'e';
		// String s = "aaba";
		// char c = 'b';
		int[] res = new Problem821C().shortestToChar(s, c);
		for (int n : res)
			System.out.print(n + ",");
	}
}
