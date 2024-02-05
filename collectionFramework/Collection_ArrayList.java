import java.util.*;

class Collection_ArrayList {
	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add(null);// null value allowed
		al1.add(100); // adding integer in al1
		al1.add(20); // adding integer in al1
		al1.add(13.5f); // adding float in al1
		al1.add(25.6); // adding double in al1
		al1.add('G'); // adding character in al1
		al1.add("Goutam dam"); // adding String in al1
		System.out.println(al1);
		ArrayList al2 = new ArrayList();
		al2.addAll(al1); // add all the elements of al1 in al2
		al2.add(2, 20); // add 20 in 2th position of al2, duplicate value allowed
		al2.add(0, 8); // add 8 in 0th position of al2
		System.out.println(al2);

		System.out.println("indexOf 20 : " + al2.indexOf(20));
		System.out.println("lastIndexOf 20 : " + al2.lastIndexOf(20));

		System.out.println("isEmpty : " + al2.isEmpty());

		System.out.println("toArray : " + al2.toArray());
		System.out.println("toString : " + al2.toString());

		al1.set(3, 200); // at index 3 current vlaue will be replaced with 200

		System.out.println(al1.get(5)); // getting vlaue of 5th index of al1
		System.out.println(al2.get(8)); // getting vlaue of 7th index of al2

		System.out.println(al2.contains(100)); // searching the vlaue in the ArrayList,
		System.out.println(al2.contains(200));// if contains then return true else false

		System.out.println("Size of the ArrayList 2 : " + al2.size());
		al2.remove(2); // remove 2nd index only
		// al2.remove(); //this method not exit in ArrayList
		System.out.println(al1);
		System.out.println(al2);
		System.out.println("After retainAll : " + al2.retainAll(al1)); // keep those elements of al2 which matches al1
																		// otherwise removes from al2
		System.out.println(al1);
		System.out.println(al2);
		al2.removeAll(al1); // remove all the al1 elements from al2.
		System.out.println(al2);
		al2.clear(); // delete all element of al2
		System.out.println(al1);
		System.out.println(al2);
	}
}