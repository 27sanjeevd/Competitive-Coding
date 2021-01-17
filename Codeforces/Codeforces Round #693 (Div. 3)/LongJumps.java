import java.io.*;
import java.util.*;
import java.math.*;

public class LongJumps {

	public static void main(String[] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int x = 0; x < T; x++) {
			
			int N = Integer.parseInt(f.readLine());
					
			st = new StringTokenizer(f.readLine());
			
			int[] a1 = new int[N];
			int[] b1 = new int[N];
			
			for(int y = 0; y < N; y++) {
				
				a1[y] = Integer.parseInt(st.nextToken());
				b1[y] = 0;
			}
			
			for(int y = N-1; y >= 0; y--) {
				b1[y] = sort1(a1, b1, y);
			}
			Arrays.sort(b1);
			out.println(b1[N-1]);
			
		}

		out.close();
	}
	
	public static int sort1(int[] a1, int[] b1, int b) {
		
		int sum = 0;
		int pos = b;
		
		sum += a1[pos];
		pos += a1[pos];
		
		if (pos < a1.length) {
			sum += b1[pos];
		}
		
		//System.out.println(sum);
		return sum;
	}
	
}
