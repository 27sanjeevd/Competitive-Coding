class Solution {
    public int searchInsert(int[] nums, int target) {
        
        boolean temp1 = true;
        int output = -1;
        for(int x = 0; x < nums.length; x++){
            
            if (target < nums[x] && temp1){
                
                temp1 = false;
                output = x;
            }
            if (nums[x] == target){
                
                output = x;
                break;
            }
            
        }
        
        if (nums[nums.length - 1] < target){
            output = nums.length;
        }
        
        return output;
    }
}
