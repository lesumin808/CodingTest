package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Beak_3059 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < num; i++) {
			String str = br.readLine();
			sb.append(sum(str) + "\n");
		}
		
		System.out.println(sb);

	}
	
	public static int sum(String str) {
		char[] c = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q',
				'R','S','T','U','V','W','X','Y','Z'};		
		
		String number = "";
		int total = 0;
		
		for(int j = 0; j < c.length; j++) {
			boolean confirm = false;
			for(int i = 0; i < str.length(); i++) {
				if(c[j] == str.charAt(i)) {
					confirm = true;
					break;
				}
			}
			
			if(confirm == false) number += c[j];
		}
		
		for(int p = 0; p < number.length(); p++) {
			total += number.charAt(p);
		}
		
		return total;
	}

}

