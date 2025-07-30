package collectionFramework;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ExerciseListSet {
    public static void main(String[] args) {        
        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "David", "Bob");
        
        // TODO: Print the original list
        System.out.println(names);

        // TODO: Convert the list to a LinkedHashSet to remove duplicates while preserving order
        Set<String> uniqueNames = new LinkedHashSet<>(names);

        // TODO: Print the set of unique names
        System.out.println("Unique Names: "+uniqueNames);
        
    }

}
