import java.io.*;
import java.util.*;

public class OddSet {

	public static void main(String[] args) throws IOException {

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int x = 0; x < T; x++) {
			int N = Integer.parseInt(f.readLine());
			
			st = new StringTokenizer(f.readLine());

			int counter1 = 0;
			
			for(int y = 0; y < N * 2; y++) {
				if (Integer.parseInt(st.nextToken()) % 2 == 0) {
					counter1++;
				}
			}
			
			if (counter1 == N) {
				out.println("YES");
			}
			else {
				out.println("NO");
			}
			
		}
		
		out.close();
	}
	
	
}