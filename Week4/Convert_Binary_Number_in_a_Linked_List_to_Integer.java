package Week4;

public class Convert_Binary_Number_in_a_Linked_List_to_Integer {
	
//	https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/

	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode() {}
		 ListNode(int val) { this.val = val; }
		 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public int getDecimalValue(ListNode head) {
        int ans=0;
        while(head!=null){
            int v=head.val;
            ans=(ans*2+v);
            head=head.next;
        }

        return ans;
        
    }
	
}
