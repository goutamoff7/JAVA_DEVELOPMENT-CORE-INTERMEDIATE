import java.io.*;
class PrintWriter_Demo
{
    public static void main(String[] args) throws IOException {
        
        File dir = new File("Files");
        File textFile = new File(dir,"Goutam.txt");

        FileWriter fw = new FileWriter(textFile,true); 
        PrintWriter pw = new PrintWriter(fw); // act as a motor where we attach the stream "fw" to perform faster writing operation which accepts any type of data

        // pw.write() operations is appending after the existing text as we mentioned true in fw
        pw.write("\n");
        pw.write(66);//B will be included
        pw.write("\n");
        pw.write('a'); // character 
        pw.write("\n");
        pw.write("Goutam");
        pw.write("\n");
        char ch[] = {'j','a','v','a'};
        pw.write(ch); // include char array
        pw.write("\n");
        pw.write("PrintWriter");
        
        
        //using println() and print() method we can write any type of data in the file
        pw.println("Goutam dam");
        pw.print(10);// 10 is written here
        pw.println();
        pw.println('c'); // char is written here
        pw.println(25.6);// double is written here
        pw.println(13.9f);//float is written here
        pw.println(100l);// long is written here
        char ch2[] = {'j','a','v','a'};
        pw.println(ch2); // char array char is written here
        pw.print(true); // boolean is written here
        pw.flush(); 
        pw.close(); // closing pw internally closes fw

       




    }
}