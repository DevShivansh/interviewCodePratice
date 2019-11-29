package mustDo;

public class MaxSumContSubArray {
	
	
	public static int solution(int[] arr) {
		
		int currentMax = arr[0];
		int maxOverall = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			
			currentMax = Math.max(arr[i], currentMax + arr[i]);
			maxOverall = currentMax > maxOverall ? currentMax : maxOverall;
			
		}
		
		return maxOverall;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
