import java.io.*;
import java.util.*;

public class FairPlayoff {

	public static void main(String[] args) throws IOException {

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int x = 0; x < T; x++) {
			
			st = new StringTokenizer(f.readLine());
			
			int[] a1 = new int[4];
			
			for(int y = 0; y < 4; y++) {
				a1[y] = Integer.parseInt(st.nextToken());
			}
			
			if (Math.max(a1[0], a1[1]) > Math.max(a1[2], a1[3])) {
				
				if (Math.min(a1[0], a1[1]) > Math.max(a1[2], a1[3])) {
					
					out.println("NO");
				}
				else {
					out.println("YES");
				}
				
			}
			else {
				if (Math.min(a1[2], a1[3]) > Math.max(a1[0], a1[1])) {
					out.println("NO");
				}
				else {
					out.println("YES");
				}
			}
			
		}
		
		out.close();
	}
}
