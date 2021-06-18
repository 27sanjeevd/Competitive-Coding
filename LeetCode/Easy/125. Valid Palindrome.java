class Solution {
    public boolean isPalindrome(String s) {
        String temp1 = "";
        for(int x = 0; x < s.length(); x++){
            
            if (Character.isLetter(s.charAt(x))){
                temp1 += Character.toString(s.charAt(x));
            }
            else if (Character.isDigit(s.charAt(x))){
                temp1 += Character.toString(s.charAt(x));
            }
        }
        
        String[] a1 = temp1.split("");
        
        for(int x = 0; x < temp1.length() / 2; x++){
            if (!a1[x].toLowerCase().equals(a1[a1.length - 1 - x].toLowerCase())){
                return false;
            }
        }
        
        return true;
    }
}
