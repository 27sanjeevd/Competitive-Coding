import java.util.*;
import java.io.*;


public class swap {
	public static void main (String [] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new FileReader("swap.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("swap.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(f.readLine());
		int A1 = Integer.parseInt(st.nextToken());
		int A2 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(f.readLine());
		int B1 = Integer.parseInt(st.nextToken());
		int B2 = Integer.parseInt(st.nextToken());
		
		/*
		int N = 7;
		int K = 2;
		int A1 = 2;
		int A2 = 5;
		int B1 = 3;
		int B2 = 7;
		*/
		int[] cows = new int[N];
		for(int x = 1; x < N+1; x++) {
			cows[x-1] = x;
		}
		for (int x = 0; x < K; x++) {
			int max = 0;
			int min = 0;
			if (A1 > A2) {
				max = A1;
				min = A2;
			}
			else {
				max = A2;
				min = A1;
			}
			for(int y = 0; y < (max-min)/2+1; y++) {
				int temp = cows[min-1 + y];
				cows[min-1+y] = cows[max-1-y];
				cows[max-1-y] = temp;
			}

			max = 0;
			min = 0;
			if (B1 > B2) {
				max = B1;
				min = B2;
			}
			else {
				max = B2;
				min = B1;
			}

			for(int y = 0; y < (max-min)/2+1; y++) {
				int temp = cows[min-1 + y];
				cows[min-1+y] = cows[max-1-y];
				cows[max-1-y] = temp;
			}
			
		}
		
		for (int x = 0; x < N; x++) {
			out.println(cows[x]);
		}
		out.close();
		
	} 
	/*
	public static void displayInt(int[] a1) {
		for(int x = 0; x < a1.length; x++) {
			System.out.println(a1[x]);
		}
	}
	*/
	
}