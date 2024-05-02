package encapsulation;
import java.io.IOException;
import java.util.Scanner;

class AadharCardDetails {
	private int sno;
	private long num;

	private String name;
	private int age;
	private char gender;

	public long getNum() {
	return num;
	}
	
	public void setNum(long num) {
	this.num = num;
	}	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	AadharCardDetails(int sno) {
		this.sno = sno;
	}

	public int getSno() {
		return sno;
	}
	

}

public class EncapsulationExample {
	public static void main(String[] args) throws IOException 
	{

		Scanner read = new Scanner(System.in);
		AadharCardDetails person1=new AadharCardDetails(1);
		System.out.print("Enter Aadhar Number: ");
		person1.setNum(read.nextLong());
		read.nextLine();
		System.out.print("Enter Name: ");
		person1.setName(read.nextLine());
		System.out.print("Enter Age: ");
		person1.setAge(read.nextInt());
		System.out.print("Enter Gender (M/F/TG): ");
		person1.setGender(read.next().charAt(0));

		System.out.println("Serial No: "+person1.getSno());
		System.out.println("Aadhar Number: "+person1.getNum());
		System.out.println("Name: "+person1.getName());
		System.out.println("Age: "+person1.getAge());
		System.out.println("Gender: "+person1.getGender());
		
		
	}
}
