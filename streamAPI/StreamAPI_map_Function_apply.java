package streamAPI;
import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.function.Function;

public class StreamAPI_map_Function_apply {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7,6,3,5,10,9,8);
        System.out.println(list);

        Stream<Integer> str = list.stream();
        
        //implement apply method of Funtion Interface
        //Function<Integer,Integer> fun = new Function<Integer,Integer>() {
            
        //         @Override   
        //         public Integer apply(Integer n)
        //         {
        //             return n*n;
        //         }
            
        // };  
        // Stream<Integer> mapped = str.map(fun);  // Passing Funtion as argument in map method
        
        //Implement using lambda expression , similar work in one line
        Stream<Integer> mapped =str.map(n->n*n);
        
        mapped.forEach(n->System.out.print(n+", "));


    }
    
}
