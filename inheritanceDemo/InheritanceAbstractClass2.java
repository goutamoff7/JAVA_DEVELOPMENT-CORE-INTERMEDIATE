package inheritanceDemo;

//make an abstract ParentIn2 class and extends ParentIn2 class in child class and initialize its variable using constructor
//make object of child class diplay all the data of ParentIn2 and child. (ParentIn2 class variable should get value without using ParentIn2 constructor)
import java.util.Scanner;



abstract class ParentIn2
{
    String name;
    int age;
}

class StudentIn2 extends ParentIn2
{
    int roll,marks;
    String subject;
    StudentIn2(int roll, String subject,int marks)
    {
        this.roll=roll;
        this.subject=subject;
        this.marks=marks;
    }
    void display()
    {
    System.out.println("\nStudentIn2's Data: ");
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
    StudentIn2 ob = new StudentIn2(roll,subject,marks);
    ob.name=name;
    ob.age=age;	
    ob.display();

    }
}