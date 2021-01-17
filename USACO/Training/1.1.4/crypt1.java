/*
ID: 27sanjeevd
LANG: JAVA
TASK: crypt1
*/

import java.io.*;
import java.util.*;

public class crypt1 {
    public static void main(String[] args) throws Exception {
    	
        BufferedReader f = new BufferedReader(new FileReader("crypt1.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("crypt1.out")));
        
        int N = Integer.parseInt(f.readLine());
        
        StringTokenizer st = new StringTokenizer(f.readLine());
        
        List<Integer> digits = new ArrayList<Integer>();
        
        for (int i = 0; i < N; i++) {
        	
            digits.add(Integer.parseInt(st.nextToken()));
        }
        
        int[] a = new int[] {0, 0, 0};
        int[] b = new int[] {0, 0};
        
        int count = 0;
        for (int i = 0; i < digits.size(); i++) {
        	
            a[0]=digits.get(i);
            for (int j = 0; j < digits.size(); j++) {
            	
                a[1]=digits.get(j);
                for (int k = 0; k < digits.size(); k++) {
                	
                    a[2]=digits.get(k);
                    for (int l = 0; l < digits.size(); l++) {
                    	
                        b[0]=digits.get(l);
                        for (int m = 0; m < digits.size(); m++) {
                        	
                            b[1]=digits.get(m);
                            
                            int abc = 100 * a[0] + 10 * a[1] + a[2];
                            
                            int de = 10 * b[0] + b[1];
                            
                            boolean check1 = true;
                            
                            if (isIn(abc * b[1], digits) != 3) {
                            	
                            	check1 = false;
                            }
                            
                            
                            if (isIn(abc*b[0], digits) != 3) {
                            	
                            	check1 = false;
                            }
                            
                            if (isIn(abc*de, digits) != 4) {
                            	
                            	check1 = false;
                            }
                            
                            if (check1) {
                                count++;
                            }
                        }
                    }   
                }
            }
        }
        
        out.println(count);
        out.close();
    }
    public static int isIn(int num, List<Integer> digits) {
        int n = String.valueOf(num).length();
        
        while (num > 0) {
        	
            int temp = num % 10;
            boolean temp1 = false;
            
            for (int digit : digits) {
            	
                if (temp == digit) {
                	temp1 = true;
                }
            }
            
            if(!temp1) {
            	
                return 0;
            }
            num /= 10;
        }
        return n;
    }
}
