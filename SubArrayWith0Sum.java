package mustDo;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWith0Sum {
	
	public static boolean solution(int[] arr) {
		
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(arr[0]);
		int sum = arr[0];
		
		for(int i = 1 ; i < arr.length; i++) {
			
			sum+=arr[i];
			if(set.contains(sum) || arr[i] == 0)
				return true;
			set.add(sum);
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(4 ^ 5);
		
	}

}
