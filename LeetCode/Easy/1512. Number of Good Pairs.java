/*
Given an array of integers nums.

A pair (i,j) is called good if nums[i] == nums[j] and i < j.

Return the number of good pairs.
*/
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int x = 0; x < nums.length - 1; x++){
            for(int y = x + 1; y < nums.length; y++){
                
                if (x != y){
                    if (nums[x] == nums[y]){
                        count++;
                    }
                }
                
            }
        }
        
        return count;
    }
}
