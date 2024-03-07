package basic;

import java.math.BigInteger;

class BigIntegerClassDemo {
	public static void main(String[] args) {
		BigInteger c, d, e, f;
		BigInteger[] g;
		BigInteger a = new BigInteger("110");
		BigInteger b = new BigInteger("25");
		c = a.add(b);
		d = a.subtract(b);
		e = a.multiply(b);
		f = a.divide(b);
		g = a.divideAndRemainder(b);

		System.out.println("Addition : " + c);
		System.out.println("Subtraction : " + d);
		System.out.println("Multiplication : " + e);
		System.out.println("Division : " + f);
		for (BigInteger n : g)
			System.out.print(n + ",");

	}
}