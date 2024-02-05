import java.util.*;

class Map_TreeMapDouble {
	public static void main(String[] args) {
		TreeMap tm1 = new TreeMap();
		// all the key is double.
		// tm1.put(null, null); // key=null, value=null cause NullPointerException
		tm1.put(100.5, 100); // puting integer as value in tm1
		tm1.put(50.6, 20); // puting integer as value in tm1
		// tm1.add(150.8,13.5f); // puting float as value in tm1
		tm1.put(25.3, 36.5); // puting double as value in tm1
		tm1.put(75.5, 'G'); // puting character as value in tm1
		tm1.put(125.9, "Goutam Dam"); // puting string as value in tm1

		// tm.put(100,50.6); // puting int as key in tm1, cause runtime exception.
		// we can put int,float,double,char,String as key in the TreeMap
		// homogenously,but hetergenous or mixed up of key is not allowed
		// The first insertion type must be considered as the type of key in TreeMap.

		System.out.println(tm1);
		// TreeMap in java follow Binary Search Tree in DSA,
		// parent value is greater than left child value and less than right child value
		// elements are shown as In-Order-Traversal (Left-Value-Right) while print.
		TreeMap tm2 = new TreeMap();
		tm2.putAll(tm1); // put all the elements of tm1 in tm2
		tm2.put(50.6, 8); // duplicate key does not enter into the hashMap
		tm2.put(80.9, 20); // but duplicate value can be allowed.
		tm1.putIfAbsent(150.8, 13.5f); // if key, value is not present then included
		System.out.println(tm2);

		System.out.println(tm2.containsValue(100)); // searching the value in the Hashtable,
		System.out.println(tm2.containsValue(200));// if contains then return true else fhtse

		System.out.println(tm2.containsKey(25.3)); // searching the key in the Hashtable,
		System.out.println(tm2.containsKey(8.6));// if contains then return true else false

		System.out.println("higherKey of 50.6 : " + tm2.higherKey(50.6));
		System.out.println("lowerKey of 50.6 : " + tm2.lowerKey(50.6));

		System.out.println("ceilingKey of 50.6 : " + tm2.ceilingKey(50.6));
		System.out.println("floorKey of 50.6 : " + tm2.floorKey(50.6));

		System.out.println("higherKey of 40.5 : " + tm2.higherKey(40.5));
		System.out.println("lowerKeyof 40.5 : " + tm2.lowerKey(40.5));

		System.out.println("ceilingKey of 40.5 : " + tm2.ceilingKey(40.5));
		System.out.println("floorKey of 40.5 : " + tm2.floorKey(40.5));

		System.out.println("higherEntry of 50.6 : " + tm2.higherEntry(50.6));
		System.out.println("lowerEntry of 50.6 : " + tm2.lowerEntry(50.6));

		System.out.println("ceilingEntry of 50.6 : " + tm2.ceilingEntry(50.6));
		System.out.println("floorEntry of 50.6 : " + tm2.floorEntry(50.6));

		System.out.println("higherEntry of 40.5 : " + tm2.higherEntry(40.5));
		System.out.println("lowerEntry of 40.5 : " + tm2.lowerEntry(40.5));

		System.out.println("ceilingEntry of 40.5 : " + tm2.ceilingEntry(40.5));
		System.out.println("floorEntry of 40.5 : " + tm2.floorEntry(40.5));

		System.out.println("In-Order-Traversal First Entry : " + tm2.firstEntry()); // In-Order-Traversal First
																					// Entry
		System.out.println("In-Order-Traversal Last Entry : " + tm2.lastEntry()); // In-Order-Traversal Last Entry

		System.out.println("In-Order-Traversal First key : " + tm2.firstKey()); // In-Order-Traversal First value
		System.out.println("In-Order-Traversal Last key : " + tm2.lastKey()); // In-Order-Traversal Last value

		System.out.println(tm1);
		tm1.remove(75.5); // Removes the mapping for this key from this TreeMap if present
		// tm2.remove(); //this method not exit in TreeMap
		System.out.println(tm1);

		System.out.println("descendingKeySet : " + tm1.descendingKeySet()); // descending order not reflected to
																			// original TreeMap
		// Returns a reverse order NavigableSet view of the keys contained in this map.
		System.out.println("descendingMap : " + tm1.descendingMap());// Returns a reverse order view of the mappings
																		// contained in this map.
		System.out.println(tm1);
		System.out.println(tm2);

		System.out.println("Size of the TreeMap 2 : " + tm2.size());

		tm2.replace(80.9, 25); // Replaces the entry for the key 80.9 only
		System.out.println(tm2);
		tm2.replace(80.9, 25, 20); // replace old value=25 to new value=20

		System.out.println(tm1);
		System.out.println(tm2);
		tm2.clear(); // delete all element of tm2
		System.out.println(tm1);
		System.out.println(tm2);
	}
}