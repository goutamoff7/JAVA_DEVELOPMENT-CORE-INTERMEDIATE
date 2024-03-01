import java.io.*;
class FileWriter_Demo1
{
    public static void main(String[] args) throws IOException {
        
        File dir = new File("Files");
        File textFile = new File(dir,"Goutam.txt");

        // FileWriter create the file if not present prior.
        FileWriter fw = new FileWriter("Goutam.txt",true); // fw refering to "Goutam.txt" file directly in the current directory, true means append the text after existing text in the file. 

        FileWriter fw1 = new FileWriter("Files\\Goutam.txt",false); //fw1 refering to "Goutam.txt" file which is inside Files directory, by default append is false

        FileWriter fw2 = new FileWriter(textFile,true); // fw2 refering to textFile, which further refering to Goutam.txt file inside Files directory 

        fw.write("Hello");  // writing in the file "Goutam.txt" which is 
        fw.close(); // 

        //Existing file is overrriden by fw1.write() operation
        fw1.write(65);//A will be included
        fw1.write("\n");
        fw1.write('a'); // character 
        fw1.write("\n");
        fw1.write("Goutam");
        fw1.write("\n");
        char ch[] = {'j','a','v','a'};
        fw1.write(ch); // include char array
        fw1.write("\n");
        fw1.write("File-Handling");
        fw1.write("\n\n");
        fw1.close(); // for closing the resource

        // fw2.write() operations is appending after the existing text
        fw2.write(66);//B will be included
        fw2.write("\n");
        fw2.write('a'); // character 
        fw2.write("\n");
        fw2.write("Goutam");
        fw2.write("\n");
        char ch2[] = {'j','a','v','a'};
        fw2.write(ch2); // include char array
        fw2.write("\n");
        fw2.write("File-Handling");
        fw2.flush(); // whatever in the buffer is inserted in the list
       




    }
}