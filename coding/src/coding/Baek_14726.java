package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_14726 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		StringBuffer sb = new StringBuffer();
		
		for(int j = 0; j < num; j++) {
			sb.append(total(br.readLine()) + "\n");
		}
		
		System.out.println(sb);
		
	}
	
	public static String total(String cardNum) {
		
		int total = 0;
		
		for(int i = cardNum.length() - 1; i >= 0; i--) {
			int cardnum = (cardNum.charAt(i) - '0');
			if(i % 2 == 0) {
				if(cardnum >= 5) {
					int a = (cardnum * 2);
					total += (a - 10) + 1; 
				}else {
					total += (cardnum * 2);
				}
			}else {
				total += cardnum;
			}
		}
		
		if((total % 10) == 0) return "T";
		else return "F";
	}

}
