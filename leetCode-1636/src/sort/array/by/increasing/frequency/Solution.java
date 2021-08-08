package sort.array.by.increasing.frequency;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	/*
	 *  Given an array of integers nums, 
	 *  sort the array in increasing order based on the frequency of the values. 
	 *  If multiple values have the same frequency, sort them in decreasing order.

		Return the sorted array.
		
		 
		
		Example 1:
		
		Input: nums = [1,1,2,2,2,3]
		Output: [3,1,1,2,2,2]
		Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
		Example 2:
		
		Input: nums = [2,3,1,3,2]
		Output: [1,3,3,2,2]
		Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.
		Example 3:
		
		Input: nums = [-1,1,-6,4,5,-6,1,4,1]
		Output: [5,-1,4,4,-6,-6,1,1,1]
		 
		
		Constraints:
		
		1 <= nums.length <= 100
		-100 <= nums[i] <= 100
	 * */
	public static void main(String[] args) {
		Solution s = new Solution();
		
		for(int num : s.frequencySort(new int[] {1,1,2,2,2,3})) {
			System.out.println(num);
		}
	}
	
	public int[] frequencySort(int[] nums) {
//        List<Integer> sortedList = new ArrayList<>();

		Map<Integer, Integer> map = new HashMap<>();
		for(int num : nums) {
			if(map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}
		
		System.out.println(map);
		
        return null;
    }
}
