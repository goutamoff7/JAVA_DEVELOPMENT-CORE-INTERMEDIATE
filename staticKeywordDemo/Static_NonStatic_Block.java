package staticKeywordDemo;
class Demo {
	static int a;
	int b;
	static // static block
	{
		System.out.println("Static Block");
		a = 10;
		// b=20; 		
	}
	{
		System.out.println("Instance/Non_Static Block");
		b = 20;
		a = 30;		
	}

	static void disp() {
		System.out.println("Static Method");
		System.out.println("Static Variable 'a' : " + a);
		System.out.println("calling disp method of Demo2 class");
		Demo2.disp();
	}
}

class Demo2 {
	static int c = 20;

	static void disp() {
		System.out.println("Static Method");
		System.out.println("Static Variable 'c' : " + c);
	}
}

class Static_NonStatic_Block {
	public static void main(String args[]) {
		System.out.println("Main Method");
		Demo.disp();
		Demo d = new Demo();
		d.disp();
		System.out.println(Demo.a);
		System.out.println(d.a);

	}
}