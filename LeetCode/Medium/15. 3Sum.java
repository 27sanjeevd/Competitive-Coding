class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null){
            return Collections.emptyList();
        }
        if (nums.length < 3){
            return Collections.emptyList();
        }
        
        Set<List<Integer>> a1 = new HashSet();
        
        Arrays.sort(nums);
        
        for(int low = 0; low < nums.length - 2; low++){
            int mid = low + 1;
            int high = nums.length - 1;
            
            while (mid < high){
                int sum = nums[low] + nums[mid] + nums[high];
                if (sum == 0){
                    a1.add(new ArrayList<>(Arrays.asList(nums[low], nums[mid], nums[high])));
                    mid++;
                    high--;
                }
                else if (sum > 0){
                    high--;
                }
                else if (sum < 0){
                    mid++;
                }
            }
        }
        
        return new ArrayList<>(a1);
    }
}
