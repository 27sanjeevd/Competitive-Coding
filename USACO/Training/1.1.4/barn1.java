/*
ID: 27sanjeevd
LANG: JAVA
TASK: barn1
*/
import java.io.*;
import java.util.*;

class Space implements Comparable<Space>{
	int start, end;
	
	Space(int start1, int end1){
		start = start1;
		end = end1;
	}
	
	public int compareTo(Space v) {
		return this.getSize() - v.getSize();		
	}
	
	public int getSize() {
		return end - start - 1;
		
	}
	
}

public class barn1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new FileReader("barn1.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("barn1.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		
		Space g;
		
		int M = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int[] num = new int[C];
		
		for(int x = 0; x < C; x++) {
			
			num[x] = Integer.parseInt(f.readLine());
			
		}
		
		ArrayList<Space> spaces = new ArrayList<Space>();
		
		int board = C;
		int covered = C;
		
		Arrays.sort(num);
		
		for(int x = 0; x < C-1 ; x++) {
			
			if (num[x+1] - num[x] > 1) {
				spaces.add(new Space(num[x], num[x+1]));
			}
			
		}
		
		Collections.sort(spaces);
		
		board = spaces.size() + 1;
		
		while (board > M) {
			
			g = spaces.remove(0);

			covered += g.getSize();
			
			board--;
			
		}
		
		out.println(covered);
		out.close();
	}	
		
}

