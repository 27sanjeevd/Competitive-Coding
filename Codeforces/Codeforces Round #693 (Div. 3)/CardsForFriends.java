import java.io.*;
import java.util.*;
import java.math.*;

public class CardsForFriends {

	public static void main(String[] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int x = 0; x < T; x++) {
			
			st = new StringTokenizer(f.readLine());
			
			int W = Integer.parseInt(st.nextToken());
			int H = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			if (Math.pow(2, findTwo(W)) * Math.pow(2, findTwo(H)) >= N) {
				out.println("YES");
			}
			else {
				out.println("NO");
			}
							
			
		}

		out.close();
	}
	
	public static int findTwo(int x) {
		
		int temp = 0;
		
		while (x % 2 == 0) {
			
			temp += 1;
			x /= 2;
			
			
		}
		
		return temp;
		
	}
}
