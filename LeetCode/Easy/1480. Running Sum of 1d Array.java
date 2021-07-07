/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.
*/
class Solution {
    public int[] runningSum(int[] nums) {
        
        for(int x = 1; x < nums.length; x++){
            nums[x] += nums[x-1];
        }
        
        return nums;
    }
}
