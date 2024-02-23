import java.math.BigDecimal;

class BigDecimalClassDemo {
	public static void main(String[] args) {
		BigDecimal c, d, e, f;
		BigDecimal[] g;
		BigDecimal a = new BigDecimal("0.06");
		BigDecimal b = new BigDecimal("0.04");
		c = a.add(b);
		d = a.subtract(b);
		e = a.multiply(b);
		f = a.divide(b);
		g = a.divideAndRemainder(b);

		System.out.println("Addition : " + c);
		System.out.println("Subtraction : " + d);
		System.out.println("Multiplication : " + e);
		System.out.println("Division : " + f);
		for (BigDecimal n : g)
			System.out.print(n + ",");

	}
}