package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beak_23627 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String txt = br.readLine();
		
		StringBuffer sb = new StringBuffer();
		if(txt.length() > 5) {
			if(txt.substring(txt.length()-5, txt.length()).equals("driip")) sb.append("cute");
			else sb.append("not cute");
		}else sb.append("not cute");
		
		System.out.println(sb);
	}

}
