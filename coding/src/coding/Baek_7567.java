package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Baek_7567 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String dish = br.readLine();
		
		int height = 0;
		
		for(int i = 1; i < dish.length(); i++) {
			if(dish.charAt(i-1) == dish.charAt(i)) {
				height += 5;
			}else {
				height += 10;
			}
		}
		
		height += 10;
		
		System.out.println(height);
		

	}

}
