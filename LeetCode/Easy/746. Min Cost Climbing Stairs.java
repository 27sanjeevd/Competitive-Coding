/*
You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

You can either start from the step with index 0, or the step with index 1.

Return the minimum cost to reach the top of the floor.
*/

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        for(int x = 2; x < cost.length; x++){
            cost[x] += Math.min(cost[x-1], cost[x-2]);
        }
        
        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }
}
