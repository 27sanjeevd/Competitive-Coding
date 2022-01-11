/*
The Tribonacci sequence Tn is defined as follows: 

T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

Given n, return the value of Tn.
*/

class Solution {
    public int tribonacci(int n) {
        if (n < 3){
            if (n == 0){
                return 0;
            }
            if (n == 1 || n == 2){
                return 1;
            }
        }
        
        int[] temp = new int[n + 1];
        temp[0] = 0;
        temp[1] = 1;
        temp[2] = 1;
        
        for(int x = 3; x <= n; x++){
            temp[x] = temp[x-1] + temp[x-2] + temp[x-3];
        }
        
        return temp[n];
    }
}
