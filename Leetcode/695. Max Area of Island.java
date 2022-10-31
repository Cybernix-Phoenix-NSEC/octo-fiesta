Question

You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

The area of an island is the number of cells with a value 1 in the island.

Return the maximum area of an island in grid. If there is no island, return 0.

Link - https://leetcode.com/problems/max-area-of-island/

'SOLUTION :'
  
  class Solution {
    
    public int dfs(int[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0) return 0;
        grid[i][j]=0;
        return 1+ dfs(grid, i-1, j)+ dfs(grid, i+1, j)+ dfs(grid, i, j-1)+ dfs(grid, i, j+1);
    }
    
    public int maxAreaOfIsland(int[][] grid) {
        int area=0;
        for(int i=0;i< grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    area= Math.max(area, dfs(grid, i, j));
                }
            }
        }
        return area;
    }
}
