import java.io.*;
import java.util.*;
import java.math.*;

public class StrangeList {

	public static void main(String[] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int a = 0; a < T; a++) {
			st = new StringTokenizer(f.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int X = Integer.parseInt(st.nextToken());
			
			ArrayList<String> a1 = new ArrayList<String>();

			st = new StringTokenizer(f.readLine());
			for(int b = 0; b < N; b++) {
				a1.add(st.nextToken() + " " + 1);
			}
			
			boolean check1 = true;
			int pos = 0;
			
			while(check1) {
				
				if (Integer.parseInt(a1.get(pos).split(" ")[0]) % X != 0) {
					check1 = false;
				}
				else if (pos >= a1.size()) {
					check1 = false;
				}
				else {
					a1.add(Integer.parseInt(a1.get(pos).split(" ")[0]) / X + " " + Integer.parseInt(a1.get(pos).split(" ")[1]) * X);
					
					pos++;
				}
			}
			
			int output = 0;
			
			for(int x = 0; x < a1.size(); x++) {
				String[] temp = a1.get(x).split(" ");
				output += Integer.parseInt(temp[0]) * Integer.parseInt(temp[1]);
			}
			
			out.println(output);
		}

		out.close();
	}
	
	
}
