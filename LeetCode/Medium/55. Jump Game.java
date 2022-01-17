class Solution {
    public boolean canJump(int[] nums) {
        
        int max = 0;
        for(int x = 0; x < nums.length; x++){
            if (x > max){
                return false;
            }
            if (max < x + nums[x]){
                max = x + nums[x];
            }
        }
        
        return true;
    }
}
