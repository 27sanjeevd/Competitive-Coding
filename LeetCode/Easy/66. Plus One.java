class Solution {
    public int[] plusOne(int[] digits) {
        
        for(int x = digits.length - 1; x >= 0; x--){
            
            if (digits[x] != 9){
                digits[x]++;
                break;
            }
            else {
                digits[x] = 0;
            }
            
        }
        
        if (digits[0] == 0){
            int[] temp = new int[digits.length + 1];
            temp[0] = 1;
            return temp;
        }
        
        return digits;
    }
}
