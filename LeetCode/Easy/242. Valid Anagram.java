class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<String, Integer> a1 = new HashMap();
        
        String[] temp1 = s.split("");
        for(int x = 0; x < temp1.length; x++){
            a1.put(temp1[x], a1.getOrDefault(temp1[x], 0) + 1);
        }
        
        String[] temp2 = t.split("");
        for(int x = 0; x < temp2.length; x++){
            a1.put(temp2[x], a1.getOrDefault(temp2[x], 0) - 1);
        }
        
        if (temp1.length > temp2.length){
            for(int x = 0; x < temp1.length; x++){
                if (a1.getOrDefault(temp1[x], 0) != 0){
                    return false;
                }
            }
        }
        else {
            for(int x = 0; x < temp2.length; x++){
                if (a1.getOrDefault(temp2[x], 0) != 0){
                    return false;
                }
            }
        }
        
        return true;
    }
}
