class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int profit = 0;
        
        for(int x = 0; x < prices.size() - 1; x++){
            if (prices[x+1] > prices[x]){
                profit += prices[x+1] - prices[x];
            }
        }
        
        return profit;
    }
};
