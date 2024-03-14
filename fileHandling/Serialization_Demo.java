package fileHandling;
import java.io.*;

class Student implements Serializable
{
    String name;
    int age;
    int rno;
    public Student(String name, int age, int rno) {
        this.name = name;
        this.age = age;
        this.rno = rno;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", rno=" + rno + "]";
    }   
}

class Serialization_Demo
{
    public static void main(String[] args) throws IOException {
        
        Student std1 = new Student("Goutam", 26, 24);
        Student std2 = new Student("Arpan",21,25);

        File file = new File("Files","obj.txt");//Assuming that "Files" folder already exists

        FileOutputStream fos = new FileOutputStream(file);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        System.out.println(std1);
        oos.writeObject(std1);

        System.out.println(std2);
        oos.writeObject(std2);

        oos.flush();
        oos.close();
    }
}
