/*
ID: 27sanjeevd
LANG: JAVA
TASK: palsquare
*/
import java.io.*;
import java.util.*;

public class palsquare {
	public static void main(String [] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new FileReader("palsquare.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("palsquare.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		
		
		int B = Integer.parseInt(st.nextToken());
		
		for(int x = 1; x <= 300; x++) {
			
			int temp = x;
			temp = (int) Math.pow(x, 2);
			String temp1 = convertBase(Integer.toString(temp), 10, B);
			if (checkPal(temp1)) {
				//System.out.println(convertBase(Integer.toString(x), 10, B) + " " + temp1);
				String temp2 = convertBase(Integer.toString(x), 10, B);
				String temp3 = "";
				String temp4 = "";
				
				for(int y = 0; y < temp1.length(); y++) {
					if (Character.isLetter(temp1.charAt(y))){
						temp3 += Character.toString(Character.toUpperCase(temp1.charAt(y)));
					}
					else {
						temp3 += Character.toString(temp1.charAt(y));
					}
				}
				for(int y = 0; y < temp2.length(); y++) {
					if (Character.isLetter(temp2.charAt(y))){
						temp4 += Character.toString(Character.toUpperCase(temp2.charAt(y)));
					}
					else {
						temp4 += Character.toString(temp2.charAt(y));
					}
				}
				
				out.println(temp4 + " " + temp3);
			}
			
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
