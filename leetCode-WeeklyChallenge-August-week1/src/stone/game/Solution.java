package stone.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	
	/*
	 * Alex and Lee play a game with piles of stones.  
	 * There are an even number of piles arranged in a row, 
	 * and each pile has a positive integer number of stones piles[i].
	 * The objective of the game is to end with the most stones.  
	 * The total number of stones is odd, so there are no ties.
	 * Alex and Lee take turns, with Alex starting first. 
	 * Each turn, a player takes the entire pile of stones 
	 * from either the beginning or the end of the row.  
	 * This continues until there are no more piles left, 
	 * at which point the person with the most stones wins.
	 * 
	 * Assuming Alex and Lee play optimally, 
	 * return True if and only if Alex wins the game.
	 * */
	
	/*
	 * Constraints:
		
		2 <= piles.length <= 500
		piles.length is even.
		1 <= piles[i] <= 500
		sum(piles) is odd.
	 * */
	
	/*
	 * Example 1:

		Input: piles = [5,3,4,5]
		Output: true
		Explanation: 
		Alex starts first, and can only take the first 5 or the last 5.
		Say he takes the first 5, so that the row becomes [3, 4, 5].
		If Lee takes 3, then the board is [4, 5], and Alex takes 5 to win with 10 points.
		If Lee takes the last 5, then the board is [3, 4], and Alex takes 4 to win with 9 points.
		This demonstrated that taking the first 5 was a winning move for Alex, so we return true.
		 
	   Example 2:
	   input: piles = [3,7,2,3]
	   Output: true
	 * */

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.stoneGame(new int[] {5,3,4,5}));
	}
	
	// ver 2
	// Approach: 
	public boolean stoneGame(int[] piles) {
		 
		 int firstPerson = 0;
		 int secondPerson = 0;
		 
		 int start = 0;
		 int end = piles.length-1;
		 
		 for(int i = 0; i < piles.length; i++) {
			 if(piles[start] > piles[end]) {
				 if(i % 2 == 0) { 					// first player turn
					 firstPerson += piles[start];
				 } else { 							// second player turn
					 secondPerson += piles[start];
				 }
				 start++;
			 } else if(piles[start] < piles[end]) {
				 if(i % 2 == 0) { 
					 firstPerson += piles[end];
				 } else {
					 secondPerson += piles[end];
				 }
				 end--;
			 } else {
				 start++;
				 end--;
				 i++;
			 }
			 System.out.println("fff" + firstPerson);
			 System.out.println("sss" + secondPerson);
		 }
		 System.out.println("f" + firstPerson);
		 System.out.println("s" + secondPerson);
		 return (firstPerson > secondPerson) ? true : false;
	 }
	
	// ver 1
	// failed : wrong answer,  36 / 46 test cased passed
	//          need to pass [3,7,2,3]
//	 public boolean stoneGame(int[] piles) {
//	 
//		 /*
//		  * 문제 해석 : 두명의 플레이어가 각자의 번갈아가면서
//		  * 		  integer array에서 처음 혹은 끝의 정수를 가져갈 수 있다.
//		  * 문제 접근 : 양끝의 정수를 int값을 비교후 큰 값을 지워나간다. 어떻게 지우면 될까?
//		  * */
//	
//		 int firstPerson = 0;
//		 int secondPerson = 0;
//		 
//		 int start = 0;
//		 int end = piles.length-1;
//		 
//		 for(int i = 0; i < piles.length; i++) {
//			 if(piles[start] >= piles[end]) {
//				 if(i % 2 == 0) { // first player turn
//					 firstPerson += piles[start];
//				 } else {
//					 secondPerson += piles[start];
//				 }
//				 start++;
//			 } else {
//				 if(i % 2 == 0) { // second player turn
//					 firstPerson += piles[end];
//				 } else {
//					 secondPerson += piles[end];
//				 }
//				 end--;
//			 }
//		 }
//		 return (firstPerson > secondPerson) ? true : false;
//	 }
}
