package codingQuestions;

public class MergeSort {

	
	public static void printArray(int[] arr) {
		
		for(int i = 0; i < arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		
	}
	
	public static void sort(int[] arr, int start, int end) {
		
		if(start < end) {
			
			int mid = (start + end) / 2;
			
			sort(arr, start, mid);
			sort(arr, mid + 1, end);
			
			merge(arr, start, mid, end);
			
			
		}
		
	}
	
	private static void merge(int[] arr, int start, int mid, int end) {
		
		 // Find sizes of two subarrays to be merged 
        int n1 = mid - start + 1;
		int n2 = end - mid;
		
		/* Create temp arrays */
        int[] temp1 = new int[n1];
		int[] temp2 = new int[n2];
		
		/*Copy data to temp arrays*/
        
        for(int i=0; i< n1; i++) {
			temp1[i] = arr[start + i];
		}
		
		for(int i=0; i< n2; i++) {
			temp2[i] = arr[mid + 1 + i];
		}
		
		int k = start;
		int i = 0;
		int j = 0;
		
		while( i < n1 && j < n2) {
			
			if(temp1[i] <= temp2[j]) {
				arr[k++] = temp1[i++];
			}else {
				arr[k++] = temp2[j++];
			}
			
		}
		
		
		while(i < n1) {
			arr[k++] = temp1[i++];
		}
		
		while( j < n2) {
			arr[k++] = temp2[j++];
		}
		
		
				
	}
	
	
	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6, 7}; 
		  
        System.out.println("Given Array"); 
        printArray(arr); 
  
        sort(arr, 0, arr.length-1); 
  
        System.out.println("\nSorted array"); 
        printArray(arr);
	}
}
