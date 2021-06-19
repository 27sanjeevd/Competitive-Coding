class Solution {
    public boolean canJump(int[] nums) {
        
        int[] a1 = new int[nums.length];
        
        a1[0] = 1;
        
        for(int x = 0; x < nums.length - 1; x++){
            if (a1[x] != 0){
                for(int y = 1; y <= nums[x]; y++){
                    if (x + y < a1.length){
                        a1[x + y]++;
                    }
                }
            }
        }
        
        return a1[a1.length - 1] > 0;
        
    }
}
