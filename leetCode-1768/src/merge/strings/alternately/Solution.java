package merge.strings.alternately;

public class Solution {

	public static void main(String[] args) {
		/*
		 * You are given two strings word1 and word2. 
		 * Merge the strings by adding letters in alternating order, 
		 * starting with word1. If a string is longer than the other, 
		 * append the additional letters onto the end of the merged string.
		 * Return the merged string.
		 * */
		
		// case 1 
		// Input: word1 = "abc", word2 = "pqr"
		// Output: "apbqcr"
		Solution solution = new Solution();
		System.out.println(solution.mergeAlternately(new String("abc"), new String("pqr")));
	}
	
	// Ver1
	// Approach : 두 문자열 중 작은 길이를 구하고 그 수만큼 word1의 문자와 word2의 문자를 하나씩 더한다.
	// 			  그 다음, 두 문자열 중 긴 문자열을 찾아 마지막에 붙여준다.
	public String mergeAlternately(String word1, String word2) {
        
		String result = "";
		int minLength = Math.min(word1.length(), word2.length());
		
		for(int i = 0; i < minLength; i++) {
			result.concat("" + word1.charAt(i));
			System.out.println(result);
		}
		
		if(word1.length() > word2.length()) {
			result.concat(word1.substring(minLength));
		}else {
			result.concat(word2.substring(minLength));
		}
		
		return result;
    }
}
