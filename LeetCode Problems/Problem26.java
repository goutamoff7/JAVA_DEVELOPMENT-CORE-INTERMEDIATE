/*26. Remove Duplicates from Sorted Array
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).*/

class Problem26 {
    public int removeDuplicates(int[] nums) {
        int i = 0, insert = 0;
        while (i < nums.length) {
            if (nums[insert] != nums[i])
                nums[++insert] = nums[i];
            i++;
        }
        for (int n = 0; n <= insert; n++)
            System.out.print(nums[n] + ",");
        System.out.println();
        return insert + 1;
    }

    public static void main(String[] args) {
        System.out.println(new Problem26().removeDuplicates(new int[] { 1, 1, 2, 2, 2, 3 }));
    }
}