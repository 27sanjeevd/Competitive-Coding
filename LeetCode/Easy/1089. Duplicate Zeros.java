class Solution {
    public void duplicateZeros(int[] arr) {
        
        int max = arr.length;
        
        for(int x = 0; x < max - 1; x++){
            
            if (arr[x] == 0){
                
                for(int y = max - 2; y > x; y--){
                    arr[y + 1] = arr[y];
                }
                
                arr[x+1] = 0;
                
                x++;
            }
            
        }
    }
}
