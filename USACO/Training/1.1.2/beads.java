/*
ID: 27sanjeevd
LANG: JAVA
TASK: beads
*/
import java.io.*;
import java.util.*;

public class beads {

	public static void main(String[] args) throws IOException {
		///*
		BufferedReader f = new BufferedReader(new FileReader("beads.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		
		String temp = f.readLine();
		//*/
		
		//int N = 29;
		//String temp = "wwwbbrwrbrbrrbrbrwrwwrbwrwrrb";
		
		int max = 2;
		
		for(int x = 0; x < N; x++) {
			int left1 = takeLeft(x, temp);
			int right1 = x == N - 1 ? takeRight(0, temp) : takeRight(x + 1, temp);
			
			int temp1 = Math.min(left1 + right1, N);
			
			max = temp1 > max ? temp1 : max;
		}
		
		
		System.out.println(max);
		String a1 = Integer.toString(max);
	    out.print(a1 + "\n");
	    out.close();
	    
	}
	
	public static int takeLeft(int start, String beads){
		  
		int left = start;
		int count1 = 1;
		boolean check1 = true;
		
		char color = beads.charAt(left);
		
		left = left == 0 ? beads.length() - 1 : left - 1;
		
		while (check1 && count1 < beads.length()) {
			
			char pos = beads.charAt(left);
			if (pos != 'w' && color != 'w' && color != pos) {
				check1 = false;
			}
			else {
				if (color == 'w' && pos != 'w') {
					color = pos;
				}
				count1++;

				left = left == 0 ? beads.length() - 1 : left - 1;
			}
			
		}
		return count1;
	}	
	
	public static int takeRight(int start, String beads) {
		
		int right = start;
		int count1 = 1;
		boolean check1 = true;
		
		char color = beads.charAt(right);
		
		right = right == beads.length() - 1 ? 0 : right + 1;
		
		while (check1 && count1 < beads.length()) {
			
			char pos = beads.charAt(right);
			if (pos != 'w' && color != 'w' && pos != color) {
				check1 = false;
				
			}
			else {
				
				if (color == 'w' && pos != 'w') {
					color = pos;
				}
				
				count1++;
				right = right == beads.length()- 1 ? 0 : right + 1;
			}
			
		}
		return count1;
		
	}
	
	
}

