package mustDo;

import java.util.HashMap;
import java.util.Map;

public class SmallestWindowForString {

	public static String solution(String input1, String input2) {
		
		if( input2.length() > input1.length())
			return "-1";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] arr = input1.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			Character c = arr[i];
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		
		if(!allCharAvail(map, input2))
			return "-1";
		
		

		int i = 0;
		int j = arr.length - 1;
		boolean left = false;
		boolean right = false;

		while (i < j && j - i > input2.length()) {

			Character c1 = arr[i];

			if (!left && map.containsKey(c1)) {
				int val = map.get(c1);
				if (val == 1)
					map.remove(c1);
				else
					map.put(c1, val - 1);

				if (allCharAvail(map, input2)) {
					i++;
				} else {
					left = true;
				}
			}

			Character c2 = arr[j];

			if (!right && map.containsKey(c2)) {
				int val = map.get(c2);
				if (val == 1)
					map.remove(c2);
				else
					map.put(c2, val - 1);

				if (allCharAvail(map, input2)) {
					j--;
				} else {
					j++;
					right = true;
				}
			}
			
			if(left && right)
				break;

		}

		return input1.substring(i, j);
	}

	private static boolean allCharAvail(Map<Character, Integer> map, String input2) {
		for(Character c : input2.toCharArray()) {
			if(!map.containsKey(c))
				return false;
		}
		return true;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("timetopractice", "toc"));
		//
		System.out.println(solution("zoomlazapzo", "oza"));

	}

}
