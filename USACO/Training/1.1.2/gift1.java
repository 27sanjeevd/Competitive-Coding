/*
ID: 27sanjeevd
LANG: JAVA
TASK: gift1
*/

import java.util.*;
import java.io.*;

public class gift1 {
	public static void main(String args[]) throws IOException {
		
		BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
	    StringTokenizer st = new StringTokenizer(f.readLine());
	    
	    int N = Integer.parseInt(st.nextToken());
	    String[] people = new String[N];
	    int[] money = new int[N];
	    for (int x = 0; x < N; x++) {
	    	st = new StringTokenizer(f.readLine());
	    	people[x] = st.nextToken();
	    	money[x] = 0;
	    }
	    String line = null;
	    
	    while ((line = f.readLine()) != null) {
	    	
	    	int giver = check(people, line);
	    	st = new StringTokenizer(f.readLine());
	    	String[] new_val1 = new String[2];
	    	
	    	new_val1[0] = st.nextToken();
	    	new_val1[1] = st.nextToken();
	    	
	    	int amount = Integer.parseInt(new_val1[0]);
	    	
	    	int recipient_amount = Integer.parseInt(new_val1[1]);
	    	
	    	int[] recipients = new int[recipient_amount];
	    	for (int x = 0; x < recipient_amount; x++) {
	    		recipients[x] = check(people, f.readLine());
	    	}
	    	if (amount != 0) {
		    	int gift = amount / recipient_amount;
		    	int remainder = amount % recipient_amount;
		    	money[giver] -= amount;
		    	money[giver] += remainder;
		    	for(int x = 0; x < recipient_amount; x++) {
		    		money[recipients[x]] += gift;
		    	}
	    	}	
	    	
	    }
	    
	    for(int x = 0; x < people.length; x++) {
	    	out.println(people[x] + " " + money[x]);
	    }
	    
	    out.close();
	    
	}
	
	public static int check(String[] array, String val) {
		int pos = 0;
		for (int x = 0; x < array.length; x++) {
			
			if(array[x].compareTo(val) == 0) {
				pos = x;
			}
			
		}
		
		return pos;
		
	}
	
}
