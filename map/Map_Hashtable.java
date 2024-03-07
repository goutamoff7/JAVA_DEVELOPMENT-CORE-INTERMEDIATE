package map;
import java.util.*;

// Hashtable can not be used in Multi threading Environment.
class Map_Hashtable {
	public static void main(String[] args) {
		Hashtable ht1 = new Hashtable();
		// ht1.put(null, null); // key=null, value=null cause NullPointerException
		ht1.put(1, 100); // puting integer as value in ht1
		ht1.put(2, 20); // puting integer as value in ht1
		// ht1.put(3, 13.5f); // puting float as value in ht1
		ht1.put(4, 25.6); // puting double as value in ht1
		ht1.put(5, 'G'); // puting character as value in ht1
		ht1.put(6, "Goutam dam"); // puting String as value in ht1

		System.out.println("ht1 : " + ht1); // Order of Insertion not preserved

		Hashtable ht2 = new Hashtable();
		ht2.put(100, 1); // puting integer as key in ht1
		ht2.put(20, 2); // puting integer as key in ht1
		ht2.put(13.5f, 3); // puting float as key in ht1
		ht2.put(25.6, 4); // puting double as key in ht1
		ht2.put('G', 5); // puting character as key in ht1
		ht2.put("Goutam dam", 6); // puting string as key in ht1
		System.out.println("ht2 : " + ht2); // Order of Insertion not preserved

		Hashtable ht3 = new Hashtable();
		ht3.putAll(ht1); // put htl the elements of ht1 in ht2
		System.out.println("ht3 : " + ht3);

		ht2.put(20, 8); // duplicate key does not enter into the hashtable
		ht2.put(7, 6); // but duplicate value can be allowed.

		ht2.replace(7, 25); // Replaces the entry for the key 7 only
		System.out.println(ht2);
		ht2.replace(7, 25, 20); // replace old value=25 to new value=20
		System.out.println(ht2);

		System.out.println(ht1.get(6)); // getting value of key 6 of ht1
		System.out.println(ht2.get("Goutam dam")); // getting value of key "Goutam Dam" of ht2

		System.out.println("isEmpty : " + ht2.isEmpty());
		System.out.println("keySet : " + ht2.keySet());// Returns a Set view of the keys contained in this map.
		System.out.println("entrySet : " + ht2.entrySet());// Returns a Set view of the mappings contained in this map.

		System.out.println(ht3.containsValue(100)); // searching the value in the Hashtable,
		System.out.println(ht3.containsValue(200));// if contains then return true else fhtse

		System.out.println("Collection :values() : " + ht2.values());
		// Returns a Collection view of the values contained in this map.

		System.out.println(ht3.containsKey(2)); // searching the key in the Hashtable,
		System.out.println(ht3.containsKey(8));// if contains then return true else false


		System.out.println("Size of the Hashtable 2 : " + ht2.size());
		ht2.remove(20); // remove the value key 20 only.
		ht2.remove('G', 5); // remove the key value pair.
		// ht2.remove(); //this method not exist in Hashtable
		ht1.putIfAbsent(3, 13.5f); // if key, value is not present then included
		System.out.println(ht1);
		System.out.println(ht2);
		ht1.clear(); // delete all element of ht2
		System.out.println(ht1);
	}
}