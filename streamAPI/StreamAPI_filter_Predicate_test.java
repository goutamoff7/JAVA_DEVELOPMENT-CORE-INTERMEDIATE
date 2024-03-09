package streamAPI;
import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.function.Predicate;

public class StreamAPI_filter_Predicate_test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7,6,3,5,10,9,8);
        System.out.println(list);

        Stream<Integer> str = list.stream();
        
        //implement test method of Predicate Interface
        // Predicate<Integer> pre = new Predicate<Integer>() {
            
        //         @Override   
        //         public boolean test(Integer n)
        //         {
        //             if(n%2!=0)  // take only odd number
        //                 return true;
        //             else
        //                 return false;
        //         }
            
        // };  
        // Stream<Integer> filtered = str.filter(pre);  // Passing Predicate as argument in map method
        
        //Implement using lambda expression , similar work in one line
        Stream<Integer> filtered =str.filter(n->n%2!=0);
        
        filtered.forEach(n->System.out.print(n+", "));


    }
    
}
