import java.util.*;

class Collection_Generics1 {
	public static void main(String[] args) {
		//No type Safety
		ArrayList al1 = new ArrayList();
		al1.add("Goutam Dam");
		al1.add("Arpan Kundu");
		al1.add(20); // no compilation error shown

		// Assuming that the above colection contains only names (String type)
		String name[] = new String[al1.size()];
		name[0] = (String) al1.get(0); // Object type is downcasted to String type
		name[1] = (String) al1.get(1);
		name[2] = (String) al1.get(2);
		// Runtime Exception arise, as index 2 data of collection is of int type
		// java.lang.ClassCastException: class java.lang.Integer cannot be cast to class
		// java.lang.String

		for (String s : name)
			System.out.println(s);

		//type Safety achieved
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Goutam Dam");		
		al2.add("Arpan Kundu");
		al2.add(20); // CompileTime Error arise when any other type of data is trying to insert
		// in this collection except String.
		// Assuming that the above colection contains only names (String type)
		String name2[] = new String[al2.size()];
		name2[0] = al2.get(0); // Object type is downcasted to String type
		name2[1] = al2.get(1);
		name2[2] = al2.get(2); // Exception arise as at index 2 data is of i
		// java.lang.ClassCastException: class java.lang.Integer cannot be cast to class
		// java.lang.String
		for (int i = 0; i < name2.length; i++)
			System.out.println("Name " + i + " : " + name2[i]);
	}
}