package codingQuestions;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class NumberOfPlatformForTrains {
	
	public static int solution(int[] arr, int[] dep, int n) {
		
		Map<Integer, Character> map = new TreeMap<Integer, Character>();
		
		for(int i = 0; i < n; i++) {
			map.put(arr[i], 'a');
			map.put(dep[i], 'd');
		}
		
		int count = 0;
		int max = 0;
		
		Collection<Character> values = map.values();
		
		for(Character c : values) {
			if(c == 'a') {
				count++;
			}else {
				count--;
			}
			if(count > max)
				max = count;
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {900, 940, 950, 1100, 1500, 1800}; 
	    int dep[] = {910, 1200, 1120, 1130, 1900, 2000}; 
	    System.out.println(solution(arr, dep, arr.length));

	}

}
