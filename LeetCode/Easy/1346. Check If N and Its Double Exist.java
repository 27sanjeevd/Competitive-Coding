class Solution {
    public boolean checkIfExist(int[] arr) {
        
        for(int x = 0; x < arr.length - 1; x++){
            for(int y = x + 1; y < arr.length; y++){
                if (arr[y] == arr[x] * 2 || arr[x] == arr[y] * 2){
                    return true;
                }
            }
        }
        
        return false;
    }
}
