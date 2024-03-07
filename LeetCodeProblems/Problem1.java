package leetCodeProblems;
/* 1.Two Sum
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/

class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((nums[i] + nums[j]) == target) {
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String args[]) {
        int res[] = new Problem1().twoSum(new int[] { 2, 7, 11, 15 }, 9);
        for (int n : res)
            System.out.print(n + ",");
    }
}