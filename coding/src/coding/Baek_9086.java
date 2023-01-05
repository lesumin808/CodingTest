package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_9086 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int j = 0; j < num; j++) {
			String txt = br.readLine();
				if(!isNumberic(txt)) {
					char[] charTxt = txt.toCharArray();
					sb.append(charTxt[0]).append(charTxt[charTxt.length - 1]).append("\n");
				}
		}
		
		System.out.print(sb);
	}
	
	
	//숫자변환
	public static boolean isNumberic(String txt) {
		try {
			Integer.parseInt(txt);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}


