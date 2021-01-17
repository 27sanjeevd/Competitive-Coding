import java.io.*;
import java.util.*;

public class blist {
	public static void main(String [] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new FileReader("blist.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("blist.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		
		
		//int N = 3;
		/*
		int[][] cows = {
				
				{4, 10, 1},
				{8, 13, 3},
				{2, 6, 2}
		};
		*/
		
		int N = Integer.parseInt(st.nextToken());
		
		int[][] cows = new int[N][3];
		
		for(int x = 0; x < N; x++) {
			st = new StringTokenizer(f.readLine());
			for(int y = 0; y < 3; y++) {
				cows[x][y] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		Arrays.sort(cows, (a, b) -> Double.compare(a[0], b[0]));
		
		int available = 0;
		int total = 0;
		
		for(int x = cows[0][0]; x < cows[N-1][1] + 1; x++) {
			
			for(int y = 0; y < N; y++) {
				if (cows[y][0] == x) {
					if (cows[y][2] > available) {
						int temp = cows[y][2] - available;
						available = 0;
						total += temp;
					}
					else {
						available -= cows[y][2];
					}
				}
				else if (cows[y][1] == x) {
					available += cows[y][2];
				}
			}
			
		}
		
		out.println(total);
		out.close();
		
	}

	
}