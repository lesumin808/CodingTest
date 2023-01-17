package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beak_23027_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] c = br.readLine().toCharArray();
		
		boolean exA = false;
		boolean exB = false;
		boolean exC = false;
		
		for(int i = 0; i < c.length; i++) {
			if(c[i] == 'A') {
				exA = true;
				break;
			} else if (c[i] == 'B') {
				exB = true;
			} else if (c[i] == 'c') {
				exC = true;
			}
		}
		
		StringBuffer sb = new StringBuffer();
		
		if(exA) {
			for(int i = 0 ; i < c.length; i++) {
				if (c[i] == 'B' || c[i] == 'C' || c[i] == 'D' || c[i] == 'F') {
					sb.append("A");
				} else {
					sb.append(c[i]);
				}
			}
		} else if(exB) {
			for(int i = 0 ; i < c.length; i++) {
				if (c[i] == 'C' || c[i] == 'D' || c[i] == 'F') {
					sb.append("B");
				} else {
					sb.append(c[i]);
				}
			}
		} else {
			for(int i = 0 ; i < c.length; i++) {
					sb.append("A");
			}
		}
		
		System.out.println(sb);
	}

}
