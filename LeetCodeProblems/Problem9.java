package leetCodeProblems;
/* 9. Palindrome Number
Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left,
it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.*/

class Problem9 {
	public boolean isPalindrome(int x) {
		boolean res = false;
		StringBuffer sb = new StringBuffer(String.valueOf(x));
		sb.reverse();
		if (String.valueOf(sb).equals(String.valueOf(x)))
			res = true;
		return res;
	}

	public static void main(String[] args) {
		System.out.println(new Problem9().isPalindrome(-121));
		System.out.println(new Problem9().isPalindrome(121));
	}
}