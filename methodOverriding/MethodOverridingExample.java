package methodOverriding;
class Animal2 {
	void move() {
		System.out.println("Animal can move");
	}
}

class Dog extends Animal2 {
	void move() {
		super.move();
		System.out.println("Dog can walk and run");
	}
}

public class MethodOverridingExample {
	public static void main(String[] args) {
		Dog ob1 = new Dog();
		ob1.move();
		Animal2 ob2 = new Animal2();
		ob2.move();
		Animal2 ob3 = new Dog();
		ob3.move();

	}
}
