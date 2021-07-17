import java.io.*;
import java.util.*;

public class stringe {

	public static void main(String[] args) throws IOException {
		
		//BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		BufferedReader f = new BufferedReader(new FileReader("stringe.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("stringe.out")));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		for(int x = 0; x < N; x++) {
			st = new StringTokenizer(f.readLine());
			
			int Z = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
			
			String output = st.nextToken();
			for(int y = 0; y < V; y++) {
				output = recurv(output, Z);
			}
			
			out.println(output);
		
		}
		
		
		out.close();
	}

	
	public static String recurv(String a1, int n) {
		
		return a1.substring(n, a1.length()) + a1;
	}
}