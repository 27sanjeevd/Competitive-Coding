import java.io.*;
import java.util.*;

public class buildingAFence {

	public static void main(String[] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int t = Integer.parseInt(st.nextToken());
		
		for(int x = 0; x < t; x++) {
			
			st = new StringTokenizer(f.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			int[] h = new int[N];
			st = new StringTokenizer(f.readLine());

			for(int y = 0; y < N; y++) {
				h[y] = Integer.parseInt(st.nextToken());
			}
			
			boolean trend = true;
			int val = 0;
			int counter = 0;
			
			ArrayList<String> trends = new ArrayList<String>();
			
			for(int y = 1; y < N; y++) {
				
				if (h[y] < h[y-1]) {
					if (!trend) {
						trends.add(Integer.toString(val) + " " + Integer.toString(counter));
						counter = 0;
						val = 0;
					}
					val += (h[y-1] - h[y]);
				}
				else if (h[y] > h[y-1]) {
					if (trend) {
						trends.add(Integer.toString(val) + " " + Integer.toString(counter));
						counter = 0;
						val = 0;
					}
					val += (h[y] - h[y-1]);
				}
				counter++;
				
			}
			
			if (checkTrends(trends, K)) {
				out.println("YES");
			}
			else {
				out.println("NO");
			}
			
		}
		
		out.close();
		
	}
	
	public static boolean checkTrends(ArrayList<String> a1, int K) {
		boolean output = true;
		
		for(int x = 0; x < a1.size(); x++) {
			String a2 = a1.get(x);
			String[] a3 = a2.split(" ");
			
			if (Integer.parseInt(a3[0]) > K * Integer.parseInt(a3[1])) {
				output = false;
			}
		}
		
		return output;
	}
	
}
