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

class Problem821 {
	public int[] shortestToChar(String s, char c) {
		int n = s.length();
		int res[] = new int[n];
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == c)
				res[i] = 0;
			else {
				int leftCount = 0, rightCount = 0;
				boolean rightFound = false, leftFound = false;
				for (int j = i + 1; j < n; j++) {
					if (s.charAt(j) != c)
						rightCount++;
					else {
						rightFound = true;
						rightCount++;
						break;
					}
				}
				for (int k = i - 1; k >= 0; k--) {
					if (s.charAt(k) != c)
						leftCount++;
					else {
						leftFound = true;
						leftCount++;
						break;
					}
				}
				if (leftFound == true && rightFound == true)
					res[i] = leftCount <= rightCount ? leftCount : rightCount;
				else if (leftFound == true && rightFound == false)
					res[i] = leftCount;
				else if (rightFound == true && leftFound == false)
					res[i] = rightCount;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// String s = "loveleetcode";
		// char c = 'e';
		String s = "aaba";
		char c = 'b';
		int[] res = new Problem821().shortestToChar(s, c);
		for (int n : res)
			System.out.print(n + ",");
	}
}
