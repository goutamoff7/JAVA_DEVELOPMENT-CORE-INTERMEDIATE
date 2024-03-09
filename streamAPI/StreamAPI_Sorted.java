package streamAPI;
import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class StreamAPI_Sorted {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(50,100,90,80,70,160,30);

        Stream<Integer> str = list.stream();
        Stream<Integer> strSorted = str.sorted(); // increasing order 
        Stream<Integer> strSortedReverse = strSorted.sorted(
        (a,b)->
        { 
        if(a>b)
            return -1; // no swapping
        else    
            return 1; // swapping
        });   //Sorted in Decreasing order using sorted(comparator) method
        strSortedReverse.forEach(n->System.out.print(n+", "));


    }
    
}
