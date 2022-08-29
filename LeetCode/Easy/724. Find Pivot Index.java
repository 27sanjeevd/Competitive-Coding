/*
Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.
*/

class Solution {
    public int pivotIndex(int[] nums) {
        int[] sumLeft = new int[nums.length];
        for(int x = 0; x < nums.length; x++){
            if (x == 0){
                sumLeft[0] = nums[0];
            }
            else{
                sumLeft[x] = sumLeft[x-1] + nums[x];
            }
        }
        if (sumLeft[sumLeft.length - 1] - sumLeft[0] == 0){
            return 0;
        }
        for(int x = 1; x < nums.length - 1; x++){
            if (sumLeft[x-1] == sumLeft[sumLeft.length - 1] - sumLeft[x]){
                return x;
            }
        }
        if (sumLeft[sumLeft.length - 2] == 0){
            return sumLeft.length - 1;
        }
        return -1;
    }
}
