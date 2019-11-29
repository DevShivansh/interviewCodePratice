package mustDo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class NutsAndBot {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] precedenceArr = {'!', '#', '$', '%' , '&', '*', '@', '^', '~'};
		int t = readInt(br.readLine());
		while(t-- > 0) {
			int n = readInt(br.readLine());
			char[] inputs = br.readLine().replace(" ", "").toCharArray();
			br.readLine();
			Map<Character, Integer> charMap = new HashMap<Character, Integer>();
			for(int i=0;i<n;i++) {
				Character c = inputs[i];
				if(charMap.containsKey(c)) {
					charMap.put(c, charMap.get(c) + 1);
				}else {
					charMap.put(c, 1);
				}
			}
			StringBuilder output = new StringBuilder();
			for(Character c : precedenceArr) {
				if(charMap.containsKey(c)) {
					int val = charMap.get(c);
					for(int i = 0; i < val;i++)
						output.append(c + " ");
				}
			}
			String result = output.toString().trim();
			System.out.println(result);
			System.out.println(result);
			
		}

	}
	
	
	public static int readInt(String input) {
		return Integer.parseInt(input.trim());
	}

}
