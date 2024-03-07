package inheritanceDemo;

class Parent {
	int length, breadth;

	int area(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		return length * breadth;
	}
}

class Child extends Parent {
	int volume(int height) {
		return length * breadth * height;
	}
}

public class SingleInheritance_AreaVolume {
	public static void main(String[] args) {
		Child c = new Child();
		int area = c.area(5, 6);
		int volume = c.volume(3);
		System.out.println("Area of the Rectangle = " + area + " Sqr mtr");
		System.out.println("Volume of the Rectangle = " + volume + " Cubic mtr");
	}
}
