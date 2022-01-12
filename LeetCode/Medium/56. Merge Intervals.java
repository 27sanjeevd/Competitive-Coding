/*
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
*/

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        LinkedList<int[]> newList = new LinkedList<>();
        
        for(int[] list1 : intervals){
            if (newList.isEmpty() || newList.getLast()[1] < list1[0]){
                newList.add(list1);
            }
            else{
                newList.getLast()[1] = Math.max(newList.getLast()[1], list1[1]);
            }
        }
        
        return newList.toArray(new int[newList.size()][]);
    }
}
