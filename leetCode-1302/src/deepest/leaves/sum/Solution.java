package deepest.leaves.sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		/* Given the root of a binary tree, 
		 * return the sum of values of its deepest leaves.
		 */
		
		Solution solution = new Solution();
		
		// case 1
		// Input: root = [1,2,3]
		// Output: 5
		System.out.println(solution.deepestLeavesSum(new TreeNode(1, // level 0
				new TreeNode(2),
				new TreeNode(3))));
		
		// case 2
		// Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
		// Output: 15
//		System.out.println(solution.deepestLeavesSum(new TreeNode(1, // level 0
//						new TreeNode(2, // level 1
//								new TreeNode(4, // level 2
//										new TreeNode(7), null), // level 3
//								new TreeNode(5, null, null)), // level 2
//						new TreeNode(3, // level 1
//								null, new TreeNode(6, // level 2
//										null, new TreeNode(8)) // level 3
//								)))); // sum level 3 values = 7 + 8
	}
	
	public int deepestLeavesSum(TreeNode root) {
		
        int level = 0;
        Map<Integer, Integer> resultMap = new HashMap<>();
        TreeNode list = root;
        
        while(list != null) {
        	
        	if(list.left != null) {
        		resultMap.put(level, list.left.val);
        	}
        	if(list.right != null) {
        		resultMap.put(level, resultMap.get(level) + list.right.val);
        	}
        	
        }
        
        return resultMap.get(level);
    }
	
}
