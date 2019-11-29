package codingQuestions;

public class SearchInRotatedArray {
	
	
	static int searchInRotated(int[] arr, int n, int key) {
		
		int pivot = findPivot(arr, 0, n-1);
		
		//pivot = -1 means array not rotated
		if(pivot == -1)
			return binarySearch(arr, 0, n-1, key);
		
		if(arr[pivot] == key)
			return pivot;
		
		if(arr[0] <= key)
			return binarySearch(arr, 0, pivot -1, key);
		return binarySearch(arr, pivot + 1, n -1 , key);
		
		
		
	}

	private static int binarySearch(int[] arr, int low, int high, int key) {
		
		if(high < low)
			return -1;
		
		int mid = (low + high) / 2;
		
		if(arr[mid] == key)
			return mid;
		
		if(arr[mid] < key)
			return binarySearch(arr, mid + 1, high, key);
		
		return binarySearch(arr, low, mid -1, key);
	}

	private static int findPivot(int[] arr, int low, int high) {
		if(high < low)
			return -1;
		
		if(high == low)
			return low;
		
		int mid = (low + high) / 2;
		
		if(mid < high && arr[mid] > arr[mid + 1])
			return mid;
		
		if(mid > low && arr[mid] < arr[mid -1])
			return (mid - 1);
		
		if(arr[low] >= arr[mid])
			return findPivot(arr, low, mid -1);
		
		return findPivot(arr, mid + 1, high);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
