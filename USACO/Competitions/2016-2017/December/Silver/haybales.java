import java.io.*;
import java.util.*;

public class haybales {

	public static void main(String[] args) throws IOException {
		
		//BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		BufferedReader f = new BufferedReader(new FileReader("haybales.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("haybales.out")));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		
		int[] a1 = new int[N];
		
		st = new StringTokenizer(f.readLine());
		
		for(int x = 0; x < N; x++) {
			a1[x] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(a1);
		
		for(int x = 0; x < Q; x++) {
			st = new StringTokenizer(f.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			out.println(binSearchLast(a1, B) - binSearchFirst(a1, A) + 1);
			
		}
		
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