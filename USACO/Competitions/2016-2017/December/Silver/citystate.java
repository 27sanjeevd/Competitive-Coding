import java.io.*;
import java.util.*;

public class citystate {

	public static void main(String[] args) throws IOException {
		
		//BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		BufferedReader f = new BufferedReader(new FileReader("citystate.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("citystate.out")));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		Map<String, Integer> a1 = new TreeMap();
		
		for(int x = 0; x < N; x++) {
			st = new StringTokenizer(f.readLine());
			
			String city = st.nextToken();
			String state = st.nextToken();
			String val = city.substring(0, 2) + state;
			a1.put(val, a1.getOrDefault(val, 0) + 1);
		}
		
		int output = 0;
		
		for(Map.Entry<String, Integer> entry : a1.entrySet()) {
			
			String code = entry.getKey().substring(2, 4) + entry.getKey().substring(0, 2);
			
			if (!code.equals(entry.getKey())){
				Integer temp = a1.get(code);
				if (temp != null) {
					output += temp * entry.getValue();
				}
			}
			
		}
		
		out.println(output / 2);
		out.close();
	}


	
}