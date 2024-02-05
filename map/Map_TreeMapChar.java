import java.util.*;

class Map_TreeMapChar {
	public static void main(String[] args) {
		TreeMap tm1 = new TreeMap();
		// tm1.put(null, null); // key=null, value=null cause NullPointerException
		// all the key is char.
		tm1.put('A', 100); // puting integer as value in hm1
		tm1.put('M', 20); // puting integer as value in hm1
		// hm1.put(C, 13.5f); // puting float as value in hm1
		tm1.put('E', 25.6); // puting double as value in hm1
		tm1.put('D', 'G'); // puting character as value in hm1
		tm1.put('K', "Goutam Dam"); // puting String as value in hm1

		// tm.put(5,100); // puting int as key in tm1, cause runtime exception.
		// we can put int,float,double,char,String as key in the TreeMap
		// homogenously,but hetergenous or mixed up of key is not allowed
		// The first insertion type must be considered as the type of key in TreeMap.

		System.out.println(tm1);
		// TreeMap in java follow Binary Search Tree in DSA,
		// parent value is greater than left child value and less than right child value
		// elements are shown as In-Order-Traversal (Left-Value-Right) while print.
		TreeMap tm2 = new TreeMap();
		tm2.putAll(tm1); // put all the elements of tm1 in tm2
		tm2.put('H', 8); // duplicate key does not enter into the hashMap
		tm2.put('S', 20); // but duplicate value can be allowed.
		tm1.putIfAbsent('C', 13.5f); // if key, value is not present then included
		System.out.println(tm2);

		System.out.println(tm2.containsValue(100)); // searching the value in the Hashtable,
		System.out.println(tm2.containsValue(200));// if contains then return true else fhtse

		System.out.println(tm2.containsKey('C')); // searching the key in the Hashtable,
		System.out.println(tm2.containsKey('T'));// if contains then return true else false

		System.out.println("higherKey of 'E' : " + tm2.higherKey('E'));
		System.out.println("lowerKey of 'E' : " + tm2.lowerKey('E'));

		System.out.println("ceilingKey of 'E' : " + tm2.ceilingKey('E'));
		System.out.println("floorKey of 'E' : " + tm2.floorKey('E'));

		System.out.println("higherKey of 'J' : " + tm2.higherKey('J'));
		System.out.println("lowerKeyof 'J' : " + tm2.lowerKey('J'));

		System.out.println("ceilingKey of 'J' : " + tm2.ceilingKey('J'));
		System.out.println("floorKey of 'J' : " + tm2.floorKey('J'));

		System.out.println("higherEntry of 'E' : " + tm2.higherEntry('E'));
		System.out.println("lowerEntry of 'E' : " + tm2.lowerEntry('E'));

		System.out.println("ceilingEntry of 'E' : " + tm2.ceilingEntry('E'));
		System.out.println("floorEntry of 'E' : " + tm2.floorEntry('E'));

		System.out.println("higherEntry of 'J' : " + tm2.higherEntry('J'));
		System.out.println("lowerEntry of 'J' : " + tm2.lowerEntry('J'));

		System.out.println("ceilingEntry of 'J' : " + tm2.ceilingEntry('J'));
		System.out.println("floorEntry of 'J' : " + tm2.floorEntry('J'));

		System.out.println("In-Order-Traversal First Entry : " + tm2.firstEntry()); // In-Order-Traversal First
																					// Entry
		System.out.println("In-Order-Traversal Last Entry : " + tm2.lastEntry()); // In-Order-Traversal Last Entry

		System.out.println("In-Order-Traversal First key : " + tm2.firstKey()); // In-Order-Traversal First value
		System.out.println("In-Order-Traversal Last key : " + tm2.lastKey()); // In-Order-Traversal Last value

		System.out.println(tm1);
		tm1.remove('H'); // Removes the mapping for this key from this TreeMap if present
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

		tm2.replace('S', 25); // Replaces the entry for the key 7 only
		System.out.println(tm2);
		tm2.replace('S', 25, 20); // replace old value=25 to new value=20

		System.out.println(tm1);
		System.out.println(tm2);
		tm2.clear(); // delete all element of tm2
		System.out.println(tm1);
		System.out.println(tm2);
	}
}