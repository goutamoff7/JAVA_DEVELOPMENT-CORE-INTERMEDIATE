
/* 2418. Sort the People
 * You are given an array of strings names, 
 * and an array heights that consists of distinct positive integers. 
 * Both arrays are of length n.
For each index i, names[i] and heights[i] denote the name and height 
of the ith person.
Return names sorted in descending order by the people's heights. 

Example 1:
Input: names = ["Mary","John","Emma"], heights = [180,165,170]
Output: ["Mary","Emma","John"]
Explanation: Mary is the tallest, followed by Emma and John.

Example 2:
Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
Output: ["Bob","Alice","Bob"]
Explanation: The first Bob is the tallest, 
followed by Alice and the second Bob.
*/

import java.util.*;

public class Problem2418 {
	public String[] sortPeople(String[] names, int[] heights) {
		int n = names.length;
		for (int i = 0; i < n - 1; i++) {
			int max = heights[i], pos = i;
			String name = names[i];
			for (int j = i + 1; j < n; j++) {
				if (heights[j] > max) {
					max = heights[j];
					name = names[j];
					pos = j;
				}
			}
			heights[pos] = heights[i];
			names[pos] = names[i];
			heights[i] = max;
			names[i] = name;
		}
		return names;
	}

	public static void main(String[] args) {
		// String names[] = { "Mary", "John", "Emma" };
		// int heights[] = { 180, 165, 170 };
		String names[] = { "Alice", "Bob", "Bob" };
		int heights[] = { 155, 185, 150 };
		String res[] = new Problem2418().sortPeople(names, heights);
		System.out.println(new ArrayList<>(Arrays.asList(res)));
	}
}
