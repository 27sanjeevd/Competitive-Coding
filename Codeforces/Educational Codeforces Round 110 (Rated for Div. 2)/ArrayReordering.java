import java.io.*;
import java.util.*;
import java.math.*;

public class ArrayReordering {

	public static void main(String[] args) throws IOException {

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for(int x = 0; x < T; x++) {
			
			int N = Integer.parseInt(f.readLine());
			
			st = new StringTokenizer(f.readLine());
			
			int[] a1 = new int[N];
			
			for(int y = 0; y < N; y++) {
				a1[y] = Integer.parseInt(st.nextToken());
			}
			
			ArrayList<Integer> b1 = new ArrayList<Integer>();
			
			for(int y = 0; y < N; y++) {
				if (a1[y] % 2 == 0) {
					
					b1.add(0, a1[y]);
				}
				else {
					if (b1.size() == 0) {
						b1.add(a1[y]);
					}
					else {
						b1.add(b1.size() - 1, a1[y]);
					}
				}
			}
			/*
			String v = "";
			for(int y = 0; y < b1.size(); y++) {
				v += Integer.toString(b1.get(y)) + " ";
			}
			
			System.out.println(v);
			*/
			int counter1 = 0;
			
			for(int a = 0; a < b1.size() - 1; a++) {
				for(int b = a + 1; b < b1.size(); b++) {
					//System.out.println(gcd1(b1.get(a), 2 * b1.get(b)) + " " + b1.get(a) + " " + b1.get(b));
					if (gcd1(b1.get(a), 2 * b1.get(b)) > 1) {
						
						counter1++;
					}
				}
			}
			
			out.println(counter1);
			//System.out.println("**********************");
		}
		
		out.close();
	}
	

	public static int gcd1(int a, int b) {
		
	    BigInteger b1 = BigInteger.valueOf(a);
	    BigInteger b2 = BigInteger.valueOf(b);
	    
	    BigInteger gcd = b1.gcd(b2);
	    
	    return gcd.intValue();
	}
}
