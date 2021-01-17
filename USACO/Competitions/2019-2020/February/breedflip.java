import java.util.*;
import java.io.*;


public class breedflip {
	public static void main (String [] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new FileReader("breedflip.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("breedflip.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		String A = f.readLine();
		String B = f.readLine();
		
		/*
		int N = 7;
		String A = "GHHHGHH";
		String B = "HHGGGHH";
		*/
		ArrayList<String> A1 = new ArrayList<String>();
		ArrayList<String> B1 = new ArrayList<String>();
		for (int x = 0; x < N; x++) {
			A1.add(Character.toString(A.charAt(x)));
			B1.add(Character.toString(B.charAt(x)));
		}
		
		int counter = 0;
		boolean continue1 = true;
		int pos = 0;
		while (continue1 && pos < N) {
			if (!(A1.get(pos).equals(B1.get(pos)))){
				int temp = 0;
				for (int x = pos+1; x < N; x++) {
					if (!(A1.get(x).equals(B1.get(x)))) {
						temp = x;
					}
					else {
						break;
					}
				}
				counter += 1;
				for (int z = pos; z <= temp; z++) {
					if (B1.get(z).equals(Character.toString('H'))) {
						B1.set(z, Character.toString('G'));
					}
					else {
						B1.set(z, Character.toString('H'));
					}
				}
				
			
				
			}
			pos += 1;
			
		}
		
		out.println(counter);
		out.close();
		
	}
}
