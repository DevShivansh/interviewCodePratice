package mustDo;


public class PrintMatrixInSpiral {
	
	public static void solution(int[][] arr, int m, int n) {
		
		boolean toggle = true;
		for(int i = 0; i < m; i++) {
			
			
			if(toggle) {
				toggle = false;
				for(int j = 0; j < n; j++)
					System.out.print(arr[i][j] + " ");
				
			}else{
				toggle = true;
				for(int j = n - 1; j >= 0; j--)
					System.out.print(arr[i][j] + " ");
			}
			
		}
		
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[][] { {1,2,3,4} , {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		solution(arr, 4, 4);

	}

}
