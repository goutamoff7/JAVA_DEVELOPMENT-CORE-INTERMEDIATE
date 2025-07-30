package comparatorComparable;
import java.util.*;

class Student1
{
    String name;
    byte age;
    int marks;
    

    Student1(String name,byte age,int marks)
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
        Student1 st1 = new Student1("Goutam",(byte)26,78);
        Student1 st2 = new Student1("Ram",(byte)23,80);
        Student1 st3 = new Student1("Varun",(byte)28,56);

        List<Student1> al= new ArrayList<>();
        al.add(st1);
        al.add(st2);
        al.add(st3);
        System.out.println(al);
        //Collections.sort(al);// CE arise, multiple type of data is there in the list, according to which data need to be sort?

        //Separate Lambda Expression used
        Comparator<Student1> m =(Student1 a,Student1 b)->
        {
                if(a.marks>b.marks)  // Sorting based on marks
                    return 1; // 1 means Swapping
                else
                    return -1; //-1 means not Swapping 
        };
        Collections.sort(al,m); // based on marks elements are sorted
        System.out.println("Sorting based on Marks  : \n"+al);        
        
        
        // Lambda expression used as a parameter of sort method
        Collections.sort(al,(A,B)-> A.age>B.age ? 1 : -1);
        System.out.println("Sorting based on Age : \n"+al);  
        
    }
}
