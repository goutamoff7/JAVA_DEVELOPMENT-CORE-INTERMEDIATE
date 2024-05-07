package inheritanceDemo;

//make a ParentCon2 class and initialize its variable using constructor, extends ParentCon2 class in ChildCon2 class and also initialize its variable using constructor
//make object of ChildCon2 and diplay all the data of ParentCon2 and ChildCon2.
import java.util.Scanner;

class ParentCon2
{
    Scanner read = new Scanner(System.in);
    String name;
    int age;
    ParentCon2()
    {
    System.out.print("Enter Name: ");
    name=read.nextLine();
    System.out.print("Enter age: ");
    age=read.nextInt();
    }
}

class ChildCon2 extends ParentCon2
{
    int roll;
    float marks;
    ChildCon2()
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
    ChildCon2 ob = new ChildCon2();
    System.out.println("Name: "+ob.name);
    System.out.println("Age :"+ob.age);
    System.out.println("Roll :"+ob.roll);
    System.out.println("Marks :"+ob.marks);
    

    }
}