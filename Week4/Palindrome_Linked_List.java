package Week4;

public class Palindrome_Linked_List {
	
//	https://leetcode.com/problems/palindrome-linked-list/description/
	
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode() {}
		 ListNode(int val) { this.val = val; }
		 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    public ListNode findmiddle(ListNode head){
        ListNode hare = head;
        ListNode turtle = head;

        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }


    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }   
        ListNode middle = findmiddle(head); // last half ka end
        ListNode secondhalfstart= reverse(middle.next);

        ListNode firsthalfstart = head;
        while(secondhalfstart != null){
            if(firsthalfstart.val != secondhalfstart.val){
                return false;
            }
            firsthalfstart = firsthalfstart.next;
            secondhalfstart = secondhalfstart.next;
        }
        return true;
    }

}
