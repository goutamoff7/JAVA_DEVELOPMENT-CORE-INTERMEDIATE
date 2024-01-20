/* 168. Excel Sheet Column Title
Given an integer columnNumber, return its corresponding column title as it appears 
in an Excel sheet.
For example:
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

Solution Explanation :
In Excel, the columns are letters that correspond to numbers. 
We start with A = 1. Similarly 2 corresponds to B until 26 for Z. 
Once we run out of letters, we start appending them. 27 will correspond to AA, 
28 for AB, and so on. In this problem, we are given the integer which is the column number 
and we need to return the corresponding letters for it.
At first glance, it might be tempting to say that these numbers are just base 26, 
but the catch is that in a base 26 system, the numbers would start from 0. 
The mapping would be like below:

A -> 0
B -> 1
C -> 2
...
Z -> 25

ZY ->701

N=(Z+1)*26^1 + (Y+1)*26^0 = 701

=(25+1)*26^1 + (24+1)*26^0
=26*26 + 25*1 
=676 + 25 
=701

...*/
class Problem168 {
	public String convertToTitle(int columnNumber) {
		String s = "";
		while (columnNumber > 0) {
			columnNumber--;
			s = s + String.valueOf((char) (columnNumber % 26 + 65));
			columnNumber = columnNumber / 26;
		}
		StringBuffer res = new StringBuffer(s);
		res.reverse();
		s = String.valueOf(res);
		return s;
	}

	public static void main(String[] args) {
		// int columnNumber = 1;
		// int columnNumber = 28;
		int columnNumber = 701;
		// int columnNumber = 2147483647;
		// int columnNumber = 52;
		System.out.println(new Problem168().convertToTitle(columnNumber));
	}
}