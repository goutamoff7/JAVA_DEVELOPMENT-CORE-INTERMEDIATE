import java.util.*;

class Collection_LinkedList {
	public static void main(String[] args) {
		LinkedList ll1 = new LinkedList();
		ll1.add(null);// null value allowed
		ll1.add(100); // adding integer in ll1
		ll1.add(20); // adding integer in ll1
		ll1.add(13.5f); // adding float in ll1
		ll1.add(25.6); // adding double in ll1
		ll1.add('G'); // adding character in ll1
		ll1.add("Goutam dam"); // adding String in ll1
		System.out.println(ll1);
		LinkedList ll2 = new LinkedList();
		ll2.addAll(ll1); // add all the elements of ll1 in ll2
		ll2.add(2, 20); // add 20 in 2th index of ll2, duplicate value allowed
		ll2.add(0, 8); // add 8 in 0th index of ll2
		System.out.println(ll2);

		ll2.addFirst(500); // adding value in the First position
		ll2.addLast(25); // adding value in the Last position
		ll2.offer(5); // Adds the specified element as the tail (last element) of this list.
		ll2.offerFirst(125); // Inserts the specified element at the front of this list.
		ll2.offerLast(634); // Inserts the specified element at the end of this list.
		System.out.println(ll2);

		System.out.println("indexOf 20 : " + ll2.indexOf(20));
		// Returns the index of the first occurrence of the specified element in this
		// list, or -1 if this list does not contain the element.
		System.out.println("lastIndexOf 20 : " + ll2.lastIndexOf(20));
		// Returns the index of the last occurrence of the specified element in this
		// list, or -1 if this list does not contain the element.

		System.out.println("isEmpty : " + ll2.isEmpty());

		System.out.println("toArray : " + ll2.toArray()); // return Object[]
		System.out.println("toString : " + ll2.toString());

		ll1.set(3, 200); // at index 3 current vlaue will be replaced with 200

		System.out.println(ll1.get(5)); // getting value of 5th index of ll1
		System.out.println(ll2.get(8)); // getting value of 8th index of ll2

		System.out.println("getFirst of ll2 : " + ll2.getFirst()); // Returns the first element in this list.
		System.out.println("getLast of ll2 : " + ll2.getLast()); // Returns the last element in this list.

		System.out.println(ll2.contains(100)); // searching the value in the LinkedList,
		System.out.println(ll2.contains(200));// if contains then return true else false

		System.out.println("Head Element of ll2 element() method : " + ll2.element());
		// Retrieves,the head (first element) of this list but does not remove.
		System.out.println("Head Element of ll2 peek() method : " + ll2.peek());
		// peak() : Retrieves, but does not remove, the head (first element) of this
		// list.

		// Retrieves, but does not remove the head (first element) of this list or
		// returns null if this list
		// is empty
		System.out.println("Head Element of ll2 peekFirst() method : " + ll2.peekFirst());

		// Retrieves, but does not remove, the last element of this list, or returns
		// null if this list is empty.
		System.out.println("Last Element of ll2 peekLast() method : " + ll2.peekLast());

		System.out.println(ll2.poll()); // Retrieves and removes the head (first element) of this list.
		System.out.println("After poll() method called : " + ll2);

		// Retrieves and removes the first element of this list, or returns null if this
		// list is empty.
		System.out.println("Head Element of ll2 pollFirst() method : " + ll2.pollFirst());

		// Retrieves and removes the last element of this list, or returns null if this
		// list is empty.
		System.out.println("Last Element of ll2 pollLast() method : " + ll2.pollLast());

		System.out.println(ll2);

		ll2.pop(); // removes the first element from the stack represented by this list.
		System.out.println("After pop() method called : " + ll2);
		ll2.push(58); // Pushes 58 at first position of the stack represented by this list.
		System.out.println("After 58 is pushed :" + ll2);

		System.out.println("Size of the LinkedList 2 : " + ll2.size());
		System.out.println(ll2.remove(2)); // remove and return 2nd index value only
		System.out.println("Remove : " + ll2.remove()); // Retrieves and removes the head (first element) of this list.
		System.out.println(ll2);
		System.out.println(ll2.remove((Object) 5)); // Removes the first occurrence of the specified element from this
													// list, if it is present.
		System.out.println(ll2.remove(5)); // Removes the element at the specified position in this list.

		System.out.println("removeFirst() method called : " + ll2.removeFirst());
		// Removes and returns the first element from this list.
		System.out.println("removeLast() method called : " + ll2.removeLast());
		// Removes and returns the last element from this list.
		System.out.println("removeFirstOccurrence(20) method called of ll2 : " + ll2.removeFirstOccurrence(20));
		// Removes the first occurrence of the specified element in this list (when
		// traversing the list from head to tail).
		System.out.println("removeLastOccurrence(20) method called : " + ll2.removeLastOccurrence(20));
		// Removes the last occurrence of the specified element in this list (when
		// traversing the list from head to tail).

		System.out.println(ll1);
		System.out.println(ll2);
		System.out.println("After retainAll : " + ll2.retainAll(ll1));
		// keep those elements of ll2 which matches ll1 otherwise removes from ll2
		System.out.println(ll1);
		System.out.println(ll2);

		ll2.removeAll(ll1); // remove all the ll1 elements from ll2.
		System.out.println(ll2);
		ll2.clear(); // delete all element of ll2
		System.out.println(ll1);
		System.out.println(ll2);
	}
}