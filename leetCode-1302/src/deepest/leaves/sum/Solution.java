package deepest.leaves.sum;

public class Solution {

	public static void main(String[] args) {
		/* Given the root of a binary tree, 
		 * return the sum of values of its deepest leaves.
		 */
		
		Solution solution = new Solution();
		
		// case 1
		// Input: root = [1,2,3]
		// Output: 5
//		System.out.println(solution.deepestLeavesSum(new TreeNode(1, // level 0
//				new TreeNode(2),
//				new TreeNode(3))));
		
		// case 2
		// Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
		// Output: 15
		System.out.println(solution.deepestLeavesSum(new TreeNode(1, // level 0
						new TreeNode(2, // level 1
								new TreeNode(4, // level 2
										new TreeNode(7), null), // level 3
								new TreeNode(5, null, null)), // level 2
						new TreeNode(3, // level 1
								null, new TreeNode(6, // level 2
										null, new TreeNode(8)) // level 3
								)))); // sum level 3 values = 7 + 8
	}
	
	
	// Ver1
	// Approach : 각 트리의 레벨별로 합산을 더한다. 어떤 순서로 트리를 이동해야하는가?
	//            트리의 왼쪽을 기준으로 recursive를 진행한다.
	// RESULT
	// Runtime: 0 ms, faster than 100.00%
	// Memory Usage: 40.7 MB, less than 54.70%
	
	// 최고 레벨을 저장, 현재레벨과 비교를 위함
	int deepestLevel = 0;
	// 최고레벨의 값들을 합산하기 위한 변수
	int result = 0;
	
	public int deepestLeavesSum(TreeNode root) {
		
        if( root == null){
        	return 0;
        }
        sumSameLevel(0, root);
        
        return result;
    }
	
	// recursive를 이용하여 동일메소드 반복 실행.
	private void sumSameLevel(int level, TreeNode node) {
		
		// recursice 종결문
		if(node == null) {
			return;
		}
		
		// 최고레벨 발견 -> 초기화
    	if(level > deepestLevel) {
    		result = 0;
    		deepestLevel = level;
    	}
    	if(level == deepestLevel) {
    		result = result + node.val;
    	}
    	
    	sumSameLevel(level+1, node.left); // 재귀함수를 통해 결국 왼쪽방향으로 다음 레벨을 진행
    	sumSameLevel(level+1, node.right); // 왼쪽방향이 지난후 부모레벨에서 오른쪽 레벨을 진행
	}
}
