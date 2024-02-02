import java.util.*;

class Collection_LinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet lhs1 = new LinkedHashSet();
		lhs1.add(100); // adding integer in lhs1
		lhs1.add(20); // adding integer in lhs1
		lhs1.add(13.5f); // adding float in lhs1
		lhs1.add(25.6); // adding double in lhs1
		lhs1.add('G'); // adding character in lhs1
		lhs1.add("Goutam dam"); // adding String in lhs1

		System.out.println(lhs1); // LinkedHashSet preserve the order of insertion
		LinkedHashSet lhs2 = new LinkedHashSet();
		lhs2.addAll(lhs1); // add lhsl the elemenlhs of lhs1 in lhs2
		// lhs2.add(2, 20); // index based addition not allowed
		lhs2.add(100);// Duplicate value if entered will not be included in LinkedHashSet.
		System.out.println(lhs2);
		System.out.println(lhs2.contains(100)); // searching the vlaue in the LinkedHashSet,
		System.out.println(lhs2.contains(200));// if contains then return true else false

		System.out.println("Size of the LinkedHashSet 2 : " + lhs2.size());
		lhs2.remove(25.6); // remove 25 of lhs2 only
		// ts2.remove(); //this method not exit in TreeSet
		System.out.println(lhs1);
		System.out.println(lhs2);
		lhs1.removeAll(lhs2); // remove all the lhs2 elements from lhs1.
		System.out.println(lhs1);
		System.out.println(lhs2);
		lhs2.clear(); // delete all element of lhs2
		System.out.println(lhs2);

	}
}
