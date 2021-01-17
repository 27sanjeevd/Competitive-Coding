import java.io.*;
import java.util.*;
import java.math.*;

public class WizardOfOrz {

	public static void main(String[] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int a = 0; a < T; a++) {
			
			int N = Integer.parseInt(f.readLine());
			
			int num = 8;
			String output = "";
			out.print("9");
			for(int x = 1; x < N; x++) {
				out.print(num);
				num++;
				if (num == 10) {
					num = 0;
				}
			}
			out.print('\n');
			
		}

		out.close();
	}
	
	
}
