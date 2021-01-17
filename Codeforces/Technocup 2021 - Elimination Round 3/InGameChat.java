import java.io.*;
import java.util.*;

public class InGameChat {

	public static void main(String[] args) throws IOException {

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int x = 0; x < T; x++) {
			
			int N = Integer.parseInt(f.readLine());
			
			String[] a1 = f.readLine().split("");
			
			boolean check1 = true;
			int counter1 = 0;
			
			for(int y = 0; y < N; y++) {
				
				if (check1) {
					if (a1[a1.length-y-1].equals(")")) {
						
						counter1++;
						
					}
					else {
						check1 = false;
					}
				}
				
			}
			
			String output = "";
			if (counter1 > a1.length - counter1) {
				output = "YES";
			}
			else {
				output = "NO";
			}
			
			
			out.println(output);
			
		}
		
		out.close();
		
	}
}
