package Week4;

//import java.util.*;

public class Linked_List_Cycle {
	
//	https://leetcode.com/problems/linked-list-cycle/

	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode() {}
		 ListNode(int val) { this.val = val; }
		 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	
	public boolean hasCycle(ListNode head) {
        ListNode slow=head;
		ListNode fast=head;
		while(fast!=null && fast.next!=null) {
			if(slow==fast) {
				return true;
			}
			slow=slow.next;
			fast=fast.next.next;
		}
		return false;
    }
}
