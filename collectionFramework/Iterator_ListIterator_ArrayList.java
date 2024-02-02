import java.util.*;

class Iterator_ListIterator_ArrayList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(20);
		al.add(13.5f);
		al.add(25.6);
		al.add('G');
		al.add("Goutam dam");
		System.out.println(al); // Printing Data normally

		for (int i = 0; i < al.size(); i++)
			// index Based accessing is allowed for those collection
			// which accepts index based accesing
			System.out.println(al.get(i));
		System.out.println("---------------------------------------");

		for (Object o : al)
			System.out.println(o);
		System.out.println("---------------------------------------");

		Iterator itr = al.iterator();
		// iterator() method acts as a cursor starts before the first position
		// of any collection
		while (itr.hasNext()) { // hasNext() methods returns true if the next
			// element of cursor exits.
			Object o = itr.next(); // next() method iterate the next element
			// of cursor and return that object
			System.out.println(o);
		}
		System.out.println("---------------------------------------");
		ListIterator litr = al.listIterator(al.size());
		// ListIterator(extends Iterator inteface) is applicable for only
		// ArrayList and LinkedList
		// listIterator() method acts as a cursor starts after the last position
		// of any collection
		while (litr.hasPrevious()) { // hasPrevious() methods returns true if the
			// previous element exists.
			Object o = litr.previous(); // Previous() method iterate the Previous
			// element of cursor and return that object
			System.out.println(o);
		}

	}
}