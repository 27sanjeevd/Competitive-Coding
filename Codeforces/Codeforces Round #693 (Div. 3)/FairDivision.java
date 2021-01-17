import java.io.*;
import java.util.*;
import java.math.*;

public class FairDivision {

	public static void main(String[] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int x = 0; x < T; x++) {
			
			int N = Integer.parseInt(f.readLine());
					
			st = new StringTokenizer(f.readLine());
			ArrayList<Integer> a1 = new ArrayList<Integer>();
			
			for(int y = 0; y < N; y++) {
				
				a1.add(Integer.parseInt(st.nextToken()));
			}
			
			Collections.sort(a1, Collections.reverseOrder());
			int aSum = 0;
			int bSum = 0;
			
			for(int y = 0; y < a1.size(); y++) {
				
				if (aSum < bSum) {
					aSum += a1.get(y);
				}
				else {
					bSum += a1.get(y);
				}
				
			}
			
			if (aSum != bSum) {
				out.println("NO");
			}
			else {
				out.println("YES");
			}
			
			
		}

		out.close();
	}
	
}
