/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
*/

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>();
        
        for(int x = 0; x < nums.length; x++){
            if (temp.containsKey(nums[x])){
                temp.put(nums[x], temp.get(nums[x]) + 1);
            }
            else{
                temp.put(nums[x], 1);
            }
        }
        
        int output = 0;
        for(Map.Entry<Integer, Integer> temp1 : temp.entrySet()){
            if (temp1.getValue() > nums.length/2){
                output = temp1.getKey();
            }
        }
        
        return output;
    }
}
