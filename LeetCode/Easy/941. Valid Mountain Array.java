class Solution {
    public boolean validMountainArray(int[] arr) {
        int temp1 = 0;
        
        
        for(int x = 0; x < arr.length - 1; x++){
            if (arr[x] < arr[x+1]){
                if (temp1 == 0){
                    temp1++;
                }
                else if (temp1 == 2){
                    return false;
                }
            }
            else if (arr[x] > arr[x+1]){
                if (temp1 == 0){
                    return false;
                }
                else if (temp1 == 1){
                    temp1++;
                }
            }
            else {
                return false;
            }
        }
        if (temp1 < 2){
            return false;
        }
        return true;
    }
}
