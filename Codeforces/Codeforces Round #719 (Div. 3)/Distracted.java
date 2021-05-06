import java.io.*;
import java.util.*;

public class Distracted {

	public static void main(String[] args) throws IOException {

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		for(int x = 0; x < N; x++) {
			
			ArrayList<String> a1 = new ArrayList<String>();
			int T = Integer.parseInt(f.readLine());
			st = new StringTokenizer(f.readLine());
			
			String[] a2 = st.nextToken().split("");
			
			String output = "";
			
			for(int y = 0; y < a2.length; y++) {
				
				if (output == "NO") {
					break;
				}
				else if (y > 0 && a2[y].equals(a2[y-1])) {
					
				}
				else {
					for(int z = 0; z < a1.size(); z++) {
						if (a1.get(z).equals(a2[y])) {
							output = "NO";
							break;
						}
					}
					if (!(output.equals("NO"))) {
						a1.add(a2[y]);
					}
					
					
				}
				
			}
			if (output.equals("NO")) {
				out.println(output);
			}
			else {
				out.println("YES");
			}
			
			
		}
		
		out.close();
	}
}
