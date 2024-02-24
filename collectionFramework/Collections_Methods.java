import java.util.ArrayList;
import java.util.Collections;

class Collections_Methods
{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(50);
        al.add(150);
        al.add(20);
        al.add(200);
        al.add(75);
        al.add(30);
        al.add(50);
        System.out.println(al);
        Collections.sort(al); // sort the elements of al using sort method (static) of Collections class 
        System.out.println(al);

        Collections.reverse(al);
        System.out.println(al);

        System.out.println("Frequency of 50 : "+Collections.frequency(al,50));

        System.out.println("Binary Search of 75 (index) : "+Collections.binarySearch(al, 75));

        Collections.rotate(al,3);
        System.out.println("rotate from 3: "+al);

        Collections.shuffle(al);
        System.out.println("Suffle : "+al);

        ArrayList<String> al2 = new ArrayList();
        al2.add("Ram");
        al2.add("Goutam");
        al2.add("Pw");
        Collections.sort(al2);
        System.out.println(al2);
       
    }
}