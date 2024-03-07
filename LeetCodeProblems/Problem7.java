/* 7. Reverse Integer
Given a signed 32-bit integer x, return x with its digits reversed. 
If reversing x causes the value to go outside the signed 32-bit 
integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned)
Input: x = -123
Output: -321 */

import java.lang.Math;

class Problem7 {
	public int reverse(int x) {
		long n = x, sum = 0;
		while (n != 0) {
			long d = n % 10;
			sum = sum * 10 + d;
			n = n / 10;
		}
		System.out.println(sum);
		if (sum >= -Math.pow(2, 31) && sum <= (Math.pow(2, 31) - 1))
			return (int) sum;
		else
			return 0;
	}

	public static void main(String[] args) {
		System.out.println(new Problem7().reverse(-123));
	}
}