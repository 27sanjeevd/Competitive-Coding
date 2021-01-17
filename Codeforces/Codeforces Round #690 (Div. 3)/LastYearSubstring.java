import java.io.*;
import java.util.*;
import java.math.*;

public class LastYearSubstring {

	public static void main(String[] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		String a2 = "2020";
		
		for(int x = 0; x < T; x++) {
			
			int N = Integer.parseInt(f.readLine());
			
			String a1 = f.readLine();
			
			boolean check1 = false;
			
			for(int i = 0; i <= 4; i++) {
				String pt1 = a1.substring(0, i);
				String pt2 = a1.substring(N-4+i, N);
				
				String pt3 = pt1 + pt2;
				
				if (pt3.equals(a2)) {
					check1 = true;
				}
			}
			
			if (check1) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
							
			
		}

		out.close();
	}
	
	
}
