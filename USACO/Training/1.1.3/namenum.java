/*
ID: 27sanjeevd
LANG: JAVA
TASK: namenum
*/
import java.io.*;
import java.util.*;

public class namenum {
	public static void main(String [] args) throws IOException {
		
		//BufferedReader f = new BufferedReader(new FileReader("namenum.in"));
		//PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("namenum.out")));
		
		
		
		BufferedReader f1 = new BufferedReader(new FileReader("namenumdict.txt"));
		HashSet<String> names = new HashSet<String>();
		String temp1;
		while((temp1 = f1.readLine()) != null) {
			names.add(temp1);
		}
		
		HashMap<Integer, String> keyPad = new HashMap<Integer, String>();
		
		keyPad.put(2, "ABC");
		keyPad.put(3, "DEF");
		keyPad.put(4, "GHI");
		keyPad.put(5, "JKL");
		keyPad.put(6, "MNO");
		keyPad.put(7, "PRS");
		keyPad.put(8, "TUV");
		keyPad.put(9, "WXY");
		
 		//String serialNum = f.readLine();
		String serialNum = "26678268463";
		boolean check1 = false;
		
		ArrayList<String> temp5 = new ArrayList<String>();
		temp5.addAll(word(serialNum, keyPad));
		
		for(int x = 0; x < temp5.size(); x++) {
			if (names.contains(temp5.get(x))) {
				System.out.println(temp5.get(x));
				//out.println(temp5.get(x));
				check1 = true;
			}
		}
		
		if (check1 == false) {
			System.out.println("NONE");
			//out.println("NONE");
		}
		
		//out.close();
	}
	
	public static ArrayList word(String b, HashMap<Integer, String> a1) {
		ArrayList<String> temp = new ArrayList<String>();
		
		String temp1 = b;
		String[] tempArray = temp1.split("");
		int counter = -1;
		temp.addAll(word1(tempArray, a1, counter, ""));
		
		return temp;
	}
	
	public static ArrayList word1(String[] tempArray, HashMap<Integer, String> a1, int counter, String b) {
		ArrayList<String> temp = new ArrayList<String>();
		counter++;
		if (counter < tempArray.length) {
			String temp1 = tempArray[counter];
			String temp2 = a1.get(Integer.parseInt(temp1));
			String[] temp3 = temp2.split("");
			for(int x = 0; x < temp3.length; x++) {
				temp.addAll(word1(tempArray, a1, counter, b + temp3[x]));
			}
				
		}
		else {
			temp.add(b);
		}
		return temp;
	}
}
