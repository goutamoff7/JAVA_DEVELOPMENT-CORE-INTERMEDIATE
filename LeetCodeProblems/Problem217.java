package leetCodeProblems;
/* 217. Contains Duplicate 
 * Given an integer array nums, return true if any value appears at 
 * least twice in the array, and return false if every element is distinct.
 
 Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
*/

import java.util.*;

class Problem217 {
	public boolean containsDuplicate(int[] nums) {
		boolean res = false;
		Arrays.sort(nums);
		int n = nums.length;
		for (int i = 0; i < n - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				res = true;
				break;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		// int nums[] = { 1, 2, 3, 1 };
		int nums[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		// int nums[] = { 1, 2, 3, 4 };
		System.out.print(new Problem217().containsDuplicate(nums));
	}
}