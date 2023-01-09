package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1100 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[][] arr = new char[8][8];
		
		String txt = "";
		for(int i = 0; i < 8 ; i++) {
			txt += br.readLine();
		}
		
		int k = 0;
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) { 
			for(int j = 0; j < arr.length; j++) {
				arr[i][j] = txt.charAt(k); k++; 
				
				if(arr[i][j] == 'F') {
					if(i == j || (i == 0 && (j%2 == 0)) || (i%2) == (j%2)) {
						count ++;
					}
				}
			} 
		}
		 
		System.out.println(count);
	}

}
