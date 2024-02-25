import java.util.*;

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

public class Comparator_Implementation_Annonymous_InnerClass {
    public static void main(String[] args) {
        Student st1 = new Student("Goutam",(byte)26,78);
        Student st2 = new Student("Ram",(byte)23,80);
        Student st3 = new Student("Varun",(byte)28,56);

        List<Student> al= new ArrayList();
        al.add(st1);
        al.add(st2);
        al.add(st3);
        System.out.println(al);
        //Collections.sort(al);// CE arise, multiple type of data is there in the list, according to which data need to be sort?

        Comparator<Student> m =new Comparator<Student>()
        {
            public int compare(Student a,Student b)
            {
                if(a.marks>b.marks)  // Sorting based on marks
                    return 1; // 1 means Swapping
                else
                    return -1; //-1 means not Swapping 
            }
        };
        Collections.sort(al,m); // based on marks elements are sorted
        System.out.println("Sorting based on Marks  : \n"+al);        
        

        Comparator<Student> a =new Comparator<Student>()
        {
            public int compare(Student a,Student b)
            {
                if(a.age>b.age)  // Sorting based on marks
                    return 1; // 1 means Swapping
                else
                    return -1; //-1 means not Swapping 
            }
        };
        
        Collections.sort(al,a); // based on age elements are sorted
        System.out.println("Sorting based on Age : \n"+al);  
        
    }
}
