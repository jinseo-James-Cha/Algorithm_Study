package remove.duplicates.from.sortedList;

public class Solution {

	public static void main(String[] args) {
		/* Given the head of a sorted linked list, 
		 * delete all duplicates such that each element appears only once. 
		 * Return the linked list sorted as well.
		 */
		
		Solution solution = new Solution();
		
		// case 1
		System.out.println(solution.deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2)))));
	}
	
	// Ver 1
	// Approach : LinkedList를 순차적으로 탐색, 현재값이 다음값과 같다면
	//            다음 Node는 다다음으로 설정한다.(중간 노드를 skip함)
	// RESULT
	// Runtime: 0 ms, faster than 100.00%
	// Memory Usage: 38.4 MB, less than 48.85%
	public ListNode deleteDuplicates(ListNode head) {
        
		ListNode temp = head;
		
		while(temp != null) {
			
			if(temp.next == null) {
				break;
			}
			
			if(temp.val == temp.next.val) {
				temp.next = temp.next.next;
			}else {
				temp = temp.next;
			}
		}
		
		return head;
    }
}


 