package Week4;

public class Intersection_of_Two_Linked_Lists {

//	https://leetcode.com/problems/intersection-of-two-linked-lists/
	
	public class ListNode {
		int val;
	    ListNode next;
	    ListNode(int x) {
		    val = x;
		 	next = null;
		 }
	}
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode node1=headA;
	    ListNode node2=headB;        
	    while(node1!=node2) {
	    	if(node1==null) {
	        	node1=headB;
	        }
	       	if(node2==null) {
	       		node2=headA;
	       	}
	       	node1=node1.next;
	       	node2=node2.next;
	    }
	    return node1;
	}
}
