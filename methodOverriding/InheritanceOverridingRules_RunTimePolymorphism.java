package methodOverriding;
class Animal {

	public static void run() {
		System.out.println("Animal can run");
	}

	public void eat() // overridden method
	{
		System.out.println("Animal eats everyday");
	}

	public void age(int x) // inherited method
	{
		System.out.println("Animal age is " + x);
	}

	private void sleep() // method with private specifier can't participate
							// in inheritance
	{
		System.out.println("Animal needs good sleep");
	}

	final void shelter() // can't override final method so it acts as inherited method
	{
		System.out.println("Animal needs shelter");
	}

}

class Tiger extends Animal {

	public static void run() {
		System.out.println("Tiger can run very fast");
	}

	public void eat() // overriding method
	{
		System.out.println("Tiger hunts and eat");
	}

	// public int age(int x) // The return type is incompatible with Animal.age(int)
	// {
	// return 10;
	// }

	// void age(int x) // Cannot reduce the visibility of the inherited method from
	// Animal (public to default)
	// {
	// System.out.println("Tiger age: "+x);
	// }

	public void age() // act as specialized method of Tiger class as argument changed satisfies method
						// overloading
	{
		System.out.println("Tiger class specialized method");
	}

	// final void shelter() //Cannot override the final method from Animal
	// {
	// System.out.println("Animal needs shelter");
	// }
}

public class InheritanceOverridingRules_RunTimePolymorphism {
	public static void main(String[] args) {
		Tiger t = new Tiger(); // Child class reference manages child class object
		Animal a = new Tiger(); // Parent class reference manages child class object
		a.run();
		t.run();
		a.eat();
		t.eat();
		// a.age();//specialized method of child class can't call using parent class
		// reference variable
		((Tiger) a).age();/*
							 * specialized method of child class can be accessed
							 * using Parent class reference but the parent class reference
							 * should be downcast to Child class
							 */
		t.age();
		a.age(5);
		t.age(5);

		// a.sleep();t.sleep(); //super class method with private specifier
		// can't participate in inheritance otherwise it violets encapsulation rules.
		// The method sleep() from the type Animal is not visible

		a.shelter();
		t.shelter(); // Cannot override the super class final method so
		// super class method has been invoked
	}

	private static Tiger Tiger(Animal a) {
		return null;
	}
}
