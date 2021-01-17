/*
ID: 27sanjeevd
LANG: JAVA
TASK: transform
*/
import java.io.*;
import java.util.*;

public class transform {

	public static void main(String[] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new FileReader("transform.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("transform.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		String[][] before = new String[N][N];
		String[][] after = new String[N][N];
		
		for(int x = 0; x < N * 2; x++) {
			String temp = f.readLine();
			for(int y = 0; y < N; y++) {
				if (x < N) {
					before[x][y] = Character.toString(temp.charAt(y));
				}
				else {
					after[x - N][y] = Character.toString(temp.charAt(y));
				}
			}
			
		}
		
		
		String[][][] transformations = new String[8][N][N];
		
		transformations[0] = rotate90(before);
		transformations[1] = rotate90(transformations[0]);
		transformations[2] = rotate90(transformations[1]);
		transformations[3] = reflect(before);
		transformations[4] = reflect(transformations[0]);
		transformations[5] = reflect(transformations[1]);
		transformations[6] = reflect(transformations[2]);
		transformations[7] = before;
		boolean check1 = false;
		
		
		int num = -1;
		for(int x = 0; x < 8; x++) {
			boolean check3 = check2(transformations[x], after);
			if (check3) {
				check1 = true;
				if (x < 4) {
					num = x + 1;
				}
				else if (x < 7) {
					num = 5;
				}
				else {
					num = 6;
				}
				break;
				
			}
			
		}
		
		if (check1 == false) {
			num = 7;
		}
		out.println(num);
		out.close();
		
		
		}
	
	public static void print1(String[][] test) {
		
		String temp = "";
		for(int x = 0; x < test.length; x++) {
			temp = "";
			for(int y = 0; y < test.length; y++) {
				temp += " " + test[x][y];
			}
			System.out.println(temp);
		}
		System.out.println("****");
	}
	
	public static boolean check2(String[][] before1, String[][] after1) {
		
		boolean check1 = true;
		for(int x = 0; x < before1.length; x++) {
			for(int y = 0; y < before1.length; y++) {
				if (!(before1[x][y].equals(after1[x][y]))) {
					
					check1 = false;
					break;
				}
			}
			if (check1 == false) {
				break;
			}
			
		}
		return check1;
		
	}
	
	
	public static String[][] rotate90 (String[][] test){
		int N = test[0].length;
		String[][] test1 = new String[N][N];
		
		for(int x = 0; x < N; x++) {
			for(int y = 0; y < N; y++) {
				test1[x][y] = test[x][y];
			}
		}
		
		for(int x = 0; x < N / 2; x++) {
			
			for(int y = x; y < N - x - 1; y++) {
				
				String temp = test1[x][y];
				
				test1[x][y] = test1[y][N - x - 1];
				test1[y][N - x - 1] = test1[N - x - 1][N - y - 1];
				test1[N - x - 1][N - y - 1] = test1[N - 1 - y][x];
				test1[N - 1 - y][x] = temp;
			}
			
		}
		
		return test1;
	}
	
	public static String[][] reflect(String[][] test){
	
		String[][] res = new String[test.length][test.length];
	    for(int i = 0; i < test.length; i++){
	    	for(int j = 0; j < test.length; j++){
	    		res[i][test.length-1-j] = test[i][j];
	    	}
	    }
	    return res;
		
	}
}
