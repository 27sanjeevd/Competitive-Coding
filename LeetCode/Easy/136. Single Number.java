class Solution {
    public int singleNumber(int[] nums) {
        
        Arrays.sort(nums);
        if (nums.length > 2){
            for(int x = 1; x < nums.length - 1; x++){

                if (!(nums[x] == nums[x-1] || nums[x] == nums[x+1])){
                    return nums[x];
                }
            }
        
            if (nums[0] != nums[1]){
                return nums[0];
            }
        
        
            return nums[nums.length - 1];
            }
        else{
            return nums[0];
        }
    }
}
