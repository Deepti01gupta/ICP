package Week4;

public class Merge_Two_Sorted_Lists {
	
//	https://leetcode.com/problems/merge-two-sorted-lists/
	
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode() {}
		 ListNode(int val) { this.val = val; }
		 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr=new ListNode();
        ListNode dummy=curr;
        ListNode head1=list1;
        ListNode head2=list2;
        while(head1!=null && head2!=null) {
        	if(head1.val<head2.val) {
        		curr.next=head1;
        		curr=curr.next;
        		head1=head1.next;
        	}
        	else {
        		curr.next=head2;
        		curr=curr.next;
        		head2=head2.next;
        	}
        }
        if(head1!=null) {
        	curr.next=head1;
        }
        if(head2!=null) {
        	curr.next=head2;
        }
        return dummy.next;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
