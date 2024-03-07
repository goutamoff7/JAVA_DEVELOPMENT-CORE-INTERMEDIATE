package inheritanceDemo;

//make a parent class and initialize its variable using constructor, extends parent class in child class and also initialize its variable using constructor
//make object of child and diplay all the data of parent and child.
import java.util.Scanner;


class Parent
{
    String name;
    int age;
    Parent(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
}

class Child extends Parent
{
    int roll;
    float marks;
    Child(String name, int age, int roll, float marks)
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
    Child ob = new Child(name,age,roll,marks);
    ob.display();

    }
}