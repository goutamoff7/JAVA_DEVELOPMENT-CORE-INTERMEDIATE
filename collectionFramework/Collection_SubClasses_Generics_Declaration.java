package collectionFramework;

import java.util.*;
public class Collection_SubClasses_Generics_Declaration {
    public static void main(String[] args) {
// Sub classes of Collection store <Value>  so we need to declare one Generics parameter.
        ArrayList<Integer> al =new ArrayList<>();
        LinkedList<Float> ll =new LinkedList<>();
        HashSet<Double> hm = new HashSet<>();
        HashSet<Float> lhm = new LinkedHashSet<>(); // LinkedHashSet is the child class of HashSet (Polymorphism)
        LinkedHashSet<Character> lhm2 = new LinkedHashSet<>();
        PriorityQueue<Float> pQueue =new PriorityQueue<>();
        ArrayDeque<Integer> aq =new ArrayDeque<>();
        TreeSet<Float> ts =new TreeSet<>();
    }
}
