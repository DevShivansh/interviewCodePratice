package mustDo;

import java.util.HashMap;
import java.util.Map;

public class LargestNumInKSwap {
	
	
	public static String solution(String input, int k) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		char[] arr = input.toCharArray();
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(Character c : arr) {
			Integer i = c - '0';
			
			if(i > max)
				max = i;
			
			if( i < min)
				min = i;
			
			if(map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			}else {
				map.put(i, 1);
			}
			
			
		}
		int count = 0;
		StringBuilder str = new StringBuilder();
		while( max >= min && count < k) {
			
			if(map.containsKey(max)) {
				
				str.append(max);
				input = input.replaceFirst("" + max, "");
				int temp = map.get(max);
				if(temp == 1)
					map.remove(max);
				else {
					map.put(max, temp - 1);
				}
				count++;
			}else {
				max--;
			}
			
		}
		
		str.append(input);
		return str.toString();
		
		
	}
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("1234567", 4));

	}

}
