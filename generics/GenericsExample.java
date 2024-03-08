package generics;
import java.util.*;

class Data<T>
{
    Integer a;
    String s;
   public Data(Integer a)
   {
        this.a=a;
   }
   public Data(String s)
   {
    this.s=s;
   }
   public Integer dispInteger()
   {
    return a;
   }
   public String dispString()
   {
    return s;
   }
@Override
public String toString() {
    return "Data [a=" + a + ", s=" + s + "]";
}

}
public class GenericsExample {
    public static void main(String[] args) {
        Data<Integer> ob=new Data<>(56);
        Data<String> ob1=new Data<>("Goutam");
        System.out.println(ob.dispInteger());
        System.out.println(ob1.dispString());
        
        ArrayList<Data> ald=new ArrayList<>();
        ald.add(ob);
        ald.add(ob1);
        ald.add(new Data<Integer>(10));
        System.out.println(ob);
        System.out.println(ob1);
        System.out.println(ald);

    }
}


