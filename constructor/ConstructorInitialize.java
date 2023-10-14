public class ConstructorInitialize {
	int a;

	public ConstructorInitialize(int a) {
		this.a = a;
	}

	public static void main(String[] args) {
		ConstructorInitialize ob = new ConstructorInitialize(10);
		System.out.println(ob.a);
	}
}
