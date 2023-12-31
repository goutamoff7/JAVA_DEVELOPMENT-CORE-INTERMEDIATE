/* 2908. Minimum Sum of Mountain Triplets I*/

class Problem2908 {
	public int minimumSum(int[] nums) {
		int res = Integer.MAX_VALUE, n = nums.length, sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (nums[i] < nums[j] && nums[j] > nums[k]) {
						sum = nums[i] + nums[j] + nums[k];
						res = (sum > res) ? res : sum;
					}
				}
			}
		}
		return res = (res == Integer.MAX_VALUE) ? -1 : res;
	}

	public static void main(String[] args) {
		int nums1[] = { 8, 6, 1, 5, 3 };
		int nums2[] = { 5, 4, 8, 7, 10, 2 };
		int nums3[] = { 1, 2, 2, 1 };
		int nums4[] = { 50, 50, 50 };
		int nums5[] = { 6, 5, 4, 3, 4, 5 };
		int nums6[] = { 1, 2, 2 };
		System.out.println(new Problem2908().minimumSum(nums1));
		System.out.println(new Problem2908().minimumSum(nums2));
		System.out.println(new Problem2908().minimumSum(nums3));
		System.out.println(new Problem2908().minimumSum(nums4));
		System.out.println(new Problem2908().minimumSum(nums5));
		System.out.println(new Problem2908().minimumSum(nums6));
	}

}
