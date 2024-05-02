package fileHandling.externalization;
import java.io.*;

class Students_Ex implements Externalizable
{
    String name;
    int age;
    int rno;
    int marks;

    public Students_Ex(){} // No-Argument Constructor is mandatory otherwise we will get InvalidClassException at the time of De-Externalization
     
    public Students_Ex(String name, int age, int rno, int marks) {
        this.name = name;
        this.age = age;
        this.rno = rno;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "Students_Ex [name=" + name + ", age=" + age + ", rno=" + rno + ", marks=" + marks + "]";
    }  
    @Override
    public void writeExternal(ObjectOutput out) throws IOException
    {          
        out.writeObject(name);  // out of 4 variable we store only 3  
        out.writeObject(marks); // name-marks-age this order is required during 
        out.writeObject(age);   //De-Externalization   
        
    }
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException
    {  } // No body required in Externalization
}

class Externalization_Demo
{
    public static void main(String[] args) throws IOException {
        
        Students_Ex std1 = new Students_Ex("Goutam", 26, 24,78);
        Students_Ex std2 = new Students_Ex("Arpan",21,25,85);

        File file = new File("external\\Student.txt");//Assuming that "external" folder already exists

        FileOutputStream fos = new FileOutputStream(file);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        System.out.println(std1);
        System.out.println(std2);

        oos.writeObject(std1); 
        // it will internally call writeExternal(ObjectOutput out) method of the target class
        oos.writeObject(std2); 
        
        oos.flush();
        oos.close();
    }
}
