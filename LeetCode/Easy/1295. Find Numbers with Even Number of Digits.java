class Solution {
    public int findNumbers(int[] nums) {
        int counter1 = 0;
        
        for(int x = 0; x < nums.length; x++){
            String temp = Integer.toString(nums[x]);
            if (temp.length() % 2 == 0){
                counter1++;
            }
        }
        
        return counter1;
    }
}
