package mustDo;

public class LongestCommonSequence {
	
	
	static int[][] dp;
	
	static void init(int m, int n) {
		dp = new int[m + 1][n + 1];
	}
	
	static void print() {
		
		for(int i = 0; i < dp.length; i++) {
			for(int j = 0 ; j < dp[0].length; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
	}
	

	public static int solution(char[] arr1, char[] arr2, int m, int n) {
		
		if(m == 0 || n == 0)
			return 0;
		
		if(arr1[m - 1] == arr2[n - 1]) {
			
			return 1 + solution(arr1, arr2, m - 1, n - 1);
			
		}
		return Math.max(solution(arr1, arr2, m - 1, n), solution(arr1, arr2, m, n - 1));
		
	}

	
	public static int solutionDp(char[] arr1, char[] arr2, int m, int n) {
		
		if(m == 0 || n == 0)
			return 0;
		
		if(arr1[m - 1] == arr2[n - 1]) {
			
			if(dp[m - 1][n - 1] == 0)
				dp[m - 1][n  - 1] = 1 + solution(arr1, arr2, m - 1, n - 1);
			
			return dp[m - 1][n - 1];
		}
		return Math.max(solution(arr1, arr2, m - 1, n), solution(arr1, arr2, m, n - 1));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr1 = "AGGTAB".toCharArray();
		char[] arr2 = "GXTXAYB".toCharArray();
		long t1 = System.currentTimeMillis();
		System.out.println(solution(arr1, arr2, arr1.length, arr2.length));
		long t2 = System.currentTimeMillis();
		System.out.println(t2  - t1);
		init(arr1.length, arr2.length);
		System.out.println(solutionDp(arr1, arr2, arr1.length, arr2.length));
		long t3 = System.currentTimeMillis();
		System.out.println(t3  - t2);
		//print();

	}

}
