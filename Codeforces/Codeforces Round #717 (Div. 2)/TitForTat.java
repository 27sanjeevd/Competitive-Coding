import java.io.*;
import java.util.*;

public class TitForTat {

	public static void main(String[] args) throws IOException {

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int x = 0; x < T; x++) {
			st = new StringTokenizer(f.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			int[] a1 = new int[N];

			st = new StringTokenizer(f.readLine());
			for(int y = 0; y < N; y++) {
				
				a1[y] = Integer.parseInt(st.nextToken());
			}
			
			int position = 0;
			
			while (position != N - 1 && K > 0) {
				
				if (a1[position] == 0) {
					position++;
				}
				else {
					a1[position]--;
					a1[N-1]++;
					K--;
				}
				
			}
			
			String output = Integer.toString(a1[0]);
			for(int y = 1; y < N; y++) {
				output +=  " " + a1[y];
			}
			
			out.println(output);
			
		}
		
		out.close();
	}
}
