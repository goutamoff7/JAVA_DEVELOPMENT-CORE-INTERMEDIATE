package map;
import java.util.*;

// HashMap can be used in Multi threading Environment.
class Collection_HashMap {
	public static void main(String[] args) {
		HashMap hm1 = new HashMap();
		hm1.put(null, null); // key=null, value=null is allowed in HashMap
		hm1.put(1, 100); // puting integer as value in hm1
		hm1.put(2, 20); // puting integer as value in hm1
		// hm1.put(3, 13.5f); // puting float as value in hm1
		hm1.put(4, 25.6); // puting double as value in hm1
		hm1.put(5, 'G'); // puting character as value in hm1
		hm1.put(6, "Goutam Dam"); // puting String as value in hm1

		System.out.println("hm1 : " + hm1); // Order of Insertion not preserved

		HashMap hm2 = new HashMap();
		hm2.put(100, 1); // puting integer as key in hm2
		hm2.put(20, 2); // puting integer as key in hm2
		hm2.put(13.5f, 3); // puting float as key in hm2
		hm2.put(25.6, 4); // puting double as key in hm2
		hm2.put('G', 5); // puting character as key in hm2
		hm2.put("Goutam dam", 6); // puting string as key in hm2
		System.out.println("hm2 : " + hm2);
		HashMap hm3 = new HashMap();

		hm3.putAll(hm1); // put all the elements of hm1 in hm3
		System.out.println("hm3 : " + hm3);

		hm2.put(20, 8); // duplicate key does not enter into the hashMap
		hm2.put(7, 6); // but duplicate value can be allowed.
		hm2.replace(7, 25); // Replaces the entry for the key 7 only
		
		System.out.println(hm2);
		hm2.replace(7, 25, 20); // replace old value=25 to new value=20
		System.out.println(hm2);

		System.out.println(hm1.get(6)); // getting value of key 6 of hm1
		System.out.println(hm2.get("Goutam dam")); // getting value of key "Goutam Dam" of hm2

		System.out.println("isEmpty : " + hm2.isEmpty());
		System.out.println("keySet : " + hm2.keySet());// Returns a Set view of the keys contained in this map.
		System.out.println("entrySet : " + hm2.entrySet());// Returns a Set view of the mappings contained in this map.
		System.out.println(hm3.containsValue(100)); // searching the value in the HashMap,
		System.out.println(hm3.containsValue(200));// if contains then return true else false

		System.out.println("Collection :values() : " + hm2.values());
		// Returns a Collection view of the values contained in this map.
		System.out.println(hm3.containsKey(2)); // searching the key in the HashMap,
		System.out.println(hm3.containsKey(8));// if contains then return true else false

		System.out.println("Size of the HashMap 2 : " + hm2.size());
		hm2.remove(20); // remove the value of key=20 only.
		hm2.remove('G', 5); // remove the key value pair.
		// hm2.remove(); //this method not exist in HashMap
		hm1.putIfAbsent(3, 13.5f); // if key, value is not present then included
		System.out.println(hm1);
		System.out.println(hm2);
		hm1.clear(); // delete all element of hm1
		System.out.println(hm1);
	}
}