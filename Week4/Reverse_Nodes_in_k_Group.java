package Week4;

public class Reverse_Nodes_in_k_Group {
	
//	https://leetcode.com/problems/reverse-nodes-in-k-group/
	
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode() {}
		 ListNode(int val) { this.val = val; }
		 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public ListNode reverseKGroup(ListNode head, int k) {
        ListNode pre=null, curr=head;
        int count=0;
        ListNode temp=head;
        for(int i=0; i<k;  i++){
            if(temp==null) return head;
            temp=temp.next;
        }

        while(count<k && curr!=null){
            ListNode nextnode=curr.next;
            curr.next=pre;
            pre=curr;
            curr=nextnode;
            count++;
        }
        if(curr!=null){
            head.next=reverseKGroup(curr,k);
        }
        return pre;
    }

}
