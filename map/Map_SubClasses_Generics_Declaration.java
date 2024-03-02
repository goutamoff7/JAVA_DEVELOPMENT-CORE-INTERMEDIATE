import java.util.*;
public class Map_SubClasses_Generics_Declaration {
    public static void main(String[] args) {
// Sub classes of Map store <Key,Value> pair so we need to declare two Generics parameter.
        Hashtable<Integer,Float> ht = new Hashtable<>();
        TreeMap<Integer,Float> tm = new TreeMap<>();
        HashMap<Integer,Float> hm = new HashMap<>();
        HashMap<Integer,Double> lhm = new LinkedHashMap<>(); // LinkedHashMap is the child class of HashMap (Polymorphism)
        LinkedHashMap<Integer,Character> lhm2 = new LinkedHashMap<>();
    }
}
