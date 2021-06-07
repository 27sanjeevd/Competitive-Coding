class Solution {
    public void reverseString(char[] s) {
        reverse1(s, 0);
    }
    
    public void reverse1(char[] s, int position){
        
        if (!(position >= s.length / 2)){
            
            char temp = s[position];
            s[position] = s[s.length - position - 1];
            s[s.length - position - 1] = temp;
            position++;
            
            reverse1(s, position);
        }
        
    }
}
