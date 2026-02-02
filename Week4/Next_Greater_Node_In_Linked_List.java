package Week4;

import java.util.*;

public class Next_Greater_Node_In_Linked_List {
	
//	https://leetcode.com/problems/next-greater-node-in-linked-list/
	
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode() {}
		 ListNode(int val) { this.val = val; }
		 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public int size(ListNode head){
        int c=0;
        ListNode curr=head;
        while(curr!=null){
            c++;
            curr=curr.next;
        }
        return c;
    }

    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode pre=null;

        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=pre;
            pre=curr;
            curr=temp;
        }
        return pre;
    }
    public int[] nextLargerNodes(ListNode head) {
        int n=size(head);
        ListNode newhead=reverse(head);
        int[] arr=new int[n];

        Stack<Integer> st=new Stack<>();
        st.push(newhead.val);

        ListNode curr=newhead.next;
        int ptr=n-2;

        while(ptr>=0){
            int ele=curr.val;
            curr=curr.next;

            // check and pop
            while(st.size()>0 && st.peek()<=ele){
                st.pop();
            }

            //put in array
            if(st.size()==0){
                arr[ptr]=0;
            }
            else{
                arr[ptr]=st.peek();
            }
            
            // push ele in stack
            st.push(ele);
            ptr--;;
        }
        return arr;
    }

}
