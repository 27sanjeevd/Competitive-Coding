class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        
        HashMap<Integer, Integer> a2 = new HashMap();
        
        for(int x = 0; x < nums1.length; x++){
            a2.put(nums1[x], a2.getOrDefault(nums1[x], 0) + 1);
        }
        for(int x = 0; x < nums2.length; x++){
            if (a2.getOrDefault(nums2[x], 0) > 0){
                a1.add(nums2[x]);
                a2.put(nums2[x], a2.getOrDefault(nums2[x], 0) - 1);
            }
        }
        
        int[] a3 = new int[a1.size()];
        for(int x = 0; x < a1.size(); x++){
            a3[x] = a1.get(x);
        }
        
        return a3;
        
    }
}
