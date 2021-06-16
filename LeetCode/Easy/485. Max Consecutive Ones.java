class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int counter1 = 0;
        int max1 = 0;
        
        for(int x = 0; x < nums.length; x++){
            if (nums[x] == 1){
                counter1++;
            }
            else {
                if (counter1 > max1){
                    max1 = counter1;
                }
                counter1 = 0;
            }
        }
        
        if (counter1 > max1){
            max1 = counter1;
        }
        
        return max1;
    }
}
