import java.io.*;
import java.util.*;

public class redBlueShuffle {

	public static void main(String[] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int x = 0; x < T; x++) {
			
			int N = Integer.parseInt(f.readLine());
			
			String[] r = f.readLine().split("");
			String[] b = f.readLine().split("");
			
			int rCounter = 0;
			int bCounter = 0;
			
			for(int y = 0; y < N; y++) {
				if (Integer.parseInt(r[y]) > Integer.parseInt(b[y])) {
					rCounter++;
				}
				else if (Integer.parseInt(b[y]) > Integer.parseInt(r[y])) {
					bCounter++;
				}
			}
			
			if (bCounter > rCounter) {
				out.println("BLUE");
			}
			else if (rCounter > bCounter) {
				out.println("RED");
			}
			else {
				out.println("EQUAL");
			}
			
		}
		
		out.close();
		
	}
	
	
}
