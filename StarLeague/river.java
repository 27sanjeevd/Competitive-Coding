/*
Strong autumn rains made the bridge over the river unusable. 
Farmer John's cows need to cross the river by jumping from a rock to another rock to go to the pasture. 
The length between the two banks of the river is L (1 <= L <= 1,000,000,000). 
Along the river between the starting and ending banks, there are N (0 <= N <= 50,000) rocks. 
Rocks are located on a line and each rock is at an integral distance Di  (0 < Di < L) from the starting bank.
FJ doesn't want some cumbersome cows to get involved in this dangerous river crossing event. 
To give them up, he plans to remove M (0 <= M <= N) rocks in order to increase the shortest distance a cow will have to jump to reach the other bank of the river.
FJ wants to know exactly how much he can increase the shortest distance. 
Help FJ determine the greatest possible shortest distance a cow has to jump after removing the optimal set of M rocks.
 */

import java.io.*;
import java.util.*;

public class river {

	public static void main(String[] args) throws IOException {

		//BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		BufferedReader f = new BufferedReader(new FileReader("river.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("river.out")));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int L = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		ArrayList<Rock> a1 = new ArrayList<Rock>();
		int[] rocks = new int[N + 2];

		rocks[0] = 0;
		rocks[1] = L;
		for(int x = 0; x < N; x++) {
			rocks[x + 2] = Integer.parseInt(f.readLine());
		}
		
		
		Arrays.sort(rocks);

		for(int x = 0; x < rocks.length - 1; x++) {
			a1.add(new Rock(rocks[x], rocks[x+1]));
		}

		
		
		Collections.sort(a1, new Sort1().reversed());
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int x = 0; x < M; x++) {
			//System.out.println(a1.get(x).rock1 + " " + a1.get(x).rock2);
			temp.add(a1.get(x).rock2);
		}
		
		for(int x = 0; x < a1.size(); x++) {
			//System.out.println(a1.get(x).rock1 + " " + a1.get(x).rock2);
		}
		
		ArrayList<Integer> b1 = new ArrayList<Integer>();
		for(int x = 0; x < a1.size(); x++) {
			if (!b1.contains(a1.get(x).rock1) && !temp.contains(a1.get(x).rock1)) {
				b1.add(a1.get(x).rock1);
			}
			if (!b1.contains(a1.get(x).rock2) && !temp.contains(a1.get(x).rock2)) {
				b1.add(a1.get(x).rock2);
			}
		}
		
		
		for(int x = 0; x < b1.size(); x++) {
			//System.out.println(b1.get(x));
		}
		
		int min = -1;
		Collections.sort(b1);
		for(int x = 0; x < b1.size() - 1; x++) {
			if (min == -1) {
				min = b1.get(x + 1) - b1.get(x);
			}
			else {
				min = Math.min(min, b1.get(x + 1) - b1.get(x));
			}
		}
		
		out.println(min);
		out.close();
	}
	
	
}

class Rock {
	
	int rock1, rock2, difference;
	
	public Rock(int rock1, int rock2) {
		this.rock1 = rock1;
		this.rock2 = rock2;
		this.difference = rock2 - rock1;
	}
}

class Sort1 implements Comparator<Rock> {

	public int compare(Rock a, Rock b) {
		
		return b.difference - a.difference;
	}
	
}