package mustDo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringFormationFromSubString {
	
	public static String solution(String input) {
		
		for(int i = 1; i < input.length(); i++) {
			
			String sub = input.substring(0, 1);
			if(input.replace(sub, "").length() == 0)
				return "True";
			
		}
		
		return "False";
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0) {
			String input = br.readLine().trim();
			System.out.println(solution(input));
		}
		

	}

}
