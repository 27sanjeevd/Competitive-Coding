import java.util.*;
import java.io.*;


public class triangles {
	public static void main (String [] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new FileReader("triangles.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("triangles.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int[][] xy = new int[N][2];
		for(int z = 0; z < N; z++) {
			st = new StringTokenizer(f.readLine());
			xy[z][0] = Integer.parseInt(st.nextToken());
			xy[z][1] = Integer.parseInt(st.nextToken());
		}
		
		/*
		int N = 4;
		int[][] xy = new int[N][2];
		xy[0][0] = 0;
		xy[1][0] = 0;
		xy[2][0] = 1;
		xy[3][0] = 1;
		xy[0][1] = 0;
		xy[1][1] = 1;
		xy[2][1] = 0;
		xy[3][1] = 2;
		*/
		int max = 0;
		for(int x = 0; x < N-1; x++) {
			for(int y = x + 1; y < N; y++) {
				if (xy[x][0] == xy[y][0]) {
					for(int z = 0; z < N; z++) {
						if (xy[z][0] != xy[y][0] && xy[z][1] != xy[y][0]) {
							if (xy[z][0] != xy[x][0] && xy[z][1] != xy[x][0]) {
							
								if (xy[z][1] == xy[x][1] || xy[z][1] == xy[y][1]) {
									
									int max1;
									int min1;
									int temp = 0;
									if (xy[x][0] == xy[y][0]) {
										temp = Math.abs(xy[x][0] - xy[z][0]);
									}
									else {
										temp = Math.abs(xy[x][0] - xy[y][0]);
									}
									if (xy[x][1] == xy[y][1]) {

										temp *= Math.abs(xy[x][1] - xy[z][1]);
									}
									else {
										temp *= Math.abs(xy[x][1] - xy[y][1]);
									}
									if (temp > max) {
										max = temp;
									}	
								}
							}
						}
					}
				}
			}
		}
		
		out.println(max);
		out.close();
		
		//System.out.println(max);
	}

}
