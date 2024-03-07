package interfaceDemo;
interface Computer {
	void compileCode();	
}

class Laptop implements Computer {
	public void compileCode() {
		System.out.println("Laptop compiles code");
	}
}

class Desktop implements Computer {
	public void compileCode() {
		System.out.println("Computer compiles code faster");
	}
}

class Tablet implements Computer{
	public void compileCode()
	{
		System.out.println("Tablet Testing the codes");
	}
}

class Developer {
	void buildApp(Computer obj) {
		System.out.println("Building App");
		obj.compileCode();
		System.out.println("-----------------------------");
	}
}

public class Company {
	public static void main(String[] args) {
		Laptop l = new Laptop();
		Desktop d = new Desktop();
		Tablet t = new Tablet();
		Developer de1 = new Developer();
		de1.buildApp(l);
		Developer de2 = new Developer();
		de2.buildApp(d);
		Developer de3 = new Developer();
		de3.buildApp(t); 

	}
}
