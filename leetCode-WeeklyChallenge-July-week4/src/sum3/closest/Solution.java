package sum3.closest;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Given an array nums of n integers and an integer target, 
		 * find three integers in nums such that the sum is closest to target. 
		 * Return the sum of the three integers. 
		 * You may assume that each input would have exactly one solution.
		 * */
		
		Solution solution = new Solution();
		
		// case 1
		// Input: nums = [-1,2,1,-4], target = 1
		// Output: 2
		// Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
//		System.out.println(solution.threeSumClosest(new int[]{-1,2,1,-4}, 1));
//		
//		// case 2
//		// Input: nums = [0,1,1], target = 2
//		// Output: 2
//		System.out.println(solution.threeSumClosest(new int[]{0,1,1}, 2));
//		
//		// case 3
//		// Input: nums = [1,1,1,1], target = 0
//		// Output: 3
//		System.out.println(solution.threeSumClosest(new int[]{1,1,1,1}, 0));
//		
//		// case 4
//		// Input: nums = [1,1,1,0], target = 100
//		// Output: 3
//		System.out.println(solution.threeSumClosest(new int[]{1,1,1,0}, 100));

		// case 4
		// Input: nums = [1,1,-1,-1,3], target = 3
		// Output: 3
		System.out.println(solution.threeSumClosest(new int[]{1,1,-1,-1,3}, 3));
		
	}
	
	// ver 1
	// Approach : 문제 해석 실패 -> 차례대로 3개의 숫자 조합이 아닌, array내에서의 3개의 조합이 타겟과 가장 가까운 수를 찾는
	public int threeSumClosest(int[] nums, int target) {
        
		int sum = 0;
		int index = 0;
		int gap = 0; // 3숫자의 합과 타겟의 차이, 절대값사용
		int closest = Math.abs((nums[0] + nums[1] + nums[2]) - target); // loop 안에서 비교로 사용될 gap중 타겟과 가장 가까운 gap
		
		if(nums.length == 3) {
			return nums[0] + nums[1] + nums[2];
		}
		
		while(index + 2 < nums.length) {
			int temp = 0;
			temp = nums[index] + nums[index+1] + nums[index+2];
			System.out.println("temp " + temp);
			gap = Math.abs(temp - target);
			System.out.println("gap " + gap);
			if(gap == 0) {
				sum = temp;
				break; 
			}
			if(gap <= closest) {
				closest = gap;
				sum = temp;
			}
			System.out.println("closest " + closest);
			index++;
		}
		
		return sum;
    }
}
