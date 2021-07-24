package minimum.moves.to.equal.array.elements;

import java.util.HashSet;
import java.util.Set;

/* https://leetcode.com/problems/minimum-moves-to-equal-array-elements */

public class Solution {

	public static void main(String[] args) {
		/*
		 * Given an integer array nums of size n, 
		 * return the minimum number of moves required to make all array elements equal.
         * In one move, you can increment n - 1 elements of the array by 1.
         * 
		 * */
		
		/*
		 * n == nums.length
		 * 1 <= nums.length <= 104
         * -109 <= nums[i] <= 109
		 * */
		
		Solution s = new Solution();
		/*
		 * case 1
		 * Input: nums = [1,2,3]
         * Output: 3
         * Explanation: Only three moves are needed (remember each move increments two elements):
         * [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
         * 
		 * */
		System.out.println(s.minMoves(new int[] {1,2,3}));
		
		/*
		 * case 2
		 * Input: nums = [1,1,1]
         * Output: 0
		 * */
//		System.out.println(s.minMoves(new int[] {1,1,1}));
	}
	
	public int minMoves(int[] nums) {
		
		int count = 0;
		
		while(true) {
			
			int max = nums[0];
			int maxIndex = 0;
			
			for(int i = 1; i < nums.length; i++) {
				if(max < nums[i]) {
					maxIndex = i;
				} 
			}
			
			for(int i = 0; i < nums.length; i++) {
				if(i != maxIndex) {
					nums[i]++;
					
				}
			}
		}
        
    }
}
