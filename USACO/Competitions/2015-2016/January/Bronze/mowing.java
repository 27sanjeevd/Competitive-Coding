import java.io.*;
import java.util.*;

public class mowing {

	public static void main(String[] args) throws IOException {

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		//BufferedReader f = new BufferedReader(new FileReader("mowing.in"));
		//PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("mowing.out")));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		int[][] a1 = new int[2000][2000];
		
		int max = 1001;
		int time = 1;
		int xPos = 1000;
		int yPos = 1000;
		
		a1[xPos][yPos] = time;
		
		for(int x = 0; x < N; x++) {
			st = new StringTokenizer(f.readLine());
			String direction = st.nextToken();
			int amt = Integer.parseInt(st.nextToken());
			
			int xChange = 0;
			int yChange = 0;

			if (direction.equals("N")) {
				xChange = -1;
			}
			if (direction.equals("S")) {
				xChange = 1;
			}
			if (direction.equals("E")) {
				yChange = 1;
			}
			if (direction.equals("W")) {
				yChange = -1;
			}
			
			for(int y = 0; y < amt; y++) {
				xPos += xChange;
				yPos += yChange;
				time++;
				if (a1[xPos][yPos] >= 0 && time - a1[xPos][yPos] < max) {
					max = time - a1[xPos][yPos];
				}
				a1[xPos][yPos] = time;
			}
			/*
			if (direction.equals("N")) {
				for(int y = 0; y < amt; y++) {
					yPos--;
					time++;
					if (a1[xPos][yPos] != 0) {
						max = Math.max(max, time - a1[xPos][yPos]);
					}
					a1[xPos][yPos] = time;
				}
			}
			if (direction.equals("E")) {
				for(int y = 0; y < amt; y++) {
					xPos++;
					time++;
					if (a1[xPos][yPos] != 0) {
						max = Math.max(max, time - a1[xPos][yPos]);
					}
					a1[xPos][yPos] = time;
				}
			}
			if (direction.equals("S")) {
				for(int y = 0; y < amt; y++) {
					yPos++;
					time++;
					if (a1[xPos][yPos] != 0) {
						max = Math.max(max, time - a1[xPos][yPos]);
					}
					a1[xPos][yPos] = time;
				}
			}
			if (direction.equals("W")) {
				for(int y = 0; y < amt; y++) {
					xPos--;
					time++;
					if (a1[xPos][yPos] != 0) {
						max = Math.max(max, time - a1[xPos][yPos]);
					}
					a1[xPos][yPos] = time;
				}
			}
			*/
			
		}
		
		out.println(max);
		out.close();
	}
	
}