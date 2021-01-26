class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int previous = -1;
        boolean check1 = true;
        
        for(int x = 0; x < nums.length; x++){
            if (nums[x] == 1){
                if (previous == -1){
                    previous = x;
                }
                else{
                    if (x - previous - 1 < k){
                        check1 = false;
                    }
                    else{
                        previous = x;
                    }
                }
            }
        }
        
        return check1;
    }
}
