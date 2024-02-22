import java.util.*;

// LinkedLinkedHashMap can be used in Multi threading Environment.
class Collection_LinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap lhm1 = new LinkedHashMap();
		lhm1.put(null, null); // key=null, value=null is allowed in LinkedHashMap
		lhm1.put(1, 100); // puting integer as value in lhm1
		lhm1.put(2, 20); // puting integer as value in lhm1
		// lhm1.put(3, 13.5f); // puting float as value in lhm1
		lhm1.put(4, 25.6); // puting double as value in lhm1
		lhm1.put(5, 'G'); // puting character as value in lhm1
		lhm1.put(6, "Goutam dam"); // puting String as value in lhm1

		System.out.println("lhm1 : " + lhm1); // Order of Insertion preserved
		LinkedHashMap lhm2 = new LinkedHashMap();
		lhm2.put(100, 1); // puting integer as key in lhm2
		lhm2.put(20, 2); // puting integer as key in lhm2
		lhm2.put(13.5f, 3); // puting float as key in lhm2
		lhm2.put(25.6, 4); // puting double as key in lhm2
		lhm2.put('G', 5); // puting character as key in lhm2
		lhm2.put("Goutam dam", 6); // puting string as key in lhm2
		System.out.println("lhm2 : " + lhm2);

		LinkedHashMap lhm3 = new LinkedHashMap();
		lhm3.putAll(lhm1); // put all the elements of lhm1 in lhm3
		System.out.println("lhm3 : " + lhm3);
		lhm2.put(20, 8); // duplicate key does not enter into the LinkedHashMap
		lhm2.put(7, 6); // but duplicate value can be allowed.
		lhm2.replace(7, 25); // Replaces the entry for the key 7 only
		System.out.println(lhm2);
		lhm2.replace(7, 25, 20); // replace old value=25 to new value=20
		System.out.println(lhm2);
		System.out.println(lhm1.get(6)); // getting value of key 6 of lhm1
		System.out.println(lhm2.get("Goutam dam")); // getting value of key "Goutam dam" of lhm2

		System.out.println("isEmpty : " + lhm2.isEmpty());
		System.out.println("keySet : " + lhm2.keySet());// Returns a Set view of the keys contained in this map.
		System.out.println("entrySet : " + lhm2.entrySet());// Returns a Set view of the mappings contained in this map.

		System.out.println(lhm3.containsValue(100)); // searching the value in the LinkedHashMap,
		System.out.println(lhm3.containsValue(200));// if contains then return true else false

		System.out.println("Collection :values() : " + lhm2.values());
		// Returns a Collection view of the values contained in this map.

		System.out.println(lhm3.containsKey(2)); // searching the keu in the LinkedHashMap,
		System.out.println(lhm3.containsKey(8));// if contains then return true else false

		System.out.println("Size of the LinkedHashMap 2 : " + lhm2.size());
		lhm2.remove(2); // remove the value key 2 only.
		lhm2.remove('G', 5); // remove the key value pair.
		// lhm2.remove(); //this method not exit in LinkedHashMap
		lhm1.putIfAbsent(3, 13.5f); // if key, value is not present then included
		System.out.println(lhm1);
		System.out.println(lhm2);
		lhm1.clear(); // delete all element of lhm2
		System.out.println(lhm1);
	}
}