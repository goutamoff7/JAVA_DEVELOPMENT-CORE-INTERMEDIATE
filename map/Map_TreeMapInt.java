import java.util.*;

class Map_TreeMapInt {
	public static void main(String[] args) {
		TreeMap tm1 = new TreeMap();
		// tm1.put(null, null); // key=null, value=null cause NullPointerException
		// all the key is integer.
		tm1.put(1, 100); // puting integer as value in hm1
		tm1.put(2, 20); // puting integer as value in hm1
		// tm1.put(3, 13.5f); // puting float as value in hm1
		tm1.put(5, 25.6); // puting double as value in hm1
		tm1.put(6, 'G'); // puting character as value in hm1
		tm1.put(8, "Goutam dam"); // puting String as value in hm1

		// tm.put(50.6,100); // puting int as key in tm1, cause runtime exception.
		// we can put int,float,double,char,String as key in the TreeMap
		// homogenously,but hetergenous or mixed up of key is not allowed
		// The first insertion type must be considered as the type of key in TreeMap.

		System.out.println(tm1);
		// TreeMap in java follow Binary Search Tree in DSA,
		// parent value is greater than left child value and less than right child value
		// elements are shown as In-Order-Traversal (Left-Value-Right) while print.
		TreeMap tm2 = new TreeMap();
		tm2.putAll(tm1); // put all the elements of tm1 in tm2
		tm2.put(2, 8); // duplicate key does not enter into the hashMap
		tm2.put(7, 20); // but duplicate value can be allowed.
		tm1.putIfAbsent(3, 13.5f); // if key, value is not present then included
		System.out.println(tm2);

		System.out.println(tm2.containsValue(100)); // searching the value in the Hashtable,
		System.out.println(tm2.containsValue(200));// if contains then return true else fhtse

		System.out.println(tm2.containsKey(2)); // searching the key in the Hashtable,
		System.out.println(tm2.containsKey(8));// if contains then return true else false

		System.out.println("higherKey of 2 : " + tm2.higherKey(2));
		System.out.println("lowerKey of 2 : " + tm2.lowerKey(2));

		System.out.println("ceilingKey of 2 : " + tm2.ceilingKey(2));
		System.out.println("floorKey of 2 : " + tm2.floorKey(2));

		System.out.println("higherKey of 4 : " + tm2.higherKey(4));
		System.out.println("lowerKeyof 4 : " + tm2.lowerKey(4));

		System.out.println("ceilingKey of 4 : " + tm2.ceilingKey(4));
		System.out.println("floorKey of 4 : " + tm2.floorKey(4));

		System.out.println("higherEntry of 2 : " + tm2.higherEntry(2));
		System.out.println("lowerEntry of 2 : " + tm2.lowerEntry(2));

		System.out.println("ceilingEntry of 2 : " + tm2.ceilingEntry(2));
		System.out.println("floorEntry of 2 : " + tm2.floorEntry(2));

		System.out.println("higherEntry of 4 : " + tm2.higherEntry(4));
		System.out.println("lowerEntry of 4 : " + tm2.lowerEntry(4));

		System.out.println("ceilingEntry of 4 : " + tm2.ceilingEntry(4));
		System.out.println("floorEntry of 4 : " + tm2.floorEntry(4));

		System.out.println("In-Order-Traversal First Entry : " + tm2.firstEntry()); // In-Order-Traversal First
																					// Entry
		System.out.println("In-Order-Traversal Last Entry : " + tm2.lastEntry()); // In-Order-Traversal Last Entry

		System.out.println("In-Order-Traversal First key : " + tm2.firstKey()); // In-Order-Traversal First value
		System.out.println("In-Order-Traversal Last key : " + tm2.lastKey()); // In-Order-Traversal Last value

		System.out.println(tm1);
		tm1.remove(8); // Removes the mapping for this key from this TreeMap if present
		// tm2.remove(); //this method not exist in TreeMap
		System.out.println(tm1);

		System.out.println("descendingKeySet : " + tm1.descendingKeySet());
		// Returns a reverse order NavigableSet view of the keys contained in this map.
		System.out.println("descendingMap : " + tm1.descendingMap());
		// Returns a reverse order view of the mappings contained in this map.

		System.out.println("Size of the TreeMap 2 : " + tm2.size());

		tm2.replace(7, 25); // Replaces the entry for the key 7 only
		System.out.println(tm2);
		tm2.replace(7, 25, 20); // replace old value=25 to new value=20
		System.out.println(tm2);
		tm2.clear(); // delete all element of tm2
		System.out.println(tm2);
	}
}