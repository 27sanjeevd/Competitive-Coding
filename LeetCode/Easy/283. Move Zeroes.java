class Solution {
    public void moveZeroes(int[] nums) {
        
        for(int x = nums.length - 1; x >= 0; x--){
            
            if (nums[x] == 0){
                for(int y = x; y < nums.length - 1; y++){
                    int temp = nums[y];
                    nums[y] = nums[y + 1];
                    nums[y + 1] = temp;
                }
            }
        }
        
    }
}
