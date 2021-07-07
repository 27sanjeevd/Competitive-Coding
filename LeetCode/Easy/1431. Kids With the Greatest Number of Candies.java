/*
Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the ith kid has.

For each kid check if there is a way to distribute extraCandies among the kids such that he or she can have the greatest number of candies among them. 
Notice that multiple kids can have the greatest number of candies.
*/
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> a1 = new ArrayList<>();
        
        int max = 0;
        for(int x = 0; x < candies.length; x++){
            max = Math.max(max, candies[x]);
        }
        
        for(int x = 0; x < candies.length; x++){
            a1.add(candies[x] + extraCandies >= max);
        }
        
        return a1;
    }
}
