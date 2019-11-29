package mustDo;

public class PrintValidWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Dict[] = {"go", "bat", "me", "eat", 
                "goal", "boy", "run"} ; 
		
		char arr[] = {'e', 'o', 'b', 'a', 'm', 'g', 'l'} ; 
		
		int[] hash = new int[26];
		
		for(int i = 0; i < arr.length;i++)
			hash[arr[i] - 'a']++;
		
		for(String str : Dict) {
			
			char[] tempArr = str.toCharArray();
			boolean flag = true;
			for(Character c : tempArr) {
				
				if(hash[c - 'a'] == 0) {
					flag = false;
					break;
				}
					
			}
			if(flag)
				System.out.println(str);
			
		}

	}

}
