package Week4;

public class Reorder_List {
	
//	https://leetcode.com/problems/reorder-list/description/
	
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode() {}
		 ListNode(int val) { this.val = val; }
		 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow.next;
        slow.next=null;
        ListNode prev=null;
        ListNode curr=mid;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        ListNode l1=head;
        ListNode l2=prev;
        while(l2!=null){
            ListNode temp1=l1.next;
            ListNode temp2=l2.next;
            l1.next=l2;
            l2.next=temp1;
            l1=temp1;
            l2=temp2;
        }
    }
}
