/*
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*/

class Solution {
    public int climbStairs(int n) {
        int[] temp = new int[n+1];
        temp[0] = 1;
        temp[1] = 1;
        for(int x = 2; x <= n; x++){
            temp[x] = temp[x-1] + temp[x-2];
        }
        
        return temp[n];
    }
}
