package DP;
//.Minimum Path Sum - LeetCode Time: O(mn) space:O(1)
public class minPathSum {
	public static int minPathSum(int[][] grid) {
	    final int m = grid.length;
	    final int n = grid[0].length;

	    for (int i = 0; i < m; ++i)
	      for (int j = 0; j < n; ++j)
	        if (i > 0 && j > 0)
	          grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
	        else if (i > 0)
	          grid[i][0] += grid[i - 1][0];
	        else if (j > 0)
	          grid[0][j] += grid[0][j - 1];

	    return grid[m - 1][n - 1];
	  }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] dungeon= {{2,3,3},{5,10,1},{10,30,5}};
		System.out.println(minPathSum(dungeon));

	}

}
