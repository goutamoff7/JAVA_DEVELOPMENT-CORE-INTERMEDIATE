import java.util.Scanner;
class Student1
{
    String name;
    int age;
    Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }    
}

class Student2
{
    String name;
    int age;
    Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }    
}

class FindElderObject
{
    void findElder(Student1 ob1,Student2 ob2)
    {
        if(ob1.age>ob2.age)
            System.out.print(ob1.name+" is Elder");
        else
            System.out.print(ob2.name+" is Elder");
    }
    public static void main(String[] args) 
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter 1st Student name : ");
        String name1 = read.nextLine();
        System.out.print("Enter age of "+name1+" : ");
        int age1 = read.nextInt();

        read.nextLine();

        System.out.print("Enter 2nd Student name : ");
        String name2 = read.nextLine();
        System.out.print("Enter age of "+name2+" : ");
        int age2 = read.nextInt();

        Student1 ob1 = new Student1(name1,age1);
        Student2 ob2 = new Student2(name2,age2);

        new FindElderObject().findElder(ob1,ob2);

    }
}