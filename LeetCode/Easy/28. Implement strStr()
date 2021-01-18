class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.equals(needle)){
            return 0;
        }
        for(int x = 0; x < haystack.length() - needle.length() + 1; x++){
            
            if (haystack.substring(x, x + needle.length()).equals(needle)){
                return x;
            }
        }
        
        return -1;
    }
    
}
