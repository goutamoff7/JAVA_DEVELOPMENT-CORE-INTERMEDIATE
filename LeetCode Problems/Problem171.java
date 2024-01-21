/* 168. Excel Sheet Column Title
Given an integer columnNumber, return its corresponding column title 
as it appears in an Excel sheet.
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28

Example 1:
Input: columnNumber = 1
Output: "A"

Example 2:
Input: columnNumber = 28
Output: "AB"

Example 3:
Input: columnNumber = 701
Output: "ZY"

Solution:
ZY ->701

N=(Z+1)*26^1 + (Y+1)*26^0 = 701

=(25+1)*26^1 + (24+1)*26^0
=26*26 + 25*1 
=676 + 25 
=701*/

class Problem171 {
	public int titleToNumber(String columnTitle) {
		int res = 0, pos = 0;
		for (int i = columnTitle.length() - 1; i >= 0; i--) {
			res = res + (int) ((columnTitle.charAt(i) - 'A' + 1) * Math.pow(26, pos++));
		}
		return res;
	}

	public static void main(String[] args) {
		// String columnTitle = "AB";
		// String columnTitle = "ZY";
		// String columnTitle = "FXSHRXW";
		String columnTitle = "AZ";
		System.out.println(new Problem171().titleToNumber(columnTitle));
	}
}