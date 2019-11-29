package codingQuestions;

public class MissingElementInAP {
	
	public static int findMissing(int[] arr, int n) {
		
		int diff = (arr[n-1] - arr[0]) / n;
		return findMissingUtil(arr, 0, n-1, diff);
	}

	private static int findMissingUtil(int[] arr, int low, int high, int diff) {
		
		if(high <= low)
			return Integer.MAX_VALUE;
		
		int mid = (low + high) / 2;
		
		if(mid < high && arr[mid + 1] - arr[mid] != diff)
			return mid + diff;
		
		if(mid > low && arr[mid] - arr[mid -1] != diff)
			return mid - diff;
		
		if(arr[mid] == arr[0] + (mid * diff))
			return findMissingUtil(arr, mid + 1, high, diff);
		
		return findMissingUtil(arr, low, mid -1, diff);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
