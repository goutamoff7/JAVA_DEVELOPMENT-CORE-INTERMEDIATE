import java.util.*;

class Collection_ArrayDeque {
	public static void main(String[] args) {
		ArrayDeque ad1 = new ArrayDeque();
		// ad1.add(null); // null value cause NullPointerException
		ad1.add(100); // adding integer in ad1
		ad1.add(100); // adding integer in ad1
		ad1.add(13.5f); // adding float in ad1
		ad1.add(25.6); // adding double in ad1
		ad1.add('G'); // adding character in ad1
		ad1.add("Goutam dam"); // adding String in ad1
		System.out.println(ad1);
		ArrayDeque ad2 = new ArrayDeque();
		ad2.addAll(ad1); // add all the elements of ad1 in ad2
		// ad2.add(2, 20); // index based addition not allowed
		ad2.addFirst(500); // adding value in the First position
		ad2.addLast(25); // adding value in the Last position

		ad2.offer(5); // offering value, it may be added or can't be added.
		ad2.offerFirst(125); // offering value at first position, it may be added or can't be added.
		ad2.offerLast(634); // offering value at last position, it may be added or can't be added.
		System.out.println(ad2);

		// ad2.get(3);// get(index) method not exist,getting value via index not allowed
		System.out.println("getFirst of ad2 : " + ad2.getFirst()); // Returns the first element of deque.
		System.out.println("getLast of ad2 : " + ad2.getLast()); // Returns the last element of deque.

		System.out.println("Head Element of ad2 element() method : " + ad2.element());
		// Retrieves, but does not remove, the head of the queue represented by this
		// deque.

		System.out.println("Head Element of ad2 peek() method : " + ad2.peek());
		// peak() : Retrieves, but does not remove, the head of the queue represented by
		// this deque, or returns null if this deque is empty.
		System.out.println("Head Element of ad2 peekFirst() method : " + ad2.peekFirst());
		// Retrieves, but does not remove, the first element of this deque, or returns
		// null if this deque is empty.
		System.out.println("Last Element of ad2 peekLast() method : " + ad2.peekLast());
		// Retrieves, but does not remove, the last element of this deque, or returns
		// null if this deque is empty.
		System.out.println(ad2);
		System.out.println(ad2.poll()); // Retrieves and removes the head of the queue represented by this deque (in
		// other words, the first element of this deque), or returns null if this deque
		// is empty.
		System.out.println("After poll() method called : " + ad2);

		System.out.println("Head Element of ad2 pollFirst() method : " + ad2.pollFirst());
		// Retrieves and removes the first element of this deque, or returns null if
		// this deque is empty.
		System.out.println("Last Element of ad2 pollLast() method : " + ad2.pollLast());
		// Retrieves and removes the last element of this deque, or returns null if this
		// deque is empty.
		System.out.println(ad2);
		ad2.pop(); // removes the first element from the stack represented by this deque.
		System.out.println("After pop() method called : " + ad2);
		ad2.push(58); // Pushes 58 at first position of the stack represented by thisdeque.
		System.out.println("After 58 is pushed :" + ad2);
		System.out.println(ad2);
		System.out.println(ad1.contains(100)); // searching the vlaue in the Deque,
		System.out.println(ad1.contains(200));// if contains then return true else false

		System.out.println("isEmpty : " + ad2.isEmpty());
		System.out.println("toArray : " + ad2.toArray()); // return Object[]
		System.out.println("toString : " + ad2.toString());

		System.out.println("Size of the ArrayDeque : " + ad2.size());

		System.out.println(ad2.remove()); // remove and return first element only
		System.out.println(ad2.remove(100)); // Removes a single instance of the specified element from this deque.
		System.out.println("removeFirst() method called : " + ad2.removeFirst());
		// Removes and returns the first element from this deque.
		System.out.println("removeLast() method called : " + ad2.removeLast());
		// Retrieves and removes the last element of this deque.
		System.out.println("removeFirstOccurrence(100) method called of ad1 : " + ad1.removeFirstOccurrence(100));
		// Removes the first occurrence of the specified element in this deque (when
		// traversing the deque from head to tail).
		System.out.println("removeLastOccurrence(1000) method called of ad1 : " + ad1.removeLastOccurrence(100));
		// Removes the last occurrence of the specified element in this deque (when
		// traversing the deque from head to tail).

		System.out.println(ad1);
		System.out.println(ad2);
		System.out.println("After retainAll : " + ad2.retainAll(ad1));
		// keep those elements of ad2 which matches ad1 otherwise removes from ad2
		System.out.println(ad1);
		System.out.println(ad2);
		ad2.removeAll(ad1); // remove adl the ad1 elements from ad2.
		System.out.println(ad1);
		System.out.println(ad2);
		ad2.clear(); // delete all element of ad2
		System.out.println(ad2);
	}
}