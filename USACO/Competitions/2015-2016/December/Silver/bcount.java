
/*
ID: 27sanjeevd
LANG: JAVA
TASK: bcount
*/


import java.io.*;
import java.util.*;

class bcount {
  public static void main (String [] args) throws IOException {
	  
    BufferedReader f = new BufferedReader(new FileReader("bcount.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("bcount.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    
    int N = Integer.parseInt(st.nextToken());   
    int Q = Integer.parseInt(st.nextToken());  
    
    int[] a = new int[N+1];
    int[] b = new int[N+1];
    int[] c = new int[N+1];
    
    for(int x = 0; x < N; x++) {
    	int temp = Integer.parseInt(f.readLine());
		if (temp == 1) {
			a[x]++;
		}
		if (temp == 2) {
			b[x]++;
		}
		if (temp == 3) {
			c[x]++;
		}
		
		a[x+1] = a[x];
		b[x+1] = b[x];
		c[x+1] = c[x];
    }
    
    for(int x = 0; x < Q; x++) {
    	String temp = "";
    	st = new StringTokenizer(f.readLine());
        
        int a1 = Integer.parseInt(st.nextToken()) - 1;   
        int b1 = Integer.parseInt(st.nextToken()) - 1;  
    	if (a1 == 0) {
            temp += Integer.toString(a[b1]) + " ";
            temp += Integer.toString(b[b1]) + " ";
            temp += Integer.toString(c[b1]);
    		
    	}
    	else {
            temp += Integer.toString(a[b1] - a[a1 - 1]) + " ";
            temp += Integer.toString(b[b1] - b[a1 - 1]) + " ";
            temp += Integer.toString(c[b1] - c[a1 - 1]);
    		
    	}
    	
    	out.println(temp);
    }
                            
    out.close();                                  
  }
}