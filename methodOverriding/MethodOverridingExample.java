package methodOverriding;
class Animal {
	void move() {
		System.out.println("Animal can move");
	}
}

class Dog extends Animal {
	void move() {
		super.move();
		System.out.println("Dog can walk and run");
	}
}

public class MethodOverridingExample {
	public static void main(String[] args) {
		Dog ob1 = new Dog();
		ob1.move();
		Animal ob2 = new Animal();
		ob2.move();
		Animal ob3 = new Dog();
		ob3.move();

	}
}
