package Week4;

public class Reverse_Linked_List {
	
//	https://leetcode.com/problems/reverse-linked-list/description/
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode() {}
		 ListNode(int val) { this.val = val; }
		 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null) {
        	ListNode ahead=curr.next;
        	curr.next=prev;
        	prev=curr;
        	curr=ahead;
        }
        return prev;
    }
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
	}

}
