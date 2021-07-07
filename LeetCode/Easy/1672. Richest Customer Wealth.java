/*
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank. 
Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
*/
class Solution {
    public int maximumWealth(int[][] accounts) {
        for(int x = 1; x < accounts[0].length; x++){
            for(int y = 0; y < accounts.length; y++){
                accounts[y][x] += accounts[y][x-1];
            }
        }
        
        int max = 0;
        for(int x = 0; x < accounts.length; x++){
            max = Math.max(max, accounts[x][accounts[0].length - 1]);
        }
        
        return max;
    }
}
