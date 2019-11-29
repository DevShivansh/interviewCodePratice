package arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P1_CreateBiggestNumber {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Comparator<Integer> c = (num1, num2) -> {
			
			if(num1 == num2)
				return 0;
			
			int len1 = length(num1);
			int len2 = length(num2);
			
			int[] arr1 = getElementArr(num1, len1);
			int[] arr2 = getElementArr(num2, len2);
			
			int upperLimit = len1 < len2 ? len1 : len2;
			int value = 0;
			for(int i = 0; i < upperLimit;i++) {
				
				if(arr1[i] > arr2[i]) {
					value = -1;
					break;
				}else if(arr1[i] < arr2[i]){
					value = 1;
					break;
				}
					
				
			}
			
			if( value != 0)
				return value;
			else {
				int digit1,digit2;
				if(len1 < len2) {
					digit2 = arr2[len1];
					digit1 = arr1[len1 - 1];
				}else {
					digit2 = arr1[len2];
					digit1 = arr2[len2 - 1];
				}
				return digit1 > digit2 ? 1 : -1;
			}
				
			
		};
		
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-- > 0) {
			int n = Integer.parseInt(br.readLine().trim());
			Integer arr[] = new Integer[n];
			String[] input = br.readLine().trim().split(" ");
			for(int i=0; i< n;i++) {
				arr[i] = Integer.parseInt(input[i]);
			}
			System.out.println(solution(arr, c));

		}
		
	}
	
	public static String solution(Integer[] arr, Comparator<Integer> c) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		if(arr.length == 0) {
			return "";
		}else if(arr.length == 1) {
			return "" +  arr[0];
		}
		
		
		Collections.sort(list, c);
		StringBuilder br = new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			br.append(arr[i]);
		}
		return br.toString();
	}
	
	public static void printArray(Integer[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int[] getElementArr(int num, int len) {
		int arr[] = new int[len];
		for(int i=len-1; i>= 0;i--) {
			int rem = num%10;
			arr[i] = rem;
			num/=10;
		}
		return arr;
	}
	
	
	public static int length(int num) {
		if(num < 10)
			return 1;
		else if(num >=10 && num < 100)
			return 2;
		else if(num >=100 && num < 1000)
			return 3;
		else
			return 4;
	}

}
