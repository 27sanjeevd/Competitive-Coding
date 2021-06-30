import java.io.*;
import java.util.*;

public class baseball {

	public static void main(String[] args) throws IOException {
		
		//BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		BufferedReader f = new BufferedReader(new FileReader("baseball.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("baseball.out")));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		int[] a1 = new int[N];
		for(int x = 0; x < N; x++) {
			a1[x] = Integer.parseInt(f.readLine());
		}
		
		Arrays.sort(a1);
		
		int output = 0;
		
		for(int x = 0; x < N - 2; x++) {
			for(int y = x + 1; y < N - 1; y++) {
				int upper = binSearchLast(a1, a1[y] + 2 * (a1[y] - a1[x]));
				int lower = binSearchFirst(a1, a1[y] + (a1[y] - a1[x]));
				
				output += upper - lower + 1;
			}
		}
		
		out.println(output);
		out.close();
	}


    public static int binSearchLast(int[] a, int x) {
        if (a[0] > x) {
            return -1;
        }
        int l = 0;
        int r = a.length;
        while (l + 1 < r) {
            int m = (l + r) / 2;
            if (a[m] <= x) {
                l = m;
            } else {
                r = m;
            }
        }
        return l;
    }
    public static int binSearchFirst(int[] a, int x) {
        if (a[a.length - 1] < x) {
            return a.length;
        }
        int l = -1;
        int r = a.length - 1;
        while (l + 1 < r) {
            int m = (l + r) / 2;
            if (a[m] < x) {
                l = m;
            } else {
                r = m;
            }
        }
        return r;
    }
	
}