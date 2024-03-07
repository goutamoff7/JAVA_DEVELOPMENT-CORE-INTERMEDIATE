/* 2815. Max Pair Sum in an Array
You are given a 0-indexed integer array nums. 
You have to find the maximum sum of a pair of numbers from nums such that 
the maximum digit in both numbers are equal.
Return the maximum sum or -1 if no such pair exists.

Example 1:
Input: nums = [51,71,17,24,42]
Output: 88
Explanation: 
For i = 1 and j = 2, nums[i] and nums[j] have equal maximum digits 
with a pair sum of 71 + 17 = 88. 
For i = 3 and j = 4, nums[i] and nums[j] have equal maximum digits 
with a pair sum of 24 + 42 = 66.
It can be shown that there are no other pairs with equal maximum digits, 
so the answer is 88.

Example 2:
Input: nums = [1,2,3,4]
Output: -1
Explanation: No pair exists in nums with equal maximum digits.*/

public class Problem2815 {
	public int maxSum(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			int tempi = nums[i], largei = 0;
			while (tempi != 0) {
				int d = tempi % 10;
				largei = (d > largei) ? d : largei;
				tempi/=10;
			}
			for (int j = i + 1; j < nums.length; j++) {
				int tempj = nums[j], largej = 0,sum=0;
				while (tempj != 0) {
					int d = tempj % 10;
					largej = (d > largej) ? d : largej;
					tempj/=10;
				}
				if(largei==largej)
					{sum = nums[i] + nums[j];}
				if (max < sum)
					max = sum;	
			}
		}
		if (max == 0)
			return -1;
		else
			return max;
	}

	public static void main(String[] args) {
		System.out.println(new Problem2815().maxSum(new int[] {51,71,17,24,42}));
		System.out.println(new Problem2815().maxSum(new int[] {84,91,18,59,27,9,81,33,17,58}));
	}
}
