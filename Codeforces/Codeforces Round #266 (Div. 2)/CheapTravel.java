import java.io.*;
import java.util.*;

public class CheapTravel {

	public static void main(String[] args) throws IOException {

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int output = 0;
		
		if (M > N) {
			if (N * A <= B) {
				output = N * A;
			}
			else {
				output = B;
			}
		}
		else if (A * M <= B) {
			output = N * A;
		}
		else {
			int remainder = N % M;
			int divisor = N/M;
			
			if (B < remainder * A) {
				output = (divisor + 1) * B;
			}
			else {
				output = divisor * B + remainder * A;
			}
		}
		
		out.println(output);
		out.close();
	}
}
