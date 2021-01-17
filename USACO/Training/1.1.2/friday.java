/*
ID: 27sanjeevd
LANG: JAVA
TASK: friday
*/

import java.util.*;
import java.io.*;

public class friday {
	
	static int dateCounter = 1;
	static int dayOfWeek = 3;
	static int month = 1;
	static int year = 1900;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new FileReader("friday.in"));
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
	    StringTokenizer st = new StringTokenizer(f.readLine());
	    
	    int N = Integer.parseInt(st.nextToken());
	    
		//int N = 20;
	    int[] weekCounter = new int[7];
	    
	    while (year < 1900 + N) {
	    	
	    	increment();
	    	if (dateCounter == 13) {
	    		weekCounter[dayOfWeek-1]++;
	    	}
	    	
	    }
	    
	    String output = "";
	    
	    for(int x = 0; x < weekCounter.length; x++) {
	    	if (x != 0) {
	    		output += " ";
	    	}
	    	output += Integer.toString(weekCounter[x]);
	    }
	    
	    out.println(output);
	    out.close();
	    
		
	}
	
	public static boolean isLeapYear(int year){
		
        if(year % 100 == 0){
        	
            if(year % 400 == 0){
            	
                return true;
            }
            
            return false;
        }
        
        return (year % 4 == 0);
    }
	
	public static void increment() {
		
		dateCounter++;
		dayOfWeek++;
		if (dayOfWeek > 7) {
			dayOfWeek = 1;
		}
		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			
			if (dateCounter > 31) {
				dateCounter = 1;
				month++;
			}
		}
		
		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			
			if (dateCounter > 30) {
				dateCounter = 1;
				month++;
			}
		}
		else if (month == 2) {
			if (isLeapYear(year)) {
				if (dateCounter > 29) {
					dateCounter = 1;
					month++;
				}
			}
			else {
				if (dateCounter > 28) {
					dateCounter = 1;
					month++;
				}
			}
		}
		
		if (month > 12) {
			month = 1;
			year++;
		}
	}
	
}
