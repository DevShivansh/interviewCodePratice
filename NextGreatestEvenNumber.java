package mustDo;

public class NextGreatestEvenNumber {
	
	
	private static int getEvenNumberIndex(Long number) {
		int n = number.toString().length();
		int index = -1;
		int count = 0;
		
		while( n > -1 ) {
			count++;
			int rem = (int) (number % 10);
			number/=10;
			if(rem % 2 == 0) {
				index = n - count;
				break;
			}
			
		}
		
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = 34722641; //34724126 / 2641  
		System.out.println(getEvenNumberIndex(num));

	}

}
