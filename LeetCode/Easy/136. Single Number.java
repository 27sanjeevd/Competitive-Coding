/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
*/

class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
        
        for(int x = 0; x < nums.length; x++){
            if (temp.containsKey(nums[x])){
                temp.put(nums[x], 2);
            }
            else{
                temp.put(nums[x], 1);
            }
        }
        
        for(Map.Entry<Integer, Integer> a1 : temp.entrySet()){
            if (a1.getValue() == 1){
                return a1.getKey();
            }
        }
        
        return 1;
    }
}
