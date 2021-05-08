import java.io.*;
import java.util.*;

public class OrdinaryNumbers {

	public static void main(String[] args) throws IOException {

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		for(int x = 0; x < N; x++) {
			
			int T = Integer.parseInt(f.readLine());
			int val = 1;
			int output = 0;
			
			boolean check1 = true;
			while (val <= T && check1) {
				
				for(int y = 1; y < 10; y++) {
					
					if (y * val > T) {
						check1 = false;
						break;
					}
					
					output++;
					
				}
				
				val *= 10;
				val += 1;
				
			}
			
			out.println(output);
		}
			
		out.close();
	}
}
