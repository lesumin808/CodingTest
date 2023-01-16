package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Baek_11365_2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String txt = "";
		String text = "";
		/*
		 * while(!"END".equals(txt = br.readLine())){
		 * 
		 * for(int i = txt.length() - 1; i >= 0; i--) { text += txt.charAt(i); }
		 * 
		 * text += "\n"; }
		 * 
		 * System.out.println(text);
		 */
		
		while(true) {
			txt = br.readLine();
			if("END".equals(txt)) {//비교값이 앞으로
				break;
			}
			for(int i = txt.length() - 1; i >= 0; i--) {
				text += txt.charAt(i);
			}
			text += '\n';
		}
		
		System.out.println(text);
		
	}

}
