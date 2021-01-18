class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String temp1 = "";
        String temp2 = "";
        
        if (word1.length <= word2.length){
            
            for(int x = 0; x < word2.length; x++){
                if (x < word1.length){
                    temp1 += word1[x];
                }
                temp2 += word2[x];
            }
        }
        
        else if (word1.length > word2.length){
            
            for(int x = 0; x < word1.length; x++){
                if (x < word2.length){
                    temp2 += word2[x];
                }
                temp1 += word1[x];
            }
        }
        
        if (temp1.equals(temp2)){
            return true;
        }
        else{
            return false;
        }
        
    }
}
