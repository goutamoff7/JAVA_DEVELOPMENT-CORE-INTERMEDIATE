package leetCodeProblems;
/* 4. Median of Two Sorted Arrays
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, 
 * return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)). 

Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5. 
*/

import java.util.Arrays;

public class Problem4 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double median = 0.0;
		int m = nums1.length;
		int n = nums2.length;
		int merged[] = new int[m + n], j = 0;
		for (int val : nums1)
			merged[j++] = val;
		for (int val : nums2)
			merged[j++] = val;
		Arrays.sort(merged);
		if ((n + m) % 2 == 0)
			median = (double) ((merged[(n + m) / 2] + merged[((n + m) / 2) - 1])) / 2;
		else
			median = (merged[(n + m) / 2]);
		return median;
	}

	public static void main(String[] args) {
		int num1[] = { 1, 3 };
		int nums2[] = { 2 };
		System.out.println(new Problem4().findMedianSortedArrays(num1, nums2));
	}
}
