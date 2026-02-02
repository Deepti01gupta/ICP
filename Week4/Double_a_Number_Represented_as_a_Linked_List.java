package Week4;

public class Double_a_Number_Represented_as_a_Linked_List {

//	https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/
	
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode() {}
		 ListNode(int val) { this.val = val; }
		 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public ListNode doubleIt(ListNode head) {
        ListNode newhead=rev(head);
        ListNode dummy=new ListNode(-1);
        ListNode ans=dummy;
        int carry=0;

        while(newhead!=null){
            int sum=newhead.val + newhead.val + carry;
            int d=sum%10;
            carry=sum/10;

            ListNode temp=new ListNode(d);
            dummy.next=temp;
            dummy=dummy.next;
            newhead=newhead.next;
        }
        if(carry>0){
            ListNode temp=new ListNode(carry);
            dummy.next=temp;
        }

        ListNode res=rev(ans.next);

        return res;   
    }
    public ListNode rev(ListNode head){
        if(head==null || head.next==null){
            return head;
        }

        ListNode pre=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=pre;
            pre=curr;
            curr=temp;
        }
        return pre;
    }
	
}
