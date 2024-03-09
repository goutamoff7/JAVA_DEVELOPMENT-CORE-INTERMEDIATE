package streamAPI;
import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class StreamAPI_Method_Chaining {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7,6,3,5,10,9,8);
        System.out.println(list);

        Stream<Integer> str = list.stream();
        Stream<Integer> finalStream = str.filter(n->n%2!=0).sorted().map(n->n*n); 
        // take the str stream then first filter odd numbers, then sort, then squaring each number 
        
        finalStream.forEach(n->System.out.print(n+", "));


    }
    
}
