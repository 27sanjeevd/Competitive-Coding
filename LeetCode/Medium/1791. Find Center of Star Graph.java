class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length;
        int[] a1 = new int[n + 1];
        
        for(int x = 0; x < n; x++){
            a1[edges[x][0] - 1]++;
            a1[edges[x][1] - 1]++;
        }
        
        int max1 = 0;
        int position = -1;
        for(int x = 0; x < a1.length; x++){
            if (a1[x] > max1){
                max1 = a1[x];
                position = x + 1;
            }
        }
        
        return position;
    }
}
