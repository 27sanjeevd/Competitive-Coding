class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> a1 = new ArrayList<String>();
        
        for(int x = 1; x <= n; x++){
            if (x % 5 == 0 && x % 3 == 0){
                a1.add("FizzBuzz");
            }
            else if (x % 3 == 0){
                a1.add("Fizz");
            }
            else if (x % 5 == 0){
                a1.add("Buzz");
            }
            else{
                a1.add(Integer.toString(x));
            }
        }
        
        return a1;
    }
}
