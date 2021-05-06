import java.io.*;
import java.util.*;

public class CutRibbon {

	public static void main(String[] args) throws IOException {

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		for(int x = 0; x < 3; x++) {
			a1.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(a1);
		
		int temp = N % a1.get(0);
		int counter = N / a1.get(0);
		
		int max = 0;
		
		if (temp == 0) {
			max = counter;
		}
		else {
			for(int x = counter; x >= 0; x--) {
				for(int y = 0; y <= counter; y++) {
					int z = (N - (x * a1.get(0) + y * a1.get(1))) / a1.get(2);
					if (z >= 0) {
						if (a1.get(0) * x + a1.get(1) * y + a1.get(2) * z == N) {
							max = Math.max(max, x+y+z);
						}
					}
				}
			}
		}
		
		out.println(max);
		out.close();
	}
}
