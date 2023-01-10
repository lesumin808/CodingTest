package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beak_2789 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String mail = br.readLine();

		System.out.println(mail.replaceAll("[CAMBRIDGE]", ""));
	}
}
