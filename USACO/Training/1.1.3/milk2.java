/*
ID: 27sanjeevd
LANG: JAVA
TASK: milk2
*/
import java.io.*;
import java.util.*;

public class milk2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new FileReader("milk2.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milk2.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		//int N = 3;
		int[][] time = new int[N][2];
		
		for(int x = 0; x < N; x++) {

			st = new StringTokenizer(f.readLine());
			
			int start1 = Integer.parseInt(st.nextToken());
			int end1 = Integer.parseInt(st.nextToken());
			
			int[] period = {start1, end1};
			time[x] = period;
		}
		
		Arrays.sort(time, (a, b) -> Double.compare(a[0], b[0]));
		
		//System.out.println(maxMilked(time));
		//System.out.println(maxNoMilked(time));
		
		String output = Integer.toString(maxMilked(time)) + " " + Integer.toString(maxNoMilked(time));
		
		out.println(output);
		out.close();
		
	}
	
	public static int maxMilked(int[][] time) {
		
		
		int head = time[0][0];
		int tail = time[0][1];

		int max = tail- head;
		
		for(int x = 1; x < time.length; x++) {
			if (tail >= time[x][0]) {
				tail = tail < time[x][1] ? time[x][1] : tail;
				
			}
			else {
				if (max == 0) {
					max = tail - head;
				}
				else {
					max = tail - head > max ? tail - head : max;
					head = time[x][0];
					tail = time[x][1];
				}
			}
		}
		
		max = tail - head > max ? tail - head : max;
		
		return max;
		
	}
	
	public static int maxNoMilked(int[][] time) {
		
		int max = 0;
		
		int head = time[0][0];
		int tail = time[0][1];
		
		for(int x = 1; x < time.length; x++) {
			
			if (tail < time[x][0]) {
				max = time[x][0] - tail > max ? time[x][0] - tail : max;
			}
			tail = time[x][1] > tail ? time[x][1] : tail;
		}
		
		return max;
		
	}
}


