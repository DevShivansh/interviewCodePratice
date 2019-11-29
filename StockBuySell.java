package mustDo;


public class StockBuySell {
	
	public static void solution(int[] arr) {
		
		
		int min = arr[0];
		int max = arr[0];
		int startIndex = 0;
		int endIndex = 0;
		StringBuilder str = new StringBuilder();
		
		
		for(int i = 1; i < arr.length;i++) {
			
			if(arr[i] > max) {
				max = arr[i];
				endIndex = i;
			}else {
				
				if(min < max) {
					
					str.append("(" + startIndex + "," + endIndex + ") ");
					
				}
				min = max = arr[i];
				startIndex = endIndex = i;
				
			}
			
		}
		if(min < max) {
			
			str.append("(" + startIndex + "," + endIndex + ") ");
			
		}

		System.out.println(str.toString().trim());
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int[] arr = new int[] {100, 180, 260, 310, 40, 535, 695};
		arr = new int[] {23, 13, 25, 29, 33, 19, 34, 45, 65, 67};
		solution(arr);

	}

}
