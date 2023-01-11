package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beak_2711 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		String txt = "";
		for(int i = 0; i < num ; i++) {
			txt = br.readLine();
			int index = txt.charAt(0) - '0';
			sb.append(txt.substring(2,index + 1));
			sb.append(txt.substring(index+2,txt.length()));
			sb.append("\n");
			System.out.println(sb);
		}
		
	}

}
