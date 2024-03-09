package streamAPI;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
class StreamAPI_Demo1
{
    public static void main(String args[])
    {
        List<Integer> list = Arrays.asList(60,50,10,90,80,70);
        System.out.println(list);
        
        Stream<Integer> str = list.stream(); // make a stream (copy) of above list to perform different operation without affecting the original list, can be consume (use) once.

        str.forEach(n->System.out.print(n+", ")); // consume the str stream once to display

        //str.forEach(n->System.out.print(n+", ")); 
        // (try to consume str stream again) cause Exception:java.lang.IllegalStateException: stream has already been operated upon or closed 
    }
}