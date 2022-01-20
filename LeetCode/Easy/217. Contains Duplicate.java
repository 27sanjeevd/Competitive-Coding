/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        
        for(int x = 0; x < nums.length; x++){
            if (map1.get(nums[x]) != null){
                return true;
            }
            else{
                map1.put(nums[x], 1);
            }
            
        }
        
        return false;
    }
}
