package mustDo;

import java.util.HashMap;
import java.util.Map;

public class TotalDecodeMessage {
	
	static Map<Integer, Character> map;
	
	static {
		map = new HashMap<Integer, Character>();
		for(int i = 1; i <=26;i++) {
			Character c = (char) ('a' + (i - 1));
			map.put(i, c);
		}
	}
	
	public static void solution(String output, char[] codedStr, int i) {
		
		if( i == codedStr.length ) {
			System.out.println(output);
			return;
		}
			
		
		if( i + 1 == codedStr.length) {
			int val = Integer.parseInt("" + codedStr[i]);
			output += "" + map.get(val);
			System.out.println(output);
			return;
		}
		int val = Integer.parseInt("" + codedStr[i]);
		
		if( val == 1) {
			solution(output + "a", codedStr, i + 1);
			int val2 = Integer.parseInt("" + codedStr[i + 1]);
			val = val * 10 + val2;
			output += "" + map.get(val);
			solution(output, codedStr, i + 2);
		}else if( val == 2) {
			
			solution(output + "b", codedStr, i + 1);
			int val2 = Integer.parseInt("" + codedStr[i + 1]);
			val = val * 10 + val2;
			if(val > 26)
				return;
			output += "" + map.get(val);
			solution(output, codedStr, i + 2);
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String code = "123";
		solution("", code.toCharArray(), 0);

	}

}
