package inheritanceDemo;

//make a ParentCon class and initialize its variable using constructor, extends ParentCon class in ChildCon class and also initialize its variable using constructor
//make object of ChildCon and diplay all the data of ParentCon and ChildCon.
import java.util.Scanner;


class ParentCon
{
    String name;
    int age;
    ParentCon(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
}

class ChildCon extends ParentCon
{
    int roll;
    float marks;
    ChildCon(String name, int age, int roll, float marks)
    {
        super(name,age);
        this.roll=roll;
        this.marks=marks;
    }
    void display()
    {
    System.out.println("Name: "+name);
    System.out.println("Age :"+age);
    System.out.println("Roll :"+roll);
    System.out.println("Marks :"+marks);
    }
}

class InheritanceConstructor
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
    System.out.print("Enter marks: ");
    float marks=read.nextFloat();
    ChildCon ob = new ChildCon(name,age,roll,marks);
    ob.display();

    }
}