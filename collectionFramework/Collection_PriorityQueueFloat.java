import java.util.*;

class Collection_PriorityQueueFloat {
	public static void main(String[] args) {
		PriorityQueue pq1 = new PriorityQueue();
		pq1.add(100.5f); // adding float in pq1
		pq1.add(50.6f); // adding float in pq1
		pq1.add(150.8f); // adding float in pq1
		pq1.add(25.3f); // adding float in pq1
		pq1.add(75.8f); // adding float in pq1
		pq1.add(125.6f); // adding float in pq1
		pq1.add(175.4f); // adding float in pq1

		// pq1.add(100.6); // adding double in pq1, cause runtime exception.
		// we can add int,float,double,char,String value in the Priority queue
		// homogenously,but hetergenous or mixed up data is not allowed
		// The first insertion type must be considered as the type of Priority Queue.
		System.out.println(pq1);
		PriorityQueue pq2 = new PriorityQueue();
		pq2.addAll(pq1); // add all the elements of pq1 in pq2
		// pq2.add(2, 20); // index based addition not allowed
		pq2.offer(25.6f); // offering value, it may be added or can't be added.
		pq2.add(150.9f);// Duplicate value is allowed
		System.out.println(pq2);
		System.out.println(pq1.contains(100.5f)); // searching the vlaue in the Priority Queue,
		System.out.println(pq1.contains(200));// if contains then return true elde false

	}
}