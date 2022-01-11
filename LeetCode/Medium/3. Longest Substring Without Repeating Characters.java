/*
Given a string s, find the length of the longest substring without repeating characters.
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int start = 0;
        int end = 0;
        int output = 0;
        
        HashSet<Character> temp = new HashSet<Character>();
        
        while (end < s.length()){
            
            if (temp.add(s.charAt(end))){
                end++;
                output = Math.max(output, temp.size());
            }
            else{
                temp.remove(s.charAt(start));
                start++;
            }
            
        }
        
        return output;
    }
}
