package comparatorComparable;
import java.util.*;

import Student;

class Student
{
    String name;
    byte age;
    int marks;
    

    Student(String name,byte age,int marks)
    {
        this.name=name;
        this.marks=marks;
        this.age=age;
    }

    public String toString()
    {
        return "Name : "+name+", Age : "+age+", Marks :"+marks+"\n";
    }
}

public class Comparator_Implementation_Lambda_Exp {
    public static void main(String[] args) {
        Student st1 = new Student("Goutam",(byte)26,78);
        Student st2 = new Student("Ram",(byte)23,80);
        Student st3 = new Student("Varun",(byte)28,56);

        List<Student> al= new ArrayList<>();
        al.add(st1);
        al.add(st2);
        al.add(st3);
        System.out.println(al);
        //Collections.sort(al);// CE arise, multiple type of data is there in the list, according to which data need to be sort?

        //Separate Lambda Expression used
        Comparator<Student> m =(Student a,Student b)->
        {
                if(a.marks>b.marks)  // Sorting based on marks
                    return 1; // 1 means Swapping
                else
                    return -1; //-1 means not Swapping 
        };
        Collections.sort(al,m); // based on marks elements are sorted
        System.out.println("Sorting based on Marks  : \n"+al);        
        
        
        // Lambda expression used as a parameter of sort method
        Collections.sort(al,(A,B)->
        
            {
                if(A.age>B.age)  // Sorting based on marks
                    return 1; // 1 means Swapping
                else
                    return -1; //-1 means not Swapping 
            }
        );
        System.out.println("Sorting based on Age : \n"+al);  
        
    }
}
