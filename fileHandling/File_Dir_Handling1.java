import java.io.*;
public class File_Dir_Handling1 {
    public static void main(String[] args) throws IOException{
        
        FileReader_Demo1 file = new FileReader_Demo1("Goutam.txt");
        file.createNewFile(); // creating new file " Goutam.txt"
        System.out.println(file.exists()); // checks if file or folder with the given name "Goutam.txt" exists or not
        System.out.println(file.isFile()); // checks if "Goutam.txt" file is exists or not

        FileReader_Demo1 dir = new FileReader_Demo1("Files");
        dir.mkdir(); // creating director/folder.
        System.out.println(dir.exists()); // checks if file or folder with the given name "Files" exists or not"Files" exists or not
        System.out.println(dir.isDirectory());  // checks if "Goutam.txt" folder is exists or not



    }
}
