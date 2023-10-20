
class Animal {
	public static void run() {
		System.out.println("Animal can run");
	}

	public void eat() // overrdden method
	{
		System.out.println("Animal eats everyday");
	}

	public void age(int x) // inherited method
	{
		System.out.println("Animal age is " + x);
	}

	private void sleep() // method with private specifier can't participate in inheritance
	{
		System.out.println("Animal needs good sleep");
	}

	final void shelter() {
		System.out.println("Animal needs shelter");
	}

}

class Tiger extends Animal {

	public static void run() {
		System.out.println("Tiger can run very fast");
	}

	// public int age(int x) // The return type is incompatible with Animal.age(int)
	// {
	// return 10;
	// }

	// void age(int x) // Cannot reduce the visibility of the inherited method from
	// Animal (public to default)
	// {
	// System.out.println("Tiger hunts and eat");
	// }
	public void eat() // overriding method
	{
		System.out.println("Tiger hunts and eat");
	}

	public void age() // act as specialized method of Tiger class as argument changed
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
		Tiger t = new Tiger();
		Animal a = new Tiger();

		a.run();
		t.run();
		a.eat();
		t.eat();
		// a.age();//specialized method of base class can't call with reference of super
		// class
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
}
