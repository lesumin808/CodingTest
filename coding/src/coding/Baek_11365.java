package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Baek_11365 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		String txt;
		String[] arr = null;
		
		while ((txt = br.readLine()) != null) {
			arr = txt.split("\\s");
			/*
			 * for (int i = 0; i < arr.length - 1; i++) { char[] cArr =
			 * arr[i].toCharArray(); for (int j = cArr.length - 1; j <= 0; j--) {
			 * System.out.println("j" + j); sb.append(cArr[j]); } sb.append("\n"); }
			 */
		}
		
		System.out.println(arr[0]);
		
	}

}
