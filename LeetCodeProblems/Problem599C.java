package leetCodeProblems;
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

public class Problem599C {

	public String[] findRestaurant(String[] list1, String[] list2) {
		List<String> res = new ArrayList<>();
		for (int sum = 0; sum < list1.length + list2.length - 1; sum++) {
			for (int i = 0; i <= sum; i++) {
				if (i < list1.length && sum - i < list2.length && list1[i].equals(list2[sum - i]))
					res.add(list1[i]);
			}
			if (res.size() > 0)
				break;
		}
		return res.toArray(new String[res.size()]);
	}

	public static void main(String[] args) {
		// String list1[] = { "Shogun", "Tapioca Express", "Burger King", "KFC" };
		// String list2[] = { "Piatti", "The Grill at Torrey Pines", "Hungry Hunter
		// Steakhouse", "Shogun" };
		// String list1[] = { "Shogun", "Piatti", "Tapioca Express", "Burger King",
		// "KFC" };
		// String list2[] = { "Piatti", "The Grill at Torrey Pines", "Hungry Hunter
		// Steakhouse", "Shogun" };
		String list1[] = { "happy", "sad", "good" };
		String list2[] = { "sad", "happy", "good" };
		String res[] = new Problem599C().findRestaurant(list1, list2);
		for (String s : res)
			System.out.println(s + ",");
	}
}
