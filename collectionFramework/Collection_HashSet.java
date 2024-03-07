package collectionFramework;

import java.util.*;

class Collection_HashSet {
	public static void main(String[] args) {
		HashSet hs1 = new HashSet();
		hs1.add(null); // null insertion allowed
		hs1.add(100); // adding integer in hs1
		hs1.add(20); // adding integer in hs1
		hs1.add(13.5f); // adding float in hs1
		hs1.add(25.6); // adding double in hs1
		hs1.add('G'); // adding character in hs1
		hs1.add("Goutam dam"); // adding String in hs1

		System.out.println(hs1); // HashSet does not preserve the order of insertion
		HashSet hs2 = new HashSet();
		hs2.addAll(hs1); // add hsl the elemenhs of hs1 in hs2
		// hs2.add(2, 20); // index based addition not allowed
		hs2.add(100);// Duplicate value if entered will not be included in HashSet.
		System.out.println(hs2);
		System.out.println(hs2.contains(100)); // searching the vlaue in the HashSet,
		System.out.println(hs2.contains(200));// if contains then return true else false

		System.out.println("isEmpty : " + hs2.isEmpty());
		System.out.println("Size of the HashSet 2 : " + hs2.size());
		hs2.remove(25.6); // remove 25.6 of hs2 only
		// hs2.remove(); //this method not exist in HashSet
		System.out.println(hs1);
		System.out.println(hs2);
		hs1.removeAll(hs2); // remove all the hs2 elements from hs1.
		System.out.println(hs1);
		System.out.println(hs2);
		hs2.clear(); // delete all element of hs2
		System.out.println(hs2);

	}
}
