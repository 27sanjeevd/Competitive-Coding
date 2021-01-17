import java.io.*;
import java.util.*;
import java.math.*;

public class BovineDilemma {

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
			
			ArrayList<String> vals = new ArrayList<String>();
			
			for(int a = 0; a < N - 1; a++) {
				for(int b = a + 1; b < N; b++) {
					if (!vals.contains(Double.toString(0.5 * 1.0 * Math.abs(V[b]-V[a])))){
						
						vals.add(Double.toString(0.5 * Math.abs(V[b]-V[a]) * 1.0));
					}
				}
			}
			
			out.println(vals.size());
			
		}

		out.close();
	}
	
	
}
