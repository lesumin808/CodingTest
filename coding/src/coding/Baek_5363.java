package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_5363 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i < num; i++) {
			String[] arr = br.readLine().split(" ");
			
			for(int j = 2; j < arr.length; j++) {
				sb.append(arr[j] + " ");
			}
			sb.append(arr[0]  + " " + arr[1] + "\n");
		}
		
		System.out.println(sb);
	}

}
 