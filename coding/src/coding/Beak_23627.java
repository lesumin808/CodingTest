package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Beak_23627 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int len = str.length();
		
		if(len < 5) {
			System.out.println("not cute");
			return;
		}
		
		char [] c = {'d','r','i','i','p'};
		for(int i = len-5; i < len; i++) {
			
			if(str.charAt(i) != c[i-len+5]) {
				System.out.println("not cute");
				return;
			}
		}
		
		System.out.println("cute");
		
		
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * String txt = br.readLine();
		 * 
		 * if (txt.length() > 5) { if (txt.substring(txt.length() - 5,
		 * txt.length()).equals("driip")) System.out.println("cute"); else
		 * System.out.println("not cute"); } else System.out.println("not cute");
		 */
	}

}
