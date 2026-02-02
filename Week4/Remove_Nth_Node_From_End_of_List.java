package Week4;

public class Remove_Nth_Node_From_End_of_List {

//	https://leetcode.com/problems/remove-nth-node-from-end-of-list/
	
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode() {}
		 ListNode(int val) { this.val = val; }
		 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }

        // size
        int size=0;
        ListNode c=head;
        while(c != null){
            c=c.next;
            size++;
        }

        if(n == size){
            return head.next;
        }

        ListNode prev = head;
        int i = 1;
        int index = size-n;
        while(i < index){
            prev=prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
	
}
