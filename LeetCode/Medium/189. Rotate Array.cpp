class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        
        int size1 = nums.size();
        
        vector<int> finalVal(size1, 0);
        
        for(int i = 0; i < size1; i++){
            
            finalVal[(i + k)%size1] = nums[i];
        }
        
        nums = finalVal;
        
        
    }
};
