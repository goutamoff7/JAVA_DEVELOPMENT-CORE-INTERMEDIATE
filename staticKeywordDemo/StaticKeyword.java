package staticKeywordDemo;

public class StaticKeyword {
	static int a = 10;
	int b;

	class InstanceClass {
		InstanceClass() {
			System.out.println(b);
		}
	}

	static class StaticClass {
		StaticClass() {
			System.out.println(a);
		}
	}

	public StaticKeyword(int b) {
		this.b = b;
	}

	public static void main(String[] args) {
		StaticKeyword ob1 = new StaticKeyword(20);
		System.out.println(a + ob1.b);
		StaticKeyword ob2 = new StaticKeyword(30);
		System.out.println(a + ob2.b);
		StaticKeyword.InstanceClass ob3 = ob1.new InstanceClass(); // invoking the constructor of inner class through
																	// ob3 object of inner class
		ob2.new InstanceClass(); // invoking the constructor of inner class through anonymous object of inner
									// class
		new StaticKeyword.StaticClass();

	}
}
