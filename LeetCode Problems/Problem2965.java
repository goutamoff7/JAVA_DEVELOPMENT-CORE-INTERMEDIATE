/* 2965. Find Missing and Repeated Values
You are given a 0-indexed 2D integer matrix grid of size n * n 
with values in the range [1, n2]. 
Each integer appears exactly once except a which appears twice and b which is missing. 
The task is to find the repeating and missing numbers a and b.
Return a 0-indexed integer array ans of size 2 where ans[0] equals to a 
and ans[1] equals to b. 

Example 1:
Input: grid = [[1,3],[2,2]]
Output: [2,4]
Explanation: Number 2 is repeated and number 4 is missing so the answer is [2,4].

Example 2:
Input: grid = [[9,1,7],[8,9,2],[3,4,6]]
Output: [9,5]
Explanation: Number 9 is repeated and number 5 is missing so the answer is [9,5].*/
	
class Problem2965 {
	public int[] findMissingAndRepeatedValues(int[][] grid) {
		int res[] = new int[2];
		int n = grid.length;
		int rep[] = new int[n * n + 1];
		for (int ar[] : grid) {
			for (int num : ar) {
				rep[num] = rep[num] + 1;
			}
		}
		for (int i = 1; i < rep.length; i++) {
			if (rep[i] == 0)
				res[1] = i;
			if (rep[i] > 1)
				res[0] = i;
		}
		return res;
	}

	public static void main(String[] args) {
		// int grid[][] = { { 1, 3 }, { 2, 2 } };
		int grid[][] = { { 9, 1, 7 }, { 8, 9, 2 }, { 3, 4, 6 } };
		int res[] = new Problem2965().findMissingAndRepeatedValues(grid);
		for (int n : res)
			System.out.print(n + ",");
	}
}