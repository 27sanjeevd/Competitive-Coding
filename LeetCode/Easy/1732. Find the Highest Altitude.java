class Solution {
    public int largestAltitude(int[] gain) {
        
        int max = 0;
        int temp = 0;
        
        for(int x = 0; x < gain.length; x++){
            temp += gain[x];
            if (temp > max){
                max = temp;
            }
        }
            
        
        return max;
    }
    
}
