package Week4;

public class Copy_List_with_Random_Pointer {

	class Node {
	    int val;
	    Node next;
	    Node random;

	    public Node(int val) {
	        this.val = val;
	        this.next = null;
	        this.random = null;
	    }
	}
	
	public Node copyRandomList(Node head) {

        if(head==null){
            return null;
        }
        // 1. Insert copy nodes in between
        insertCopyInBetween(head);

        // 2. Connect random pointers
        connectRandomPointer(head);
        // 3. Conncet next pointer
        return getDeepCopyList(head);
        
    }
    public void insertCopyInBetween(Node head){
        Node temp=head;
        while(temp!=null){
            Node next_element=temp.next;
            Node copy=new Node(temp.val);
            copy.next=next_element;
            temp.next=copy;
            temp=next_element;
        }
    }

    public void connectRandomPointer(Node head){
        Node temp=head;
        while(temp!=null){
            Node copy_node=temp.next;
            if(temp.random!=null){
                copy_node.random=temp.random.next;
            }
            else{
                copy_node.random=null;
            }
            
            temp=temp.next.next;
        }
    }

    public Node getDeepCopyList(Node head){
        Node dummy =new Node(-1);
        Node temp=head;
        Node res=dummy;
        while(temp!=null){
            res.next=temp.next;
            res=res.next;
            temp.next=temp.next.next;
            temp=temp.next;
        }
        return dummy.next;
    }
    
    
}
