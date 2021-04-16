class Solution {
    public int fib(int n) {
        
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        else{
            return fib1(0, 1, 1, n);
        }
    }
    
    public int fib1(int a, int b, int counter, int end){
        
        counter++;
        if (counter == end){
            return a + b;
        }
        else{
            return fib1(b, a + b, counter, end);
        }
        
    }
}
