package collectionFramework;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Arrays_asList_Method {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(20);
        al1.add(50);
        al1.add(30);
        al1.add(80);
        al1.add(100);
        al1.add(10);
        System.out.println(al1);

        List<Integer> al2 = Arrays.asList(20,50,30,80,100,10); // static method asList() return List<T>
        System.out.println(al2);
        
    }
}
