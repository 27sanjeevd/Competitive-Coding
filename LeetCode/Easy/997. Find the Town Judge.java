class Solution {
    public int findJudge(int n, int[][] trust) {
        
        int[][] a1 = new int[2][n];
        
        for(int x = 0; x < trust.length; x++){
            a1[0][trust[x][0] - 1]++;
            a1[1][trust[x][1] - 1]++;
        }
        
        for(int x = 0; x < n; x++){
            if (a1[0][x] == 0 && a1[1][x] == n-1){
                return x + 1;
            }
        }
        
        return -1;
        
    }
}
