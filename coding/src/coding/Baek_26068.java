package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_26068 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		for(int i = 0; i < num; i++) {
			String txt = br.readLine().split("-")[1];
			
			int day = Integer.parseInt(txt);
			
			if(day <= 90) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
