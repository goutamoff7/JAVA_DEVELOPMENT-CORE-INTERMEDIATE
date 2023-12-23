/* 2956. Find Common Elements Between Two Arrays
 * Input: nums1 = [4,3,2,3,1], nums2 = [2,2,5,2,3,6]
Output: [3,4]
Explanation: We calculate the values as follows:
-The elements at indices 1, 2, and 3 in nums1 occur at least once in nums2. 
So the first value is 3.
-The elements at indices 0, 1, 3, and 4 in nums2 occur at least once in nums1. 
So the second value is 4.
 */

import java.util.List;
import java.util.ArrayList;

class Problem2956 {
	public int[] findIntersectionValues(int[] nums1, int[] nums2) {
		int count1 = 0, count2 = 0;
		for (int n1 : nums1) {
			for (int n2 : nums2) {
				if (n1 == n2) {
					count1++;
					break;
				}
			}
		}
		for (int n2 : nums2) {
			for (int n1 : nums1) {
				if (n2 == n1) {
					count2++;
					break;
				}
			}
		}
		int res[] = { count1, count2 };
		return res;
	}

	public static void main(String[] args) {
		int nums1[] = { 4, 3, 2, 3, 1 };
		int nums2[] = { 2, 2, 5, 2, 3, 6 };
		int res[] = new Problem2956().findIntersectionValues(nums1, nums2);
		for (int n : res)
			System.out.print(n + ",");

	}
}