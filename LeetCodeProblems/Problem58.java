/*Length of Last Word
 * Given a string s consisting of words and spaces, 
 * return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only. 

Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.

Example 3:
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
*/

public class Problem58 {
	public int lengthOfLastWord(String s) {
		int count = 0, n = s.length();
		for (int i = n - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ')
				count++;
			else if (count > 0)
				return count;

		}
		return count;
	}

	public static void main(String[] args) {
		// String s= "Hello World";
		String s = "the moon   ";
		System.out.println(new Problem58().lengthOfLastWord(s));
	}
}
