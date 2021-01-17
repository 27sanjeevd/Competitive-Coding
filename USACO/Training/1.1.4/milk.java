/*
ID: 27sanjeevd
LANG: JAVA
TASK: milk
*/
import java.io.*;
import java.util.*;

public class milk {

	public static void main(String[] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new FileReader("milk.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milk.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		
		ArrayList<Integer> price = new ArrayList<Integer>();
		ArrayList<Integer> amount = new ArrayList<Integer>();
		
		
		for(int x = 0; x < M; x++) {
			
			st = new StringTokenizer(f.readLine());
			
			price.add(Integer.parseInt(st.nextToken()));
			amount.add(Integer.parseInt(st.nextToken()));
			
		}
		
		
		/*
		price.add(5);
		price.add(9);
		price.add(3);
		price.add(8);
		price.add(6);
		
		amount.add(20);
		amount.add(40);
		amount.add(10);
		amount.add(80);
		amount.add(30);
		*/
		int cost = 0;
		
		while(N > 0) {
			
			int temp1 = 0;
			
			for(int x = 0; x < M; x++) {
				
				if (price.get(x) < price.get(temp1)) {
					temp1 = x;
				}
			}
			if (amount.get(temp1) < N) {
				cost += (price.get(temp1) * amount.get(temp1));
				N -= amount.get(temp1);
				price.remove(temp1);
				amount.remove(temp1);
				M -= 1;
				
			}
			else {
				cost += (price.get(temp1) * N);
				N = 0;
				price.remove(temp1);
				amount.remove(temp1);
				M -= 1;
				
			}
			
				
			
			
		}
		
		out.println(Integer.toString(cost));
		out.close();
		//System.out.println(cost);
	}	
		
}

