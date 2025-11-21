package DAY_12;

public class Partition_List {
	
//	https://leetcode.com/problems/partition-list/
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

	public ListNode partition(ListNode head, int x) {
        ListNode leftside=new ListNode(0);
        ListNode rightside=new ListNode(0);

        ListNode left=leftside;
        ListNode right=rightside;
        while(head!=null){
            if(head.val<x){
                left.next=head;
                left=left.next;
            }
            else{
                right.next=head;
                right=right.next;
            }
            head=head.next;
        }
        right.next=null;
        left.next=rightside.next;;
        return leftside.next;

    }
	
}
