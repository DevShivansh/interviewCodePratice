package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {7,8,3,1,5,4,2};
		quickSort(arr, 0, arr.length-1);
		System.out.println(new ArrayList<Integer>(Arrays.asList(arr)));
	}
	
	public static void quickSort(Integer arr[], int start, int end) {
		
		if(start>=end)
			return;
		
		int pivot = partition(arr,start,end);
		quickSort(arr, start, pivot-1);
		quickSort(arr, pivot+1, end);
		
		
	}

	private static int partition(Integer[] arr, int start, int end) {
		
		int last = arr[end];
		int pivot = start;
		for(int i=start+1; i<=end;i++) {
			if(arr[i] <= last) {
				int temp = arr[i];
				arr[i] = arr[pivot];
				arr[pivot] = temp;
				pivot++;
			}
		}
		
		
		return pivot - 1;
	}
	

}
