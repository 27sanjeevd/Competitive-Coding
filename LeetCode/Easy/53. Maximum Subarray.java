/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int current = 0;
        
        for(int x = 0; x < nums.length; x++){
            current += nums[x];
            if (max < current){
                max = current;
            }
            if (current < 0){
                current = 0;
            }
        }
        
        return max;
    }
}
