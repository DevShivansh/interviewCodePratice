package mustDo;

public class LongestPalindromString {
	
	
	public static int solution(String input) {
		int maxLength = 1;
		int n = input.length();
		boolean[][] dp = new boolean[n][n];
		
		for(int i = 0; i < n; i++)
			dp[i][i] = true;
		
		int start = 0;
		for(int i = 0; i < n - 1; i++) {
			
			if(input.charAt(i) == input.charAt(i + 1)) {
				dp[i][i+1] = true;
				start = 0;
				maxLength = 2;
			}
		}
		
		for(int k = 3; k <= n; k++) {
			for(int i = 0; i < n - k + 1; i++) {
				
				int j = i + k - 1;
				
				if( dp[i + 1][j - 1] && input.charAt(i) == input.charAt(j)) {
					dp[i][j] = true;
					
					maxLength = (maxLength < k) ? k : maxLength;
					start = i;
					
				}
			}
		}
		
		printSubString( input, start, start + maxLength );
		
		
		return maxLength;
	}

	private static void printSubString(String input, int start, int i) {
		// TODO Auto-generated method stub
		String subString = input.substring(start, i);
		System.out.println(subString);
		
	}

	public static void main(String[] args) {
		
		 String str = "forgeeksskeegfor"; 
	        System.out.println("Length is: " +  
	        		solution(str)); 

	}

}
