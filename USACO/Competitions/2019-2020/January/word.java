/*
ID: 27sanjeevd
LANG: JAVA
TASK: test
*/
import java.io.*;
import java.util.*;

public class word {
  public static void main (String [] args) throws IOException {
	  
    BufferedReader f = new BufferedReader(new FileReader("word.in"));
    
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("word.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(f.readLine());
    String[] words = new String[N];
    int[] length = new int[N];
    for(int x = 0; x < N; x++) {
    	String temp = st.nextToken(); 	
    	words[x] = temp;
    	length[x] = temp.length();
    }
    
    int pos = 0;
    int counter = K;
    String[] a1 = new String[N];
    String temp1 = "";
    for(int x = 0; x < N; x++) {
    	
    	if(length[x] <= counter) {
    		counter -= length[x];
    		if(temp1 == "") {
    			temp1 += words[x];
    		}
    		else {
    			temp1 = temp1 + " " + words[x];
    		}
    	}
    	else {
    		
    		a1[pos] = temp1;
    		pos += 1;
    		counter = K;
    		counter -= length[x];
    		temp1 = "";
    		temp1 += words[x];
    		
    	}
    	
    }
    a1[pos] = temp1;
    for(int x = 0; x < a1.length; x++) {
    	if(a1[x] != null) {
    		out.println(a1[x]);
    	}
    }
    out.close();
  }
  
}
