class Solution {
    public int[] replaceElements(int[] arr) {
        
        int max = 0;
        
        for(int x = arr.length - 1; x >= 0; x--){
            
            if (x == arr.length - 1){
                max = arr[x];
            }
            else{
                int temp = max;
                if (arr[x] > max){
                    max = arr[x];
                }
                
                arr[x] = temp;
            }
        }
        
        arr[arr.length - 1] = -1;
        
        return arr;
    }
}
