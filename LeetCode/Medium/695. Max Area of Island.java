class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        int max = 0;
        
        for(int x = 0; x < grid.length; x++){
            for(int y = 0; y < grid[x].length; y++){
                if (grid[x][y] != 0){
                    max = Math.max(max, travel1(x, y, grid));
                }
            }
        }
        
        return max;
    }
    
    public int travel1(int x, int y, int[][] grid){
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == 0){
            return 0;
        }
        
        grid[x][y] = 0;
        
        return 1 + travel1(x-1, y, grid) + travel1(x+1, y, grid) + travel1(x, y-1, grid) + travel1(x, y+1, grid);
    }
}
