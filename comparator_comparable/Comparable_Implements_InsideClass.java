import java.util.*; 

class Student implements Comparable<Student>
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

    public int compareTo( Student a) //Sorting can be done using only one type
    {
        if(this.marks>a.marks)  // Sorting based on marks 
            return 1; // 1 means Swapping
        else
            return -1; //-1 means not Swapping
    }

}


public class Comparable_Implements_InsideClass {
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

        Collections.sort(al); // based on marks, elements are sorted already defined inside the class
        System.out.println("Sorting based on Marks  : \n"+al);        
        
       
    }
}
