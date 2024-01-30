import java.util.*;

class Collection_ArrayDeque {
	public static void main(String[] args) {
		ArrayDeque ad1 = new ArrayDeque();
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
		System.out.println(ad1.contains(100)); // searching the vlaue in the Deque,
		System.out.println(ad1.contains(200));// if contains then return true elde false

	}
}