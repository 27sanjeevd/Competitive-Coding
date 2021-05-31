import java.io.*;
import java.util.*;

public class Pashmak {

	public static void main(String[] args) throws IOException {

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int[] a1 = new int[2];
		int[] b1 = new int[2];
		
		for(int x = 0; x < 4; x++) {
			if (x < 2) {
				a1[x] = Integer.parseInt(st.nextToken());
			}
			else {
				b1[x-2] = Integer.parseInt(st.nextToken());
			}
		}
		
		if (a1[0] == b1[0]) {
			
			int temp = Math.abs(a1[1] - b1[1]);
			
			out.println(Integer.toString(a1[0] + temp) + " " + Integer.toString(a1[1]) + " " + Integer.toString(b1[0] + temp) + " " + Integer.toString(b1[1]));
			
		}
		else if (a1[1] == b1[1]) {
			
			int temp = Math.abs(a1[0] - b1[0]);
			
			out.println(Integer.toString(a1[0]) + " " + Integer.toString(a1[1] + temp) + " " + Integer.toString(b1[0]) + " " + Integer.toString(b1[1] + temp));
			
		}
		else {
			if (Math.abs(a1[0] - b1[0]) != Math.abs(a1[1] - b1[1])) {
				out.println("-1");
			}
			else {
				out.println(Integer.toString(a1[0]) + " " + Integer.toString(b1[1]) + " " + Integer.toString(b1[0]) + " " + Integer.toString(a1[1]));
			
			}
		}
		
		out.close();
	}
}
