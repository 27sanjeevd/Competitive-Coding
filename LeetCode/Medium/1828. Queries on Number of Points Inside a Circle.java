/*
You are given an array points where points[i] = [xi, yi] is the coordinates of the ith point on a 2D plane. Multiple points can have the same coordinates.

You are also given an array queries where queries[j] = [xj, yj, rj] describes a circle centered at (xj, yj) with a radius of rj.

For each query queries[j], compute the number of points inside the jth circle. Points on the border of the circle are considered inside.

Return an array answer, where answer[j] is the answer to the jth query.
*/
class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] output = new int[queries.length];
        for(int x = 0; x < points.length; x++){
            for(int y = 0; y < queries.length; y++){
                double radius = getRad(queries[y][0], queries[y][1], points[x][0], points[x][1]);
                if (radius <= queries[y][2]){
                    output[y]++;
                }
            }
        }
        
        return output;
        
    }
    
    public static double getRad(int centerx, int centery, int pointx, int pointy){
        
        return Math.sqrt(Math.pow(Math.abs(centerx - pointx), 2) + Math.pow(Math.abs(centery - pointy), 2));
    }
}
