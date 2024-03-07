package leetCodeProblems;
/* 1380. Lucky Numbers in a Matrix
Given an m x n matrix of distinct numbers, 
return all lucky numbers in the matrix in any order.
A lucky number is an element of the matrix 
such that it is the minimum element in its row and maximum in its column.

Example 1:
Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number 
since it is the minimum in its row and the maximum in its column.

Example 2:
Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
Output: [12]
Explanation: 12 is the only lucky number 
since it is the minimum in its row and the maximum in its column.*/

import java.util.ArrayList;
import java.util.List;

public class Problem1380 {
	public List<Integer> luckyNumbers(int[][] matrix) {
		List<Integer> res = new ArrayList<Integer>();
		int n = matrix.length;
		for (int i = 0; i < n; i++) {
			int min = matrix[i][0],pos=0,max=0;;
			for (int j = 0; j < matrix[i].length; j++) {
				if(min>matrix[i][j])
				{
					min=matrix[i][j];
					pos=j;
				}
			}
			for(int k=0;k<n;k++)
			{	
				if(max<matrix[k][pos])
					max=matrix[k][pos];
			}
			if(min==max)
			{
				res.add(max);
				break;					
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int ar[][]={{1,10,4,2},{9,3,8,7},{15,16,17,12}};
		System.out.println(new Problem1380().luckyNumbers(ar));
	}
}
