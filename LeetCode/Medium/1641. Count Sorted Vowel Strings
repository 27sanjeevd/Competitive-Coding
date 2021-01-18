class Solution {
    public int countVowelStrings(int n) {
        return recurve(0, n, 0);
    }
    
    
	public int recurve(int temp1, int size, int size1){
        String[] vals = {"a", "e", "i", "o", "u"};
        int output = 0;
        
        if (size1 < size){
            for(int x = temp1; x < vals.length; x++){
                output += recurve(x, size, size1 + 1);    
            }
            
        }
        else if (size1 == size) {
            output += 1;
        }
        
        return output;
    }
}
