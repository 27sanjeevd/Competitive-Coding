import java.io.*;
import java.util.*;

public class redAndBlue {

	public static void main(String[] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int t = Integer.parseInt(st.nextToken());
		
		for(int x = 0; x < t; x++) {
			
			int N = Integer.parseInt(f.readLine());
			
			ArrayList<Integer> r = new ArrayList<Integer>();
			
			st = new StringTokenizer(f.readLine());
			for(int y = 0; y < N; y++) {
				r.add(Integer.parseInt(st.nextToken()));
			}
			
			int M = Integer.parseInt(f.readLine());
			
			ArrayList<Integer> b = new ArrayList<Integer>();
			
			st = new StringTokenizer(f.readLine());
			for(int y = 0; y < M; y++) {
				b.add(Integer.parseInt(st.nextToken()));
			}
			
			int[] nums = new int[N+M];
			
			for(int y = 0; y < nums.length; y++) {
				if (r.size() != 0 && b.size() != 0) {
					
					if (r.get(0) > b.get(0)) {
						if (function2(b) > function2(r)) {
							nums[y] = b.remove(0);
						}
						else {
							nums[y] = r.remove(0);
						}
					}
					else {
						if (function2(r) > function2(b)) {
							nums[y] = r.remove(0);
						}
						else {
							nums[y] = b.remove(0);
						}
					}
				}
				else {
					
					if (r.size() == 0) {
						nums[y] = b.remove(0);
					}
					else {
						nums[y] = r.remove(0);
					}
				}
				
			}
			
			out.println(function1(nums));
		}
		
		out.close();
		
	}

	public static int function2(ArrayList<Integer> a1) {
		int output = 0;
		int sum = 0;
		
		for(int x = 0; x < a1.size(); x++) {
			
			sum += a1.get(x);
			output = Math.max(output, sum);
			
		}
		
		return output;
	}
	
	public static int function1(int[] a1) {
		int output = 0;
		int sum = 0;
		
		for(int x = 0; x < a1.length; x++) {
			
			sum += a1[x];
			output = Math.max(output, sum);
			
		}
		
		return output;
	}
}
