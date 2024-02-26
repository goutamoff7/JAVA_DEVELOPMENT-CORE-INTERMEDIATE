import java.io.*;
class BufferedWriter_Demo
{
    public static void main(String[] args) throws IOException {
        
        File dir = new File("Files");
        File textFile = new File(dir,"Goutam.txt");

        FileWriter fw = new FileWriter(textFile,true); 
        BufferedWriter bw = new BufferedWriter(fw); // act as a motor where we attach the stream "fw" to perform faster writing operation which accepts any type of data

        // bw.write() operations is appending after the existing text as we mentioned true in fw
        bw.write("\n");
        bw.write(66);//B will be included
        bw.write("\n");
        bw.write('a'); // character 
        bw.write("\n");
        bw.write("Goutam");
        bw.write("\n");
        char ch[] = {'j','a','v','a'};
        bw.write(ch); // include char array
        bw.write("\n");
        bw.write("BufferedWriter");
        bw.flush(); // whatever in the buffer is inserted in the list
        bw.close();    

    }
}