import java.io.*;
import java.util.*;

public class Taxi {

	public static void main(String[] args) throws IOException {

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(f.readLine());
		
		int tracker = 0;
		int[] nums = {0, 0, 0};
		
		for(int x = 0; x < T; x++) {
			
			int temp = Integer.parseInt(st.nextToken());
			if (temp == 4) {
				tracker++;
			}
			else {
				nums[temp-1]++;
			}
			if (nums[0] > 0 && nums[2] > 0){
				nums[0]--;
				nums[2]--;
				tracker++;
			}
			if (nums[1] % 2 == 0 && nums[1] > 0) {
				nums[1] -= 2;
				tracker++;
			}
			
		}
		
		tracker += nums[2];
		
		int temp1 = nums[0] + nums[1];
		
		if (temp1 % 4 == 0) {
			tracker += temp1/4;
		}
		else {
			tracker += temp1/4 + 1;
		}
		
		out.println(tracker);
		out.close();
		
	}
}
