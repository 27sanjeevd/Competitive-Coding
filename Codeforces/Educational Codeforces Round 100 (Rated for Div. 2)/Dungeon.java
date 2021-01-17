import java.io.*;
import java.util.*;
import java.math.*;

public class Dungeon {

	public static void main(String[] args) throws IOException {

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int x = 0; x < T; x++) {
			
			st = new StringTokenizer(f.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			String output = "";

			int val = (a+b+c) / 9;
			
			if ((a+b+c) % 9 != 0 || Math.min(a, Math.min(b, c)) < val) {
				
				output = "NO";
			}
			
			else {
				
				output = "YES";
			}
			
			out.println(output);
						
		}

		out.close();
	}
	
	
}
