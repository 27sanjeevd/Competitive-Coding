import java.io.*;
import java.util.*;
import java.math.*;

public class FavoriteSequence {

	public static void main(String[] args) throws IOException {

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int x = 0; x < T; x++) {
			
			int N = Integer.parseInt(f.readLine());
			
			int[] V = new int[N];
			st = new StringTokenizer(f.readLine());
			
			for(int y = 0; y < N; y++) {
				V[y] = Integer.parseInt(st.nextToken());
			}
			
			int[] W = new int[N];
			
			for(int y = 0; y < N; y++) {
				
				if (y < N/2 + N%2) {
					
					W[2 * y] = V[y];
				}
				else {
					
					W[2 * (N-y) - 1] = V[y];					
				}
				
			}
			
			String output = "";
			
			for(int y = 0; y < N; y++) {
				
				if (output.equals("")) {
					
					output = Integer.toString(W[y]);
					
				}
				else {
					output += " " + Integer.toString(W[y]);
				}
				
			}
			
			out.println(output);
			
			
		}

		out.close();
	}
	
	
}
