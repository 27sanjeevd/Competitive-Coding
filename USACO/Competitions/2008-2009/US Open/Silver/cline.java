import java.io.*;
import java.util.*;

public class cline {

	public static void main(String[] args) throws IOException {
		
		//BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		BufferedReader f = new BufferedReader(new FileReader("cline.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cline.out")));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		Deque<Integer> cows = new ArrayDeque();
		
		int counter1 = 1;
		
		for(int x = 0; x < N; x++) {
			st = new StringTokenizer(f.readLine());
			
			String temp = st.nextToken();
			String temp1 = st.nextToken();
			
			if (temp.equals("A")) {
				
				if (temp1.equals("L")) {
					cows.addLast(counter1);
					counter1++;
				}
				else {
					cows.addFirst(counter1);
					counter1++;
				}
				
			}
			else {
				
				int temp3 = Integer.parseInt(st.nextToken());
				
				if (temp1.equals("L")) {
					for(int y = 0; y < temp3; y++) {
						cows.pollLast();
					}
				}
				else {
					for(int y = 0; y < temp3; y++) {
						cows.pollFirst();
					}
				}
			}
		}
		
		Iterator val1 = cows.descendingIterator();
		
		while(val1.hasNext()) {
			out.println(val1.next());
		}
		
		out.close();
	}


	
}