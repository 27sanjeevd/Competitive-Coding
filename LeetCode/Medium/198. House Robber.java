/*
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
*/

class Solution {
    public int rob(int[] nums) {
        int[] a1 = new int[nums.length];
        
        if (nums.length < 3){
            if (nums.length == 1){
                return nums[0];
            }
            else if (nums.length == 2){
                return Math.max(nums[0], nums[1]);
            }
        }
        
        a1[0] = nums[0];
        a1[1] = nums[1];
        a1[2] = nums[2] + a1[0];
        
        int max = Math.max(a1[1], a1[2]);
        
        for(int x = 3; x < nums.length; x++){
            a1[x] = nums[x] + Math.max(a1[x-2], a1[x-3]);
            
            if (max < a1[x]){
                max = a1[x];
            }
        }
        
        return max;
    }
}
