class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<String, Integer> a1 = new HashMap();
        
        String[] s1 = s.split("");
        
        for(int x = 0; x < s1.length; x++){
            
            a1.put(s1[x], a1.getOrDefault(s1[x], 0) + 1);
        }
        
        String temp = "";
        
        for(int x = 0; x < s1.length; x++){
            if (a1.getOrDefault(s1[x], 0) == 1){
                return x;
            }
        }
        
        return -1;
        
    }
}
