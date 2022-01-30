
/*
ID: 27sanjeevd
LANG: JAVA
TASK: div7
*/


import java.io.*;
import java.util.*;

class div7 {
  public static void main (String [] args) throws IOException {
	  
    BufferedReader f = new BufferedReader(new FileReader("div7.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("div7.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    
    int N = Integer.parseInt(st.nextToken());   
    long[] a1 = new long[N + 1];
    long[] mult = new long[N + 1];
    
    for(int x = 0; x < N; x++) {
    	long temp = (long) Integer.parseInt(f.readLine());
    	a1[x + 1] = a1[x] + temp;
    	mult[x + 1] = a1[x+1] % 7;
    	
    }
    int max = 0;
    for(int x = 0; x < 7; x++) {
    	int beginning = 0, end = 0; boolean check1 = true;
    	
    	for(int y = 0; y < N; y++) {
    		if (mult[y] == x && check1) {
    			beginning = y;
    			check1 = false;
    		}
    		else if (mult[y] == x) {
    			end = y;
    		}
    	
    	}
    	if (end == 0) {
    		end = beginning++;
    	}
    	
    	max = Math.max(max, end - beginning);
    }
    out.println(max);
                            
    out.close();                                  
  }
}