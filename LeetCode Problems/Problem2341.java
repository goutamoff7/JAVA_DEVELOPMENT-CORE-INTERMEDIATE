public class Problem2341 {
	public int[] numberOfPairs(int[] nums) {
		int res[] = new int[2];
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j] && nums[i] != -1) {
					count++;
					nums[i] = -1;
					nums[j] = -1;
				}
			}
		}
		res[0] = count;
		int countNum = 0;
		for (int n : nums)
			if (n != -1)
				countNum++;
		res[1] = countNum;
		return res;

	}

	public static void main(String[] args) {
		// int ar[] = {1,3,2,1,3,2,2};
		int ar[] = { 0};
		int res[] = new Problem2341().numberOfPairs(ar);
		for (int n : res)
			System.out.print(n + ",");
	}
}
