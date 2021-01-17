import java.io.*;
import java.util.*;

public class regularBracketSequence {

	public static void main(String[] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		for(int x = 0; x < N; x++) {
			
			String a1 = f.readLine();
			String[] a2 = a1.split("");
			
			int start = 0;
			int end = 0;
			int qCount = 0;
			
			int start1 = 0;
			int end1 = 0;
			int qCount1 = 0;
			
			String output = "YES";
			for(int y = 0; y < a2.length; y++) {
				
				if (a2[y].equals(")")) {
					end++;
				}
				else if (a2[y].equals("(")) {
					start++;
				}
				else {
					qCount++;
				}
				
				if (end > (start + qCount)) {
					
					output = "NO";
				}
				
				
				
				
				if (a2[a2.length-y-1].equals(")")) {
					end1++;
				}
				else if (a2[a2.length-y-1].equals("(")) {
					start1++;
				}
				else {
					qCount1++;
				}
				
				if (start1 > (end1 + qCount1)) {
					
					output = "NO";
				}
				
				
			}
			
			if (qCount % 2 != 0) {
				output = "NO";
			}
			
			out.println(output);
			
		}
		
		out.close();
		
	}
}
