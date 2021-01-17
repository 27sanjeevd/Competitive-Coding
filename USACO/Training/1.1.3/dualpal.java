/*
ID: 27sanjeevd
LANG: JAVA
TASK: dualpal
*/
import java.io.*;
import java.util.*;

public class dualpal {
	public static void main(String [] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new FileReader("dualpal.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("dualpal.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		
		
		
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		
		int numToCheck = S + 1;
		int totalPal = 0;
		
		while (totalPal < N) {
		
			int palCounter = 0;
			for(int x = 2; x <= 10; x++) {
				
				String temp = convertBase(Integer.toString(numToCheck), 10, x);
				
				if (checkPal(temp)) {
					palCounter++;
				}
				
			}
			
			if (palCounter > 1) {
				out.println(numToCheck);
				totalPal++;
			}
			
			numToCheck++;
			
		}
		
		out.close();
	}
	
	public static String convertBase(String s, int base1, int base2) {
		
		return Integer.toString(Integer.parseInt(s, base1), base2);
	}
	
	public static boolean checkPal(String s) {
		
		boolean check1 = true;
		
		int left = 0;
		int right = s.length() - 1;
		
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				check1 = false;
			}
			
			left++;
			right--;
		}
		
		return check1;
		
	}
}
