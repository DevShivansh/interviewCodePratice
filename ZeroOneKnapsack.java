package mustDo;

public class ZeroOneKnapsack {
	
	
	
	
	public static int solution(int[] w, int[] val, int max, int n) {
		
		
		if(max <= 0 || n <= 0)
			return 0;
		
		if(w[n - 1] > max)
			return solution(w, val, max, n - 1);
		
		return Math.max( val[n - 1] + solution(w, val, max - w[n - 1], n - 1)  , solution(w, val, max, n - 1));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val[] = new int[]{60, 100, 120}; 
        int wt[] = new int[]{10, 20, 30}; 
        int  W = 50; 
        int n = val.length; 
        System.out.println(solution(wt, val, W, n));

	}

}
