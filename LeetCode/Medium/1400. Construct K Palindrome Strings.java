class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k){
            return false;
        }
        HashMap<String, Integer> a1 = new HashMap();
        
        for(int x = 0; x < s.length(); x++){
            String temp = s.substring(x, x+1);
            a1.put(temp, a1.getOrDefault(temp, 0) + 1);
        }
        
        int odds = 0;
        
        for(String id: a1.keySet()){
            if (a1.get(id) % 2 != 0){
                odds++;
            }
        }
        
        return odds <= k;
    }
}
