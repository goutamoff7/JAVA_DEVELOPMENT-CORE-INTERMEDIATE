package collectionFramework;

import java.util.List;
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
public class ForEach_Method {
    public static void main(String[] args) {

        List<Integer> al2 = Arrays.asList(20,50,30,80,100,10); // static method asList() return List<T>
        System.out.println(al2);
        //Anonymous inner class approach
        Consumer<Integer> con = new Consumer<Integer>() //Consumer is a functional interface
        {
            @Override
            public void accept(Integer n) 
            {
                System.out.print(n+", ");
            }
        };
        al2.forEach(con); // default method forEach() of Iterable interface accepts Consumer interface as parameter. use for iteration of list instead of external loops

        System.out.println();

        //Anonymous inner class with lambda expresion
        Consumer<Integer> con2 = n->System.out.print(n+", ");        
        al2.forEach(con2);

        System.out.println();

        // Lambda expression as a parameter of forEach() method
        al2.forEach(n->System.out.print(n+", "));
    }
}
