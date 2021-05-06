import java.io.*;
import java.util.*;

public class Registration {

	public static void main(String[] args) throws IOException {

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		ArrayList<String[]> a1 = new ArrayList<String[]>();
		
		for(int x = 0; x < N; x++) {
			
			String temp = f.readLine();
			boolean check = true;
			int position = 0;
			int pos1 = 0;
			for(int y = 0; y < a1.size(); y++) {
				String[] v = a1.get(y);
				if (v[0].equals(temp)) {
					check = false;
					position = Integer.parseInt(v[1]);
					pos1 = y;
				}
			}
			if (check) {
				String[] v1 = {temp, Integer.toString(position)};
				a1.add(v1);
				out.println("OK");
			}
			else {
				String[] v1 = a1.get(pos1);
				v1[1] = Integer.toString(Integer.parseInt(v1[1]) + 1);
				out.println(temp + v1[1]);
			}
			
		}
		
		
		out.close();
	}
}
