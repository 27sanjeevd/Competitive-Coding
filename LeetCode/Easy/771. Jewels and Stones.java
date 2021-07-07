/*
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. 
Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".
*/
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        String[] a1 = stones.split("");
        
        HashMap<String, Integer> b1 = new HashMap();
        
        for(int x = 0; x < a1.length; x++){
            b1.put(a1[x], b1.getOrDefault(a1[x], 0) + 1);
        }
        
        int output = 0;
        String[] c1 = jewels.split("");
        for(int x = 0; x < c1.length; x++){
            output += b1.getOrDefault(c1[x], 0);
        }
        
        return output;
    }
}
