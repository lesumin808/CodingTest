package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Baek_17094 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		String txt = br.readLine();
		
		String txt2 = txt.replaceAll("e", "");
		String txtE = txt.replaceAll("2", "");
		  
		if(txt2.toCharArray().length > txtE.toCharArray().length) {
			System.out.println("2");
		} else if(txt2.toCharArray().length < txtE.toCharArray().length){ 
			System.out.println("e"); 
		} else {
		  System.out.println("yee"); 
		}
	}

}
