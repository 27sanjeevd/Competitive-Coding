import java.io.*;
import java.util.*;

public class mixmilk {
	public static void main(String [] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new FileReader("mixmilk.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("mixmilk.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int a1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		int b = Integer.parseInt(st.nextToken());
		int b1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		int c = Integer.parseInt(st.nextToken());
		int c1 = Integer.parseInt(st.nextToken());
		int[] temp = new int[4];
		for(int x = 0; x < 33; x++) {
			
			temp = pour(a, a1, b, b1);
			a = temp[0];
			a1 = temp[1];
			b = temp[2];
			b1 = temp[3];
			temp = pour(b, b1, c, c1);
			b = temp[0];
			b1 = temp[1];
			c = temp[2];
			c1 = temp[3];
			temp = pour(c, c1, a, a1);
			c = temp[0];
			c1 = temp[1];
			a = temp[2];
			a1 = temp[3];
			
		}
				
		temp = pour(a, a1, b, b1);
		a = temp[0];
		a1 = temp[1];
		b = temp[2];
		b1 = temp[3];
		
		out.println(a1);
		out.println(b1);
		out.println(c1);
		
		out.close();
		
	}
	
	public static int[] pour(int x, int x1, int y, int y1) {
		
		int temp = Math.min(x1, y - y1);
	
		x1 -= temp;
		y1 += temp;
		
		int[] temp1 = {x, x1, y, y1};
		
		return temp1;
		
	}

}