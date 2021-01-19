class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 1){
            return s;
        }
        if (s.isEmpty()){
            return null;
        }
        
        String long1 = "";
        
        for(int x = 0; x < s.length(); x++){
            String temp = help(s, x, x);
            if (temp.length() > long1.length()){
                long1 = temp;
            }
            
            temp = help(s, x, x+1);
            if (temp.length() > long1.length()){
                long1 = temp;
            }
        }
        
        return long1;
    }
    
    public String help(String s, int a1, int b1){
        
        while(a1 >= 0 && b1 <= s.length() - 1 && s.charAt(a1) == s.charAt(b1)){
            a1--;
            b1++;
        }
        
        a1++;
        b1--;
        
        return s.substring(a1, b1+1);
    }
}
