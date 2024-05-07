package inheritanceDemo;

//make an abstract ParentIn class and initialize its variable using constructor, extends ParentIn class in child class and also initialize its variable using constructor
//make object of child and diplay all the data of ParentIn and child.*/
import java.util.Scanner;

abstract class ParentIn
{
    String name;
    int age;
    ParentIn(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
}

class StudentIn extends ParentIn
{
    int roll,marks;
    String subject;
    StudentIn(String name, int age, int roll, String subject,int marks)
    {
        super(name,age);
        this.roll=roll;
        this.subject=subject;
        this.marks=marks;
    }
    void display()
    {
    System.out.println("\nStudentIn's Data: ");
    System.out.println("Name: "+name);
    System.out.println("Age :"+age);
    System.out.println("Roll :"+roll);
    System.out.println("Subject :"+subject);
    System.out.println("Marks :"+marks);
    }
}

class InheritanceAbstractClass
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
    StudentIn ob = new StudentIn(name,age,roll,subject,marks);
    ob.display();

    }
}