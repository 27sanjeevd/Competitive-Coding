class Solution {
    public int removeDuplicates(int[] nums) {
        int temp = 0;
        int pos = 0;
        
        for(int x = 0; x < nums.length; x++){
            if (x == 0){
                temp = nums[x];
                pos++;
            }
            else if (nums[x] != temp){
                nums[pos] = nums[x];
                temp = nums[pos];
                pos++;
            }
        }
        
        return pos;
    }
}
