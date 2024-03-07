package leetCodeProblems;
/* 268. Missing Number
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, 
so all numbers are in the range [0,3]. 2 is the missing number in the range 
since it does not appear in nums*/

class Problem268 {
	public int missingNumber(int[] nums) {
		int n = nums.length, miss = 0;
		int res[] = new int[n + 1];
		for (int i = 0; i < n; i++) {
			if (nums[i] != 0)
				res[nums[i]] = nums[i];
			else
				res[0] = -1;
		}
		for (int j = 0; j <= n; j++) {
			if (res[j] == 0) {
				miss = j;
				break;
			}
		}
		return miss;
	}

	public static void main(String[] args) {
		System.out.println(new Problem268().missingNumber(new int[] { 3, 0, 1 }));
	}
}