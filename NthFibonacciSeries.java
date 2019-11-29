package mustDo;

public class NthFibonacciSeries {
	
	static long[] arr = new long[1000];
	
	static {
		
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		
	}
	
	public long solution(int n) {
		return arr[n - 1];
 	}
	
	public static void print() {
		for(int i = 0; i < 100; i++)
			System.out.print( arr[i] + " ");
	}
	

	public static void main(String[] args) {
		
		print();
		

	}

}
