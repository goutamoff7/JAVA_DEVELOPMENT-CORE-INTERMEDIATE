/*
 * 463. Island Perimeter
 * You are given row x col grid representing a map
 * where grid[i][j] = 1 represents land and grid[i][j] = 0 represents water.
 * Input: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
 * Output: 16
 * Explanation: The perimeter is the 16 yellow stripes in the image above.
 */

 class Problem463 {
    public int islandPerimeter(int[][] grid) {
        int peri = 0;
        int row = grid.length;
        for (int i = 0; i < row; i++) {
	        int col = grid[i].length;
	        for (int j = 0; j < col; j++) {
		        if (grid[i][j] != 0) {
			        int left = j - 1, right = j + 1;
			        int top = i - 1, down = i + 1;
			        if ((left == -1) || grid[i][left] == 0)
				        peri++;
			        if ((right == col) || grid[i][right] == 0)
				        peri++;
			        if ((top == -1) || grid[top][j] == 0)
				        peri++;
			        if ((down == row) || grid[down][j] == 0)
				        peri++;
		        }
	        }
        }
            return peri;
    }
	public static void main(String[] args) {
		int grid[][]={{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		System.out.println(new Problem463().islandPerimeter(grid));
	}
}