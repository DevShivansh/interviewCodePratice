package mustDo;

import java.util.HashSet;
import java.util.Set;

public class MaxSpeakers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sequence = "qwertyqwertyuiopqwertyuiopasdfgqwertyuiopasdfghjklqwertyuiopasdfghjklzxcvbnmqwertyui";
		sol1(sequence);
	}
	
	
	public static void sol1(String sequence) {
		
		Set<Character> set = new HashSet<Character>();
		int size = 0;
		long start = System.currentTimeMillis();
		for(Character c : sequence.toCharArray()) {
			if(!set.contains(c)) {
				set.add(c);
			}else {
				size = set.size();
				set.clear();
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(size);
		System.out.println("Time : " + (end - start));
	}

}
