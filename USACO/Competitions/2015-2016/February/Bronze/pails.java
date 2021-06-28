import java.io.*;
import java.util.*;

public class pails {

	public static void main(String[] args) throws IOException {

		BufferedReader f = new BufferedReader(new FileReader("pails.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("pails.out")));

		StringTokenizer st = new StringTokenizer(f.readLine());
	
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if (M % X == 0) {
			out.println(M);
		}
		else if (M % Y == 0) {
			out.println(M);
		}
		else {
			int max = 0;
			for(int a = 0; a * X <= M; a++) {
				
				int b = (M - a * X)/Y;
				max = Math.max(max, a * X + b * Y);
			}
			
			out.println(max);
		}
		
		out.close();
	}
}
