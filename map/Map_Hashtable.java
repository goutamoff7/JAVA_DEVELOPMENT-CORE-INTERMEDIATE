import java.util.*;

// Hashtable can not be used in Multi threading Environment.
class Collection_Hashtable {
	public static void main(String[] args) {
		Hashtable ht1 = new Hashtable();
		// ht1.put(null, null); // key=null, value=null cause NullPointerException
		ht1.put(1, 100); // puting integer as value in ht1
		ht1.put(2, 20); // puting integer as value in ht1
		// ht1.put(3, 13.5f); // puting float as value in ht1
		ht1.put(4, 25.6); // puting double as value in ht1
		ht1.put(5, 'G'); // puting character as value in ht1
		ht1.put(6, "Goutam Dam"); // puting String as value in ht1

		ht1.put(100, 1); // puting integer as key in ht1
		ht1.put(20, 2); // puting integer as key in ht1
		ht1.put(13.5f, 3); // puting float as key in ht1
		ht1.put(25.6, 4); // puting double as key in ht1
		ht1.put('G', 5); // puting character as key in ht1
		ht1.put("Goutam Dam", 6); // puting string as key in ht1

		System.out.println(ht1); // Order of Insertion not preserved

		Hashtable ht2 = new Hashtable();
		ht2.putAll(ht1); // put htl the elements of ht1 in ht2
		ht2.put(2, 8); // duplicate key does not enter into the hashtable
		ht2.put(7, 8); // but duplicate value can be allowed.
		System.out.println(ht2);
		System.out.println(ht1.get(6)); // getting value of 6ey 5 of ht1
		System.out.println(ht2.get("Goutam Dam")); // getting value of key "Goutam Dam" of ht2

		System.out.println(ht2.containsValue(100)); // searching the value in the Hashtable,
		System.out.println(ht2.containsValue(200));// if contains then return true else fhtse

		System.out.println(ht2.containsKey(2)); // searching the key in the Hashtable,
		System.out.println(ht2.containsKey(8));// if contains then return true else false

		System.out.println("Size of the HashTable 2 : " + ht2.size());
		ht2.remove(2); // remove the value key 2 only.
		ht1.remove('G', 5); // remove the key value pair.
		// ht2.remove(); //this method not exit in HashTable
		ht1.putIfAbsent(3, 13.5f); // if key, value is not present then included
		System.out.println(ht1);
		System.out.println(ht2);
		ht2.clear(); // delete all element of ht2
		System.out.println(ht1);
		System.out.println(ht2);
	}
}