package fileHandling;
import java.io.*;
class FileWriter_BufferedWriter
{
    public static void main(String[] args) throws Exception{
        File dir = new File("Folder");
        if(!dir.isDirectory())
             dir.mkdir();
        File file = new File(dir,"Demo.txt");
        if(!file.isFile())    
            file.createNewFile();
        BufferedWriter  bw = new BufferedWriter(new FileWriter(file,true));
        bw.write("Hello Programmers this is the text file to demonstrate the FileHandling");
        bw.newLine();
        bw.write("Good Bye");

        bw.flush();
        bw.close();        
        
    }
}