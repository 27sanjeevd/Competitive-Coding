/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].
*/
class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] a1 = new int[n * 2];
        
        for(int x = 0; x < 2 * n; x++){
            
            if (x < n){
                a1[x * 2] = nums[x];
            }
            else{
                a1[1 + (x-n) * 2] = nums[x];
            }
        }  
        
        return a1;
    }
}
