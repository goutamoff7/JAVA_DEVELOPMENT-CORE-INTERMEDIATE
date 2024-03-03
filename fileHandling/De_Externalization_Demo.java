import java.io.*;

class Students_Ex implements Externalizable
{
    String name;
    int age;
    int rno;
    int marks;

    public Students_Ex(){} // No-Argument Constructor Mandatory
     
    public Students_Ex(String name, int age, int rno,int marks) {
        
    }
    @Override
    public String toString() {
        return "Students_Ex [name=" + name + ", age=" + age + ", rno=" + rno + ", marks=" + marks + "]";
    }  
    @Override
    public void writeExternal(ObjectOutput out) throws IOException
    {}
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException
    {
       // Order of readObject should follow the order of writeObject during Externalization (name->marks->age) order
        name=(String)in.readObject();
        age=(int)in.readObject();      // here age and marks order swapped    
        marks=(int)in.readObject();    // hence, values are also swapped
    }
}

class De_Externalization_Demo
{
    public static void main(String[] args) throws IOException,ClassNotFoundException {
      
        File file = new File("external","Student.txt");//Assuming that "external" folder already exists

        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        
        Students_Ex std2 =(Students_Ex)ois.readObject();
        Students_Ex std1 =(Students_Ex)ois.readObject();        
        
        System.out.println(std2); 
        System.out.println(std1);       

        ois.close();
    }
}
