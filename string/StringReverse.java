import java.io.*;
import java.util.*;

public class StringReverse {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter any String: ");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String str = read.readLine();
        String s = "";
        for (int i = str.length() - 1; i >= 0; i--)
            s += str.charAt(i);
        System.out.println(s);
    }

}
