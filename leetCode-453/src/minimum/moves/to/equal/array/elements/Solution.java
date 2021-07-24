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
		System.out.println(s.minMoves(new int[] {1,1,1}));
	}
	
	// Ver.2
	// Runtime : 1 ms    100%
	// Memory  : 39.1 MB 93.54%
	// Learned : 반드시 예제를 따라가면서 로직을 생각할 필요없다. 내가 생각해낸 방식이 답으로 연결된다면 그 코드를 사용하자.
	public int minMoves(int[] nums) {
		int min = nums[0];
		for(int i = 1; i < nums.length; i++) {
			if(min > nums[i]) {
				min = nums[i];
			}
		}
		int result = 0;
		for(int i = 0; i < nums.length; i++) {
			result += nums[i] - min;
		}
		return result;
	}
	
	// Ver.1
	// problem occurred : Time Limit Exceeded [1, 100000000]
//	public int minMoves(int[] nums) {
//		
//		int count = 0;
//		
//		while(true) {
//			
//			int max = nums[0];
//			int maxIndex = 0;
//			boolean flag = false;
//			
//			for(int i = 1; i < nums.length; i++) {
//				if(max < nums[i]) {
//					max = nums[i];
//					maxIndex = i;
//					flag = true;
//				} 
//			}
//
//			for(int i = 0; i < nums.length; i++) {
//				if(i != maxIndex) {
//					nums[i]++;
//				}
//			}
//			
////			for(int i = 0; i < nums.length; i++) {
////				System.out.print(nums[i]);
////			}
////			System.out.println();
//			
//			if(flag) {
//				count++;
//			} else {
//				break;
//			}
//		}
//		
//		return count;
//    }
}
