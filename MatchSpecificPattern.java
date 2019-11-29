package mustDo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatchSpecificPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> dict = new ArrayList<String>(Arrays.asList("abb","abc","nyz", "xyy")); 
		String pattern = "foo";
		System.out.println(findMatchedWords(dict, pattern));

	}
	
	public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern)
	{
		ArrayList<String> result = new ArrayList<String>();
		final String pat = pattern.toLowerCase();
		dict = getFilteredList(dict, pat); 
		if(dict.size()==0)
			return result;
		
		List<Integer> patList = getPatternList(pat);
		for(String str : dict) {
			List<Integer> tempList = getPatternList(str);
			if(compareLists(patList,tempList))
				result.add(str);
		}
		
	    return result;
	}
	
	private static ArrayList<String> getFilteredList(ArrayList<String> dict, String pat) {
		ArrayList<String> filteredList = new ArrayList<String>();
		for(String str : dict) {
			if(str.length() == pat.length())
				filteredList.add(str.toLowerCase());
		} 
		return filteredList;
	}

	private static boolean compareLists(List<Integer> patList, List<Integer> tempList) {
		for(int i=0;i<patList.size();i++) {
			if(patList.get(i)!=tempList.get(i))
				return false;
		}
		return true;
	}
	
	public static List<Integer> getPatternList(String pattern){
		int[] hash = new int[26];
		char[] patArr = pattern.toCharArray();
		for(Character c : patArr) {
			hash[c - 'a']++;
		}
		List<Integer> countList = new ArrayList<Integer>();
		for(Character c : patArr) {
			Integer val = hash[c - 'a'];
			countList.add(val);
		}
		
		return countList;
	}




}
