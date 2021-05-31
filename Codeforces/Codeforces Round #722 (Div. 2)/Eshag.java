import java.io.*;
import java.util.*;

public class Eshag {

	public static void main(String[] args) throws IOException {

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int x = 0; x < T; x++) {
			
			int N = Integer.parseInt(f.readLine());
			st = new StringTokenizer(f.readLine());

			ArrayList<Integer> a1 = new ArrayList<Integer>();
			
			for(int y = 0; y < N; y++) {
				a1.add(Integer.parseInt(st.nextToken()));
			}
			
			Collections.sort(a1);
			
			int initial = a1.get(0);
			int counter = 1;
			
			for(int y = 1; y < N; y++) {
				
				if (a1.get(y) == initial) {
					counter++;
				}
				else {
					break;
				}
				
			}
			
			out.println(N - counter);
		}
		
		out.close();
	}
}
