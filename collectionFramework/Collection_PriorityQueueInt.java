import java.util.*;

class Collection_PriorityQueueInt {
	public static void main(String[] args) {		
		PriorityQueue pq1 = new PriorityQueue();
		pq1.add(100); // adding int in pq1
		pq1.add(50); // adding int in pq1
		pq1.add(150); // adding int in pq1
		pq1.add(25); // adding int in pq1
		pq1.add(75); // adding int in pq1
		pq1.add(125); // adding int in pq1
		pq1.add(175); // adding int in pq1
		
		// pq1.add(100.6); // adding double in pq1, cause runtime exception.
		// we can add int,float,double,char,String value in the Priority queue
		// homogenously,but hetergenous or mixed up data is not allowed
		// The first insertion type must be considered as the type of Priority Queue.
		System.out.println(pq1);
		// Priority Queue in java follow Minimum Heap DSA,
		// Parent value should lesser or equal to its child
		PriorityQueue pq2 = new PriorityQueue();
		pq2.addAll(pq1); // add all the elements of pq1 in pq2
		// pq2.add(2, 20); // index based addition not allowed
		pq2.offer(25); // offering value, it may be added or can't be added.
		pq2.add(150);// Duplicate value is allowed
		System.out.println(pq2);
		System.out.println(pq1.contains(100)); // searching the vlaue in the Priority Queue,
		System.out.println(pq1.contains(200));// if contains then return true else false

		System.out.println("Head Element of pq2 peek() method : " + pq2.peek());
		// Retrieves, but does not remove, the head of this queue, or returns null if
		// this queue is empty.
		System.out.println(pq2.poll());
		// Retrieves and removes the head of this queue, or returns null if this queue
		// is empty.
		System.out.println("After poll() method called : " + pq2);
		System.out.println("Size of the PriorityQueue 2 : " + pq2.size());
		pq2.remove(25);
		// Removes a single instance of the specified element from this queue, if it is
		// present.
		pq2.remove(); // same as poll(), throws exception if the queue is empty
		System.out.println(pq1);
		System.out.println(pq2);

		pq2.removeAll(pq1); // remove all the pq1 elements from pq2.
		System.out.println(pq2);
		pq2.clear(); // delete all element of pq2
		System.out.println(pq1);
		System.out.println(pq2);
		PriorityQueue pq3 = new PriorityQueue(pq1);
		System.out.println(pq3);
	}
}