package inheritanceDemo;

//make an abstract parent class and extends parent class in child class and initialize its variable using constructor
//make object of child class diplay all the data of parent and child. (parent class variable should get value without using parent constructor)
import java.util.Scanner;



abstract class Parent
{
    String name;
    int age;
}

class Student extends Parent
{
    int roll,marks;
    String subject;
    Student(int roll, String subject,int marks)
    {
        this.roll=roll;
        this.subject=subject;
        this.marks=marks;
    }
    void display()
    {
    System.out.println("\nStudent's Data: ");
    System.out.println("Name: "+name);
    System.out.println("Age :"+age);
    System.out.println("Roll :"+roll);
    System.out.println("Subject :"+subject);
    System.out.println("Marks :"+marks);
    }
}

class InheritanceAbstractClass2
{
    public static void main(String[] args) 
    {
        
    Scanner read = new Scanner(System.in);
    System.out.print("Enter Name: ");
    String name=read.nextLine();
    System.out.print("Enter age: ");
    int age=read.nextInt();
    System.out.print("Enter Roll: ");
    int roll=read.nextInt();
    read.nextLine();
    System.out.print("Enter Subject Name: ");
    String subject=read.nextLine();
    System.out.print("Enter marks: ");
    int marks=read.nextInt();
    Student ob = new Student(roll,subject,marks);
    ob.name=name;
    ob.age=age;	
    ob.display();

    }
}