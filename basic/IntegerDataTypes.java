import java.net.SocketImplFactory;

class IntegerDataTypes {
	public static void main(String[] args) {
		byte d = -128; // byte range -2^7 to +2^7 -1 = -128 to 127
		System.out.println("byte : " + d);

		byte D = 127;
		System.out.println("byte : " + D);

		short e = -32768;// short range -2^15 to +2^15 -1 = -32,768 to 32,767
		System.out.println("short : " + e);

		short E = 32767;
		System.out.println("short : " + E);

		int a = -2147483648; // int range -2^31 to +2^31 -1 = -2147483648 to +2147483647
		System.out.println("int : " + a);

		int A = 2147483647;
		System.out.println("int : " + A);

		long f = (long) Math.pow(-2, 63);
		// long range -2^63 to +2^63 -1 = -9223372036854775808 to -9223372036854775807
		System.out.println("long : " + f);

		long F = (long) Math.pow(2, 64);
		System.out.println("long : " + F);

		long b = 2147483648L;
		// when the vlaue given is out of int range L or l suffix must required
		System.out.println("long with L prefix (outside int range): " + b);

		long c = 2147483647; // this value is within int range, hence, no suffix required
		System.out.println("long without l prefix (within int range) : " + c);

	}

}