
class Student{
    String name;
    int marks;
    @Override
    public String toString() {
        return "Student [name=" + name + ", marks=" + marks + "]";
    }
    
}

class ObjectArray{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Goutam Dam";
        s1.marks = 85;

        Student s2 = new Student();
        s2.name = "Arpan Kundu";
        s2.marks = 95;

        Student students[] = {s1,s2};

        System.out.println(students[0]);
        System.out.println(students[1]);

    }
}