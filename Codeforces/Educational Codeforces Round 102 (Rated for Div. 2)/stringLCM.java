import java.io.*;
import java.util.*;
import java.math.*;

public class stringLCM {

	public static void main(String[] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int a = 0; a < T; a++) {
			
			String a1 = f.readLine();
			String a2 = f.readLine();
			
			String a3 = "";
			if (a1.length() < a2.length()) {
				a3 = a1;
				a1 = a2;
				a2 = a3;
			}
			
			boolean output = true;
			
			if (!a1.substring(0, a2.length()).equals(a2)){
				output = false;
			}
			else {
				int x1 = 0;
				x1 = a1.length() - a2.length();
				
				if (!a1.substring(0, a2.length() - x1).equals(a2.substring(x1, a2.length()))){
					output = false;
				}
				
			}
			
			if (!output) {
				out.println(-1);
			}
			else {
				int x1 = 0;
				x1 = a1.length() - a2.length();
				int z = 0;
				
				if (a1.length() % x1 != 0) {
					z = a1.length();
				}
				else {
					z = a1.length() / x1;
				}
				
				String output2 = "";
				for(int x = 0; x < z; x++) {
					output2 += a2;
				}
				
				out.println(output2);
			}
			
		}

		out.close();
	}
	
	
	
}
