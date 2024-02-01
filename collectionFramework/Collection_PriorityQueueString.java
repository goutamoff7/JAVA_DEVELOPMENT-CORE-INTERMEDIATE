import java.util.*;

class Collection_PriorityQueueString {
	public static void main(String[] args) {
		PriorityQueue pq1 = new PriorityQueue();
		pq1.add("Ram"); // adding String in pq1
		pq1.add("Shyam"); // adding String in pq1
		pq1.add("Laxman");// adding String in pq1
		pq1.add("Mohan"); // adding String in pq1
		pq1.add("Raman"); // adding String in pq1
		pq1.add("Goutam");// adding String in pq1
		pq1.add("Shyam"); // adding String in pq1
		// pq1.add('A'); // adding char in pq1, cause runtime exception.
		// we can add int,float,double,char,String value in the Priority queue
		// homogenously,but hetergenous or mixed up data is not allowed
		// The first insertion type must be considered as the type of Priority Queue.
		System.out.println(pq1);
		PriorityQueue pq2 = new PriorityQueue();
		pq2.addAll(pq1); // add all the elements of pq1 in pq2
		// pq2.add(2, 20); // index based addition not allowed
		pq2.offer("Soham"); // offering value, it may be added or can't be added.
		pq2.add("Ram");// Duplicate value is allowed
		System.out.println(pq2);
		System.out.println(pq1.contains("Ram")); // searching the vlaue in the Priority Queue,
		System.out.println(pq1.contains("Hanuman"));// if contains then return true else false

	}
}