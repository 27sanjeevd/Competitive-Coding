class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] a1 = new int[points.length];
        
        for(int x = 0; x < a1.length; x++){
            a1[x] = points[x][0];
        }
        
        Arrays.sort(a1);
        int max = 0;
        for(int x = 0; x < a1.length - 1; x++){
            if (a1[x + 1] - a1[x] > max){
                max = a1[x+1] - a1[x];
            }
        }
        
        return max;
    }
}
