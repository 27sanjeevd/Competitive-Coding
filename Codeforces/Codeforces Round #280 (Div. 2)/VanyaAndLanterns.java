import java.io.*;
import java.util.*;

public class VanyaAndLanterns {

	public static void main(String[] args) throws IOException {

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		for(int x = 0; x < N; x++) {
			
			a1.add(Integer.parseInt(st.nextToken()));
			
		}
		
		Collections.sort(a1);
		
		a1.add(0 - a1.get(0));
		a1.add(L + (L - a1.get(a1.size() - 2)));

		Collections.sort(a1);
		double max = 0;
		
		if (a1.size() > 1) {
			
			for(int y = 1; y < a1.size(); y++) {
				//System.out.println(a1.get(y) + " " + a1.get(y-1));
				if (((double) (a1.get(y)-a1.get(y-1)))/2 > max) {
					max = ((double) (a1.get(y)-a1.get(y-1)))/2;
				}
			}
			
			out.println(max);
		}
		
		else {
			out.println(0);
		}
		
		out.close();
	}
}
