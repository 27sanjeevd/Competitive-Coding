import java.io.*;
import java.util.*;
import java.math.*;

public class replacingElements {

	public static void main(String[] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int a = 0; a < T; a++) {
			
			st = new StringTokenizer(f.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int D = Integer.parseInt(st.nextToken());
			
			ArrayList<Integer> a1 = new ArrayList<Integer>();

			st = new StringTokenizer(f.readLine());
			for(int x = 0; x < N; x++) {
				
				a1.add(Integer.parseInt(st.nextToken()));
			}
			
			Collections.sort(a1);
			
			int b1 = a1.get(0);
			int b2 = a1.get(1);
			int b3 = a1.get(2);
			
			boolean output = false;
			
			if (b1 + b2 <= D) {
				output = true;
			}
			else {
				
				boolean temp1 = true;
				
				for(int z = 2; z < N; z++) {
					if (a1.get(z) > D) {
						temp1 = false;
					}
				}
				
				output = temp1;
			}
			
			String output1 = "";
			
			if (output) {
				output1 = "YES";
			}
			else {
				output1 = "NO";
			}
			
			out.println(output1);
			
		}

		out.close();
	}
	
	
}
