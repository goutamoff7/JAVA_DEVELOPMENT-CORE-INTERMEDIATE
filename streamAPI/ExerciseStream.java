package streamAPI;

import java.util.*;
import java.util.stream.*;

public class ExerciseStream {
    public static void main(String[] args) {
       
        List<String> products = Arrays.asList("Laptop", "Pen", "Notebook", "Headphones", "Smartphone");

        // TODO: Print the original list
        System.out.println("Original List: "+products);
        
        // TODO: Filter names longer than 5 characters, convert to uppercase, sort, and collect into a list
        List<String> filteredProducts = products
        .stream()
        .filter(p->p.length()>5)
        .map(String::toUpperCase)
        .sorted((p1,p2)->p1.length()-p2.length()) // ascending order sort based on length
        .toList();
 
        // TODO: Print the filtered list
        System.out.println("Filtered Products: "+filteredProducts);
    }
}

