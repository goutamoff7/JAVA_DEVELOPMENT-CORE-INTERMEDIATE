package inheritanceDemo;

//make a parent class and initialize its variable using constructor, extends parent class in child class and also initialize its variable using constructor
//make object of child and diplay all the data of parent and child.
import java.util.Scanner;

class Parent
{
    Scanner read = new Scanner(System.in);
    String name;
    int age;
    Parent()
    {
    System.out.print("Enter Name: ");
    name=read.nextLine();
    System.out.print("Enter age: ");
    age=read.nextInt();
    }
}

class Child extends Parent
{
    int roll;
    float marks;
    Child()
    {
        System.out.print("Enter Roll: ");
        roll=read.nextInt();
        System.out.print("Enter marks: ");
        marks=read.nextFloat();
    }
    
}

class InheritanceConstructor2
{
    public static void main(String[] args) 
    {
        
    Scanner read = new Scanner(System.in);
    Child ob = new Child();
    System.out.println("Name: "+ob.name);
    System.out.println("Age :"+ob.age);
    System.out.println("Roll :"+ob.roll);
    System.out.println("Marks :"+ob.marks);
    

    }
}