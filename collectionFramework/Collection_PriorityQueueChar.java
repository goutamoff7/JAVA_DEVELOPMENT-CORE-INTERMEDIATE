import java.util.*;

class Collection_PriorityQueueChar {
	public static void main(String[] args) {
		PriorityQueue pq1 = new PriorityQueue();
		pq1.add('C'); // adding char in pq1
		pq1.add('G'); // adding char in pq1
		pq1.add('A'); // adding char in pq1
		pq1.add('B'); // adding char in pq1
		pq1.add('N'); // adding char in pq1
		pq1.add('O'); // adding char in pq1
		pq1.add('D'); // adding char in pq1

		// pq1.add(100); // adding int in pq1, cause runtime exception.
		// we can add int,float,double,char,String value in the Priority queue
		// homogenously,but hetergenous or mixed up data is not allowed
		// The first insertion type must be considered as the type of Priority Queue.
		System.out.println(pq1);
		PriorityQueue pq2 = new PriorityQueue();
		pq2.addAll(pq1); // add all the elements of pq1 in pq2
		// pq2.add(2, 20); // index based addition not allowed
		pq2.offer('S'); // offering value, it may be added or can't be added.
		pq2.add('D');// Duplicate value is allowed
		System.out.println(pq2);
		System.out.println(pq1.contains('A')); // searching the vlaue in the Priority Queue,
		System.out.println(pq1.contains('M'));// if contains then return true elde false

	}
}