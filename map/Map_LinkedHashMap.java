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
		lhm1.put(6, "Goutam Dam"); // puting String as value in lhm1

		lhm1.put(100, 1); // puting integer as key in lhm1
		lhm1.put(20, 2); // puting integer as key in lhm1
		lhm1.put(13.5f, 3); // puting float as key in lhm1
		lhm1.put(25.6, 4); // puting double as key in lhm1
		lhm1.put('G', 5); // puting character as key in lhm1
		lhm1.put("Goutam Dam", 6); // puting string as key in lhm1

		System.out.println(lhm1); // Order of Insertion is preserved

		LinkedHashMap lhm2 = new LinkedHashMap();
		lhm2.putAll(lhm1); // put lhml the elements of lhm1 in lhm2
		lhm2.put(2, 8); // duplicate key does not enter into the LinkedHashMap
		lhm2.put(7, 8); // but duplicate value can be allowed.
		System.out.println(lhm2);
		System.out.println(lhm1.get(6)); // getting value of key 6 of lhm1
		System.out.println(lhm2.get("Goutam Dam")); // getting value of key "Goutam Dam" of lhm2

		System.out.println(lhm2.containsValue(100)); // searching the value in the LinkedHashMap,
		System.out.println(lhm2.containsValue(200));// if contains then return true else false

		System.out.println(lhm2.containsKey(2)); // searching the keu in the LinkedHashMap,
		System.out.println(lhm2.containsKey(8));// if contains then return true else false

		System.out.println("Size of the HashTable 2 : " + lhm2.size());
		lhm2.remove(2); // remove the value key 2 only.
		lhm1.remove('G', 5); // remove the key value pair.
		// lhm2.remove(); //this method not exit in LinkedHashMap
		lhm1.putIfAbsent(3, 13.5f); // if key, value is not present then included
		System.out.println(lhm1);
		System.out.println(lhm2);
		lhm2.clear(); // delete all element of lhm2
		System.out.println(lhm1);
		System.out.println(lhm2);
	}
}