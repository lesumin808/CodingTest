package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Baek_2711_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			String txt = br.readLine();
			
			int index = Integer.parseInt(txt.split(" ")[0]);
			txt = txt.split(" ")[1];
			
			sb.append(txt.substring(0, index - 1));
			sb.append(txt.substring(index, txt.length()) + '\n');
		
		}

		System.out.println(sb);
	}

}
