import java.io.*;
import java.util.*;

public class Expression {

	public static void main(String[] args) throws IOException {

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		int[] a1 = new int[3];
		
		for(int x = 0; x < 3; x++) {
			a1[x] = Integer.parseInt(f.readLine());
		}
		
		int a = (a1[0] + a1[1]) * a1[2];
		int b = (a1[0] * a1[1]) * a1[2];
		int c = (a1[0] + a1[1]) + a1[2];
		int d = (a1[0] * a1[1]) + a1[2];
		
		int e = a1[0] + (a1[1] * a1[2]);
		int f1 = a1[0] * (a1[1] * a1[2]);
		int g = a1[0] + (a1[1] + a1[2]);
		int h = a1[0] * (a1[1] + a1[2]);
		
		int output = Math.max(Math.max(Math.max(a, b), Math.max(c, d)), Math.max(Math.max(e, f1), Math.max(g, h)));
		
		out.println(output);
		out.close();
		
	}
}
