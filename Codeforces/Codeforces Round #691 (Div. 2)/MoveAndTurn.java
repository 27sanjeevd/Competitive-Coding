import java.io.*;
import java.util.*;

public class MoveAndTurn {

	public static void main(String[] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		if (N % 2 == 0) {
			out.println((int) Math.pow((N/2 + 1), 2));
		}
		else {
			int X = N/2 + 1;
			out.println(2 * X * (X + 1));
		}
		
		out.close();
		
	}
	
	
}
