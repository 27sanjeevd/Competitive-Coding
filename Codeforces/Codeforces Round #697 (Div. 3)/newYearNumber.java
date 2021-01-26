import java.io.*;
import java.util.*;
import java.math.*;
 
public class oddDivisor {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
 
		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int x = 0; x < T; x++) {
			
			String V = f.readLine();
			int N = Integer.parseInt(V);
			
			char temp1 = V.charAt(V.length() - 1);		
			
			N -= 2021 * Character.getNumericValue(temp1);
			boolean check1 = true;
			
			while (N >= 0 && check1) {
				if (N % 2020 == 0) {
					check1 = false;
				}
				else {
					N -= 2021 * 10;
				}
			}
			
			if (check1) {
				out.println("NO");
			}
			else {
				out.println("YES");
			}
			
						
		}
 
		out.close();
	}
	
	
	
}
