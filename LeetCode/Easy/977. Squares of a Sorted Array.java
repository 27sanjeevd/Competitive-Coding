class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] a1 = new int[nums.length];
        
        for(int x = 0; x < nums.length; x++){
            a1[x] = nums[x] * nums[x];
        }
        
        Arrays.sort(a1);
        return a1;
    }
}
