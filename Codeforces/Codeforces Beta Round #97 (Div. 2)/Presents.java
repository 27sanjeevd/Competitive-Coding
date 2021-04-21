import java.io.*;
import java.util.*;

public class Presents {

	public static void main(String[] args) throws IOException {

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		int[] a1 = new int[T];
		
		st = new StringTokenizer(f.readLine());
		
		for (int x = 0; x < T; x++) {
			a1[Integer.parseInt(st.nextToken()) - 1] = x + 1;
		}
		
		String output = Integer.toString(a1[0]);
		
		for(int x = 1; x < a1.length; x++) {
			
			output += " " + Integer.toString(a1[x]);
			
		}
		out.println(output);
		out.close();
		
	}
}
