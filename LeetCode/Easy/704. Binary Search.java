class Solution {
    public int search(int[] nums, int target) {
        
        int min = 0;
        int max = nums.length - 1;
        
        while (min <= max){
            
            int position = (max + min) / 2;
            
            if (nums[position] == target){
                return position;
            }
            if (nums[position] > target){
                max = position - 1;
            }
            if (nums[position] < target){
                min = position + 1;
            }
            
            
        }
        
        return -1;
        
    }
}
