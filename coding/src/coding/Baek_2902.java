package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Baek_2902 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] txt = br.readLine().split("-");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < txt.length; i++) {
			
			if(txt[i].charAt(0) != '-') {
				sb.append(txt[i].charAt(0));
				//txt[i].charAt(0) - 0 -> int로 형변환
			}
		}

		System.out.println(sb);
	}

}
