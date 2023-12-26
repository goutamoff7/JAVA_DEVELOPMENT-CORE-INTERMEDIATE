import java.util.Scanner;

class Person {
	String name;
	byte age;

	class Address {
		String city;
		String district;
		String state;
		int pinCode;
	}

	public void getData(Address add) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter Person Details");
		System.out.print("Enter Name: ");
		name = read.nextLine();
		System.out.print("Enter Age: ");
		age = read.nextByte();
		read.nextLine();
		System.out.print("Enter City: ");
		add.city = read.nextLine();
		System.out.print("Enter District: ");
		add.district = read.nextLine();
		System.out.print("Enter State: ");
		add.state = read.nextLine();
		System.out.print("Enter PIN Code: ");
		add.pinCode = read.nextInt();
	}

	void display(Address add) {
		System.out.println("Person Details: ");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("city: " + add.city);
		System.out.println("District: " + add.district);
		System.out.println("State: " + add.state);
		System.out.println("PIN Code: " + add.pinCode);
	}
}

public class Member_InnerClass2 {
	public static void main(String[] args) {
		Person p1 = new Person();
		/*
		 * Syntax for Inner Class object creation (non-static member class):-
		 * <OUTER CLASS NAME>'.'<INNER CLASS NAME> <INNER CLASS OBJECT NAME> =
		 * <OUTER CLASS OBJECT NAME>'.'"new" <INNER CLASS NAME>"();"
		 */
		Person.Address ob1 = p1.new Address();
		p1.getData(ob1);
		System.out.println("-----------------------------");
		p1.display(ob1);
	}
}
