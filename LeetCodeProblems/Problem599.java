/* 599. Minimum Index Sum of Two Lists
 * Given two arrays of strings list1 and list2, 
 * find the common strings with the least index sum.
A common string is a string that appeared in both list1 and list2.
A common string with the least index sum is a common string such that 
if it appeared at list1[i] and list2[j] then i + j should be the minimum value 
among all the other common strings.
Return all the common strings with the least index sum. Return the answer in any order. 

Example 1:
Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], 
list2 = ["Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"]
Output: ["Shogun"]
Explanation: The only common string is "Shogun".

Example 2:
Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], 
list2 = ["KFC","Shogun","Burger King"]
Output: ["Shogun"]
Explanation: The common string with the least index sum is 
"Shogun" with index sum = (0 + 1) = 1.

Example 3:
Input: list1 = ["happy","sad","good"], list2 = ["sad","happy","good"]
Output: ["sad","happy"]
Explanation: There are three common strings:
"happy" with index sum = (0 + 1) = 1.
"sad" with index sum = (1 + 0) = 1.
"good" with index sum = (2 + 2) = 4.
The strings with the least index sum are "sad" and "happy".
*/

import java.util.ArrayList;
import java.util.List;

class Problem599 {
	public String[] findRestaurant(String[] list1, String[] list2) {
		String ar[] = new String[list1.length + list2.length];
		int indexSum = Integer.MAX_VALUE, pos = 0;
		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list2.length; j++) {
				if (list1[i].equals(list2[j])) {
					if ((i + j) < indexSum) {
						indexSum = i + j;
						ar[pos] = list1[i];
					} else if ((i + j) == indexSum)
						ar[++pos] = list1[i];
				}
			}
		}
		List<String> list = new ArrayList<String>();
		for (String s : ar) {
			if (s != null)
				list.add(s);
		}
		String res[] = new String[list.size()];
		for (int i = 0; i < list.size(); i++)
			res[i] = list.get(i);
		return res;
	}

	public static void main(String[] args) {
		// String list1[] = { "Shogun", "Tapioca Express", "Burger King", "KFC" };
		// String list2[] = { "Piatti", "The Grill at Torrey Pines", "Hungry Hunter
		// Steakhouse", "Shogun" };
		String list1[] = { "Shogun", "Piatti", "Tapioca Express", "Burger King", "KFC" };
		String list2[] = { "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun" };
		String res[] = new Problem599().findRestaurant(list1, list2);
		for (String s : res)
			System.out.println(s + ",");
	}
}