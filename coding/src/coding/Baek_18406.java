package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Baek_18406 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String number = br.readLine();

		System.out.println(isLucky(number));
	}
	
	public static String isLucky(String number) {
		char[] charNumber = number.toCharArray();
		int half = charNumber.length / 2;
		
		int num1 = 0;
		int num2 = 0;
		
		for(int i = 0; i < half; i++) {
			num1 += charNumber[i];
		}
		for(int j = charNumber.length - 1; j >= half; j--) {
			num2 += charNumber[j];
		}
		
		if(num1 == num2) {
			return "LUCKY";
		}else {
			return "READY";
		}
	}

}
