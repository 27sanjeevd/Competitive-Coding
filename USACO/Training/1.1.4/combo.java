/*
ID: 27sanjeevd
LANG: JAVA
TASK: combo
*/
import java.io.*;
import java.util.*;

public class combo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new FileReader("combo.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("combo.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		StringTokenizer st1 = new StringTokenizer(f.readLine());
		
		int[] farmer = new int[3];
		int[] master = new int[3];
		
		for(int x = 0; x < 3; x++) {
			
			farmer[x] = Integer.parseInt(st.nextToken());
			master[x] = Integer.parseInt(st1.nextToken());
			
		}
		
		int amount = 0;
		if (N < 5) {
			
			amount = N * N * N;
			
		}
		else {
			
			amount = 5 * 5 * 5 * 2;
			
			int overlaps=1;
            for (int i=0;i<3;i++) {
            	
                int diff = Math.abs((((farmer[i]+2) % N)-(master[i]+2) % N)); 
                
                if (diff > 4) {
                    overlaps = 0;
                    break;
                    
                } else {	
                    overlaps = overlaps * (5-diff);
                }
            }
            amount -= overlaps;
		}
		
		
		out.println(amount);
		out.close();
		
	}
}
