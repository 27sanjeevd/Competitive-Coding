class Solution {
    public int uniquePaths(int m, int n) {
        
        int[][] a1 = new int[m][n];
        
        for(int x = 0; x < m; x++){
            for(int y = 0; y < n; y++){
                if (x == 0 && y == 0){
                    a1[x][y] = 1;
                }
                else if (x == 0){
                    a1[x][y] = a1[x][y-1];
                }
                else if (y == 0){
                    a1[x][y] = a1[x-1][y];
                }
                else{
                    a1[x][y] = a1[x-1][y] + a1[x][y-1];
                }
            }
        }
        
        return a1[m-1][n-1];
        
    }
}
