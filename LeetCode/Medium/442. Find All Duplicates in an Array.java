class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        HashMap<Integer, Integer> b1 = new HashMap();
        
        for(int x = 0; x < nums.length; x++){
            if (b1.getOrDefault(nums[x], 0) == 1){
                a1.add(nums[x]);
            }
            b1.put(nums[x], b1.getOrDefault(nums[x], 0) + 1);
        }
        
        return a1;
    }
}
