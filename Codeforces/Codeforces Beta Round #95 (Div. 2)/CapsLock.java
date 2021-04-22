import java.io.*;
import java.util.*;

public class CapsLock {

	public static void main(String[] args) throws IOException {

		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

		String temp1 = f.readLine();
		
		boolean check1 = true;
		
		for(int x = 1; x < temp1.length(); x++) {
			if (!Character.isUpperCase(temp1.charAt(x))) {
				check1 = false;
			}
		}
		String output = "";
		
		if (check1) {
			for(int x = 0; x < temp1.length(); x++) {
				if (Character.isUpperCase(temp1.charAt(x))) {
					output += Character.toString(temp1.charAt(x)).toLowerCase();
				}
				if (Character.isLowerCase(temp1.charAt(x))) {
					output += Character.toString(temp1.charAt(x)).toUpperCase();
				}
			}
		}
		else {
			output = temp1;
		}
		
		
		out.println(output);
		out.close();
		
	}
}
