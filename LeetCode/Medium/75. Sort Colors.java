/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.
*/

class Solution {
    public void sortColors(int[] nums) {
        
        int beginning = 0, end = nums.length - 1, index = 0;
        
        while (index <= end){
            
            if (nums[index] == 0){
                int temp = nums[index];
                nums[index] = nums[beginning];
                nums[beginning] = temp;
                beginning++;
            }
            if (nums[index] == 2){
                int temp = nums[index];
                nums[index] = nums[end];
                nums[end] = temp;
                end--;
                index--;
            }
            index++;
            
        }
    }
}
