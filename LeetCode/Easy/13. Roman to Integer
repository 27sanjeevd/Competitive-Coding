import java.util.*;
import java.io.*;

class Solution {
    public int romanToInt(String s) {
        
        HashMap<String, Integer> temp1 = new HashMap<String, Integer>();
        
        temp1.put("I", 1);
        temp1.put("V", 5);
        temp1.put("X", 10);
        temp1.put("L", 50);
        temp1.put("C", 100);
        temp1.put("D", 500);
        temp1.put("M", 1000);
        
        String[] s1 = s.split("");
        
        int output = 0;
        
        for(int x = s.length() - 2; x >= 0; x--){
            if (temp1.get(s1[x]) < temp1.get(s1[x+1])){
                output -= temp1.get(s1[x]);
            }
            else {
                output += temp1.get(s1[x]);
            }
        }
        
        output += temp1.get(s1[s.length() - 1]);
        
        return output;
    }
}
