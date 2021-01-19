import java.io.*;
import java.util.*;
import java.math.*;

public class DifferentDivisors {

	public static void main(String[] args) throws IOException {

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int x = 0; x < T; x++) {
			
			int d = Integer.parseInt(f.readLine());
			
			boolean check1 = false;
			int y = 1 + d;

			while (!check1) {
				if (checkPrime(y)) {
					check1 = true;
				}
				else {
					if (y % 2 == 0) {
						y++;
					}
					else {
						y += 2;
					}
				}
			}
			
			check1 = false;
			int z = y + d;
			while (!check1) {
				if (checkNum(z, y, d)) {
					check1 = true;
				}
				else {
					if (z % 2 == 0) {
						z++;
					}
					else {
						z += 2;
					}
				}
			}
			out.println(y * z);
			
						
		}

		out.close();
	}
	
	public static boolean checkPrime(int x) {
		boolean output = true;
		
		for(int y = 2; y < x; y++) {
			if (x % y == 0) {
				output = false;
			}
		}
		
		return output;
	}
	
	
	public static boolean checkNum(int x, int z, int d) {
		boolean output = true;
		int previous = 0;
		
		
		for(int y = 2; y < x; y++) {
			if (x % y == 0) {
				if (Math.abs(y - previous) < d && Math.abs(y - z) < d) {
					output = false;
				}
			}
		}
		
		return output;
	}
}
