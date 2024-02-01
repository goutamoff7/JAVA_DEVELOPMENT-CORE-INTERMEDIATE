import java.util.*;

class Collection_TreeSetString {
	public static void main(String[] args) {
		TreeSet ts1 = new TreeSet();
		ts1.add("Ram"); // adding String in ts1
		ts1.add("Shyam"); // adding String in ts1
		ts1.add("Laxman");// adding String in ts1
		ts1.add("Mohan"); // adding String in ts1
		ts1.add("Raman"); // adding String in ts1
		ts1.add("Goutam");// adding String in ts1
		ts1.add("Shyam"); // adding String in ts1
		ts1.add("A"); // adding String in ts1

		// ts1.add(100); // adding int in ts1, cause runtime exception.
		// we can add int,float,double,char,String value in the TreeSet
		// homogenously,but hetergenous or mixed up data is not allowed
		// The first insertion type must be considered as the type of TreeSet.

		System.out.println(ts1);
		// TreeSet in java follow Binary Search Tree in DSA,
		// parent value is greater than left child value and less than right child value
		// elements are shown as In-Order-Traversal (Left-Value-Right) while print.
		TreeSet ts2 = new TreeSet();
		ts2.addAll(ts1); // add all the elements of ts1 in ts2
		// ts2.add(2, 20); // index based addition not allowed
		ts2.add("Goutam");// Duplicate value if entered will not be included in TreeSet.
		System.out.println(ts2);
		System.out.println(ts2.contains("Goutam"));// searching the value in the TreeSet
		System.out.println(ts2.contains("Z"));// if contains then return true else return false
		System.out.println("higher of A : " + ts2.higher("A"));
		System.out.println("lower of A : " + ts2.lower("A"));

		System.out.println("ceiling of A : " + ts2.ceiling("A"));
		System.out.println("floor of A : " + ts2.floor("A"));

		System.out.println("higher of B : " + ts2.higher("B"));
		System.out.println("lower of B : " + ts2.lower("B"));

		System.out.println("ceiling of B : " + ts2.ceiling("B"));
		System.out.println("floor of B : " + ts2.floor("B"));

		System.out.println("In-Order-Traversal First value : " + ts2.first()); // In-Order-Traversal First value
		System.out.println("In-Order-Traversal Last value : " + ts2.last()); // In-Order-Traversal Last value

		System.out.println(ts1);
		ts1.remove("A");
		System.out.println(ts1);

		System.out.println(ts1.descendingSet()); // descending order not reflected to original TreeSet
		System.out.println(ts1);

		ts1.clear(); // removing all the elements permanently from the TreeSet
		System.out.println(ts1);
	}
}