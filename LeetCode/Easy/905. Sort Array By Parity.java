class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int even = 0;
        int odd = nums.length - 1;
        
        while (even < odd){
            if (nums[odd] % 2 != 0){
                odd--;
            }
            if (nums[even] % 2 == 0){
                even++;
            }
            if (nums[even] % 2 != 0 && nums[odd] % 2 == 0 && even < odd){
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
                    
            }
        }
        
        return nums;
    }
}
