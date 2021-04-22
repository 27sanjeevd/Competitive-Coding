import java.io.*;
import java.util.*;

public class IQTest {

	public static void main(String[] args) throws IOException {

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		int[] a1 = {0, 0};
		int odd1 = -1;
		int even1 = -1;
		
		int counter = 0;
		
		st = new StringTokenizer(f.readLine());
		
		boolean check1 = true;
		
		while (check1 && counter < T) {
			
			if (odd1 != -1 && even1 != -1) {
				if ((a1[0] < 2 && a1[1] < 2)) {
					
					check1 = false;
				}
			}
			
			int temp = Integer.parseInt(st.nextToken());
			if (temp % 2 != 0) {
				a1[0]++;
				if (odd1 == -1) {
					odd1 = counter + 1;
				}
			}
			else if (temp % 2 == 0) {
				a1[1]++;
				if (even1 == -1) {
					even1 = counter + 1;
				}
			}
			
			counter++;
		}
		
		int output = 0;
		
		if (a1[0] < 2) {
			output = odd1;
		}
		else if (a1[1] < 2) {
			output = even1;
		}
		
		out.println(output);
		out.close();
		
	}
}
