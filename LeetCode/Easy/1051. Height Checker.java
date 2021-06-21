class Solution {
    public int heightChecker(int[] heights) {
        int[] a1 = new int[heights.length];
        for(int x = 0; x < heights.length; x++){
            a1[x] = heights[x];
        }
        Arrays.sort(a1);
        
        int counter1 = 0;
        for(int x = 0; x < a1.length; x++){
            if (a1[x] != heights[x]){
                counter1++;
            }
        }
        
        return counter1;
    }
}
