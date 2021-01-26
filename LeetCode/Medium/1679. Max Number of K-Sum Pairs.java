class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        int temp = 0;
        
        for(int x = 0; x < nums.length; x++){
            int opposite = k - nums[x];
            
            if (map.containsKey(opposite)){
                if (map.get(k - nums[x]) != 1){
                    map.put(k - nums[x], map.get(k - nums[x]) - 1);
                }
                else {
                    map.remove(k - nums[x]);
                }
                
                temp++;
            }
            else {
                map.put(nums[x], map.getOrDefault(nums[x], 0) + 1);
                
            }
        }
        
        return temp;
    }
}
