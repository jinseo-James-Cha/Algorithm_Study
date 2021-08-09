package two.sum;

public class Solution {

	/*
	 *  Given an array of integers nums and an integer target, 
	    return indices of the two numbers such that they add up to target.

		You may assume that each input would have exactly one solution
		, and you may not use the same element twice.
		
		You can return the answer in any order.
		
		 
		
		Example 1:
		
		Input: nums = [2,7,11,15], target = 9
		Output: [0,1]
		Output: Because nums[0] + nums[1] == 9, we return [0, 1].
		Example 2:
		
		Input: nums = [3,2,4], target = 6
		Output: [1,2]
		Example 3:
		
		Input: nums = [3,3], target = 6
		Output: [0,1]
	 * 
	 */
	public static void main(String[] args) {
		Solution s = new Solution();
		
		// EXAMPLE 1
		int[] result1 = s.twoSum(new int[]{2,7,11,15}, 9);
		for(int num : result1)
			System.out.println(num);
		
		// EXAMPLE 2
		int[] result2 = s.twoSum(new int[]{3,2,4}, 6);
		for(int num : result2)
			System.out.println(num);
		
		// EXAMPLE 3
		int[] result3 = s.twoSum(new int[]{3,3}, 6);
		for(int num : result3)
			System.out.println(num);
		
	}
	
	// ver 2
	// Approach : need to make Runtime faster. trying to make some conditions in loop
	// Runtime: 
	// Memory Usage: 
	public int[] twoSum(int[] nums, int target) {
        
        for(int i = 0; i < nums.length - 1; i++) {
        	for(int j = i + 1; j < nums.length; j++) {
        		if(nums[i] + nums[j] == target) {
        			return new int[] {i,j};
        		}
        	}
        }
        
        return null;
    }	
	
	
	
//	// ver1
//	// Runtime: 43 ms, 39.87%
//	// Memory Usage: 39 MB, 85.76%
//	public int[] twoSum(int[] nums, int target) {
//        int[] result = new int[2];
//        
//        for(int i = 0; i < nums.length - 1; i++) {
//        	for(int j = i + 1; j < nums.length; j++) {
//        		if(nums[i] + nums[j] == target) {
//        			result[0] = i;
//        			result[1] = j;
//        			break;
//        		}
//        	}
//        }
//        
//        return result;
//    }
}
