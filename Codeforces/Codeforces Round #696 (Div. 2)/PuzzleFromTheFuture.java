import java.io.*;
import java.util.*;
import java.math.*;

public class PuzzleFromTheFuture {

	public static void main(String[] args) throws IOException {

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int x = 0; x < T; x++) {
			
			int N = Integer.parseInt(f.readLine());
			
			String b = f.readLine();
			
			String output = "";
			int previous = 0;
			
			previous = Character.getNumericValue(b.charAt(0)) + 1;
			output += "1";
			for(int y = 1; y < N; y++) {

				if (previous == 2) {
					if (Character.getNumericValue(b.charAt(y)) == 0) {
						output += "1";
						previous = 1;
					}
					else {
						output += "0";
						previous = 1;
					}
				}
				else if (previous == 1) {
					if (Character.getNumericValue(b.charAt(y)) == 0) {
						output += "0";
						previous = 0;
					}
					else {
						output += "1";
						previous = 2;
					}
					
					
				}
				else {
					if (Character.getNumericValue(b.charAt(y)) == 0) {
						output += "1";
						previous = 1;
					}
					else {
						output += "1";
						previous = 2;
					}
				}
			}
			
			out.println(output);
						
		}

		out.close();
	}
	
	
}
