
class Animal {
	public void eat() // overrdden method
	{
		System.out.println("Animal eats everyday");
	}

	public void age(int x) // inherited method
	{
		System.out.println("Animal age is " + x);
	}

}

class Tiger extends Animal {

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
		System.out.println("no argument age method of Tiger class");
	}
}

public class InheritanceOverridingRules {
	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.eat();
		t.age();
		t.age(5);

	}
}

class Animal {
	public void eat() // overrdden method
	{
		System.out.println("Animal eats everyday");
	}

	public void age(int x) // inherited method
	{
		System.out.println("Animal age is " + x);
	}

}

class Tiger extends Animal {
	public void eat() // overriding method
	{
		System.out.println("Tiger hunts and eat");
	}

	public void age() // act as specialized method of Tiger class as argument changed
	{
		System.out.println("no argument age method of child class");
	}
}

public class Inheritance3 {
	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.eat();
		t.age();
		t.age(5);

	}
}

class Animal {
	public void eat() // overrdden method
	{
		System.out.println("Animal eats everyday");
	}

	public void age(int x) // inherited method
	{
		System.out.println("Animal age is " + x);
	}

}

class Tiger extends Animal {
	public void eat() // overriding method
	{
		System.out.println("Tiger hunts and eat");
	}

	public void age() // act as specialized method of Tiger class as argument changed
	{
		System.out.println("no argument age method of child class");
	}
}

public class Inheritance3 {
	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.eat();
		t.age();
		t.age(5);

	}
}

class Animal {
	public void eat() // overrdden method
	{
		System.out.println("Animal eats everyday");
	}

	public void age(int x) // inherited method
	{
		System.out.println("Animal age is " + x);
	}

}

class Tiger extends Animal {
	public void eat() // overriding method
	{
		System.out.println("Tiger hunts and eat");
	}

	public void age() // act as specialized method of Tiger class as argument changed
	{
		System.out.println("no argument age method of child class");
	}
}

public class Inheritance3 {
	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.eat();
		t.age();
		t.age(5);

	}
}
