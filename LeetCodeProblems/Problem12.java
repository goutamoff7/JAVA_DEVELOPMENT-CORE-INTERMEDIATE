package leetCodeProblems;
/* 12. Integer to Roman
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

Example 1:
Input: num = 3
Output: "III"
Explanation: 3 is represented as 3 ones.

Example 2:
Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.

Example 3:
Input: num = 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.*/

public class Problem12 {
	String s ="";

	public String intToRoman(int num) {
			if(num>=1000)
			{
			  s=s+"M";
			  intToRoman(num-1000);
			}
			if(num>=900 && num<1000)
			{
			  s=s+"C";
			  intToRoman(num+100);
			}
			if(num>=500 && num<900)
			{
			  s=s+"D";
			  intToRoman(num-500);
			}
			if(num>=400 && num<500)
			{
			  s=s+"C";
			  intToRoman(num+100);
			}
			if(num>=100 && num<400)
			{
			  s=s+"C";
			  intToRoman(num-100);
			}
			if(num>=90 && num<100)
			{
			  s=s+"X";
			  intToRoman(num+10);
			}
			if(num>=50 && num<90)
			{
			  s=s+"L";
			  intToRoman(num-50);
			}
			if(num>=40 && num<50)
			{
			  s=s+"X";
			  intToRoman(num+10);
			}
		if (num >= 10 && num < 40) {
			s=s+"X";
			intToRoman(num - 10);
		}
		if (num == 9) {
			s=s+"I";
			intToRoman(num + 1);
		}
		if (num >= 5 && num < 9) {
			s=s+"V";
			intToRoman(num - 5);
		}
		if (num == 4) {
			s=s+"I";
			intToRoman(num + 1);
		}
		if (num > 0 && num <= 3) {
			s=s+"I";
			intToRoman(num - 1);
		}
		if (num == 0)
			return "0";
		return s;
	}

	public static void main(String[] args) {
		System.out.println(new Problem12().intToRoman(58));
	}
}
