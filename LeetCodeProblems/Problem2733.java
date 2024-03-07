/* 2733. Neither Minimum nor Maximum 
Given an integer array nums containing distinct positive integers, 
find and return any number from the array that is neither the minimum nor 
the maximum value in the array, or -1 if there is no such number.
Return the selected integer.

Example 1:
Input: nums = [3,2,1,4]
Output: 2
Explanation: In this example, the minimum value is 1 and the maximum value is 4. 
Therefore, either 2 or 3 can be valid answers.

Example 2:
Input: nums = [1,2]
Output: -1
Explanation: Since there is no number in nums that is neither the maximum nor 
the minimum, we cannot select a number that satisfies the given condition. 
Therefore, there is no answer.

Example 3:
Input: nums = [2,1,3]
Output: 2
Explanation: Since 2 is neither the maximum nor the minimum value in nums, 
it is the only valid answer. */

class Problem2733 {
	public int findNonMinOrMax(int[] nums) {
		int max = 0, min = nums[0], res = 0;
		for (int n : nums) {
			max = (max < n) ? n : max;
			min = (min > n) ? n : min;
		}
		for (int n : nums) {
			res = (n != max && n != min) ? n : 0;
			if(res>0) 
				break;
		}
		return res = (res != 0) ? res : -1;
	}

	public static void main(String[] args) {
		//int nums[] = { 3, 2, 1, 4 };
		int nums[] = { 2,4,25};
		System.out.println(new Problem2733().findNonMinOrMax(nums));
	}
}