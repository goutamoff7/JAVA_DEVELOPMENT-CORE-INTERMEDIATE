import java.io.*;

class Students_Ex implements Externalizable
{
    String name;
    int age;
    int rno;
    int marks;

    public Students_Ex(){} // No-Argument Constructor Mandatory
     
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
        out.writeObject(name);
        out.writeObject(marks);
        out.writeObject(age);      
        
    }
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException
    {       
        // name=(String)in.readObject();
        // marks=(int)in.readObject();
        // age=(int)in.readObject();
      
    }
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
        oos.writeObject(std2);
        
        oos.flush();
        oos.close();
    }
}
