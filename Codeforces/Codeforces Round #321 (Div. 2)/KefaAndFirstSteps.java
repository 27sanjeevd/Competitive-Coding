import java.io.*;
import java.util.*;

public class KefaAndFirstSteps {

	public static void main(String[] args) throws IOException {

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		int max = 1;
		st = new StringTokenizer(f.readLine());
		
		int start = Integer.parseInt(st.nextToken());
		int second = 0;
		
		int counter = 1;
		
		for(int x = 1; x < T; x++) {
			
			second = Integer.parseInt(st.nextToken());
			
			if (second >= start) {
				counter++;
			}
			else {
				counter = 1;
			}
			
			start = second;
			
			if (counter > max) {
				max = counter;
			}
		}
		
		
		out.println(max);
		out.close();
		
	}
}
