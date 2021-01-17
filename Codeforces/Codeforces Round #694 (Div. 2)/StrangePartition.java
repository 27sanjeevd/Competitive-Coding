import java.io.*;
import java.util.*;
import java.math.*;

public class StrangePartition {

	public static void main(String[] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int a = 0; a < T; a++) {
			st = new StringTokenizer(f.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int X = Integer.parseInt(st.nextToken());
			
			ArrayList<Integer> a1 = new ArrayList<Integer>();
			ArrayList<Integer> a2 = new ArrayList<Integer>();

			st = new StringTokenizer(f.readLine());
			for(int x = 0; x < N; x++) {
				int temp = Integer.parseInt(st.nextToken());
				a1.add(temp);
				a2.add(temp);
			}
			
			boolean check1 = true;
			
			while (check1) {
				check1 = beauty(a1, X);
			}
			
			String output = "";
			
			int minCount = 0;
			int maxCount = 0;
			
			for(int d = 0; d < a1.size(); d++) {
				
				if (a1.get(d) % X == 0) {
					minCount += a1.get(d) / X;
				}
				else {
					minCount += Math.floor(a1.get(d) / X) + 1;
				}
			}
			for(int d = 0; d < a2.size(); d++) {
				if (a2.get(d) % X == 0) {
					maxCount += a2.get(d) / X;
				}
				else {
					maxCount += Math.floor(a2.get(d) / X) + 1;
				}
				
			}
			
			out.println(Integer.toString(minCount) + " " + Integer.toString(maxCount));
			
			
			
		}

		out.close();
	}
	
	public static boolean beauty(ArrayList<Integer> a1, int x) {
		boolean check1 = false;
		
		for(int y = 0; y < a1.size() - 1; y++) {
			
			int temp1 = 0;
			int temp2 = 0;
			int temp3 = 0;
			
			if (a1.get(y) % x != 0) {
				temp1 = 1;
			}
			if (a1.get(y+1) % x != 0) {
				temp2 = 1;
			}
			if ((a1.get(y) + a1.get(y+1)) % x != 0) {
				temp3 = 1;
			}
			
			if (temp1 + temp2 > temp3) {
				int z = a1.get(y) + a1.get(y+1);
				a1.remove(y);
				a1.remove(y);
				a1.add(y, z);
				
				check1 = true;
				
				break;
			}
			
		}
		
		
		return check1;
	}
	
}
