package comparatorComparable;
import java.util.*;

class Student3 implements Comparable<Student3>
{
    String name;
    byte age;
    int marks;
    

    Student3(String name,byte age,int marks)
    {
        this.name=name;
        this.marks=marks;
        this.age=age;
    }

    public String toString()
    {
        return "Name : "+name+", Age : "+age+", Marks :"+marks+"\n";
    }

    public int compareTo( Student3 a) //Sorting can be done using only one type
    {
        if(this.marks>a.marks)  // Sorting based on marks 
            return 1; // 1 means Swapping
        else
            return -1; //-1 means not Swapping
    }

}


public class Comparable_Implements_InsideClass {
    public static void main(String[] args) {
        Student3 st1 = new Student3("Goutam",(byte)26,78);
        Student3 st2 = new Student3("Ram",(byte)23,80);
        Student3 st3 = new Student3("Varun",(byte)28,56);

        List<Student3> al= new ArrayList<>();
        al.add(st1);
        al.add(st2);
        al.add(st3);
        System.out.println(al);

        Collections.sort(al); // based on marks, elements are sorted already defined inside the class
        System.out.println("Sorting based on Marks  : \n"+al);        
        
       
    }
}
