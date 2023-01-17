package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Baek_23027 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String txt = br.readLine();
		int num = txt.length();
		
		if(txt.contains("A") == true) {
			txt = txt.replaceAll("B", "A");
			txt = txt.replaceAll("C", "A");
			txt = txt.replaceAll("D", "A");
			txt = txt.replaceAll("F", "A");
		}else if(txt.contains("B") && !txt.contains("A")) {
			txt = txt.replaceAll("C", "B");
			txt = txt.replaceAll("D", "B");
			txt = txt.replaceAll("F", "B");
		}else if(!txt.contains("B") && !txt.contains("A") && txt.contains("C")) {
			txt = txt.replaceAll("D", "C");
			txt = txt.replaceAll("F", "C");
		}else if(!txt.contains("B") && !txt.contains("A") && !txt.contains("C")) {
			txt = "";
			for (int i = 0; i < num; i++) {
				txt += 'A';
			}
		}
		
		System.out.println(txt);
	}

}
