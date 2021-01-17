import java.io.*;
import java.util.*;
import java.math.*;

public class LastMinuteEnhancements {

	public static void main(String[] args) throws IOException {

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int x = 0; x < T; x++) {
			
			int N = Integer.parseInt(f.readLine());
			
			int[] V = new int[N];
			
			st = new StringTokenizer(f.readLine());

			ArrayList<Integer> nums1 = new ArrayList<Integer>();
			
			int temp = 0;
			int temp1 = 0;
			int counter1 = 0;
			
			for(int y = 0; y < N; y++) {
				
				V[y] = Integer.parseInt(st.nextToken());
				
				if (V[y] != temp && V[y] != temp1) {
					nums1.add(V[y]);
					counter1 = 1;
					
					temp1 = 0;
				}
				else {
					
					if (V[y] == temp1) {
						counter1 = 1;
					}
					counter1++;
					
					if (counter1 < 3) {
						nums1.add(V[y]+1);
						temp1 = V[y] + 1;
					}
				}
				
				temp = V[y];
				
				
				
			}
			out.println(nums1.size());
			
			
			
		}
		
		
		out.close();
	}
	
	
}
