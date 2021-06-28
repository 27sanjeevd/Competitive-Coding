import java.io.*;
import java.util.*;

public class speeding {

	public static void main(String[] args) throws IOException {

		BufferedReader f = new BufferedReader(new FileReader("speeding.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("speeding.out")));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] a1 = new int[100];
		int[] b1 = new int[100];
		
		int temp = 0;
		for(int x = 0; x < N; x++) {
			st = new StringTokenizer(f.readLine());
			
			int v = Integer.parseInt(st.nextToken());
			int speed = Integer.parseInt(st.nextToken());;
			
			v = v + temp;
			while (temp < v) {
				a1[temp] = speed;
				temp++;
			}
		}

		temp = 0;
		for(int x = 0; x < M; x++) {
			st = new StringTokenizer(f.readLine());
			
			int v = Integer.parseInt(st.nextToken());
			int speed = Integer.parseInt(st.nextToken());;
			
			v = v + temp;
			while (temp < v) {
				b1[temp] = speed;
				temp++;
			}
		}
		
		int max = 0;
		for(int x = 0; x < 100; x++) {
			max = Math.max(max, b1[x]-a1[x]);
		}
		
		out.println(max);
		out.close();
	}
	
}