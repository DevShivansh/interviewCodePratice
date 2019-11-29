package mustDo;

public class SortLLOf1s2s3s {

	static class Node
	{
	    int data;
	    Node next;
	    Node(int data)
	    {
	        this.data = data;
	        next = null;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(2);
		head.next.next.next = new Node(1);
		head.next.next.next.next = new Node(0);
		traverse(head);
		head = segregate(head);
		traverse(head);

	}
	
	static void traverse(Node head) {
		Node temp = head;
		
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
			
		System.out.println();
	}

	static Node segregate(Node head)
    {
	
		Node list1 = null;
		Node list2 = null;
		Node list0 = null;
		
		Node temp0 = null;
		Node temp1 = null;
		Node temp2 = null;
	
		Node temp = head;
		
		while(temp!=null) {
			if(temp.data == 0) {
				if(list0 == null && temp0 == null) {
					list0 = new Node(0);
					temp0 = list0;
				}else {
					list0.next = new Node(0);
					list0 = list0.next;
				}
			}else if(temp.data == 1) {
				if(list1 == null && temp1 == null) {
					list1 = new Node(1);
					temp1 = list1;
				}else {
					list1.next = new Node(1);
					list1 = list1.next;
				}
				
			}else if(temp.data == 2) {
				if(list2 == null && temp2 == null) {
					list2 = new Node(2);
					temp2 = list2;
				}else {
					list2.next = new Node(2);
					list2 = list2.next;
				}
				
			}
			
			temp = temp.next;
		}
		if(temp0 != null) {
			head = temp0;
		}else if(temp1!=null)
			head = temp1;
		else if(temp2!=null)
			head = temp2;
		else
			return head;
		
		if(temp0 != null && temp1 != null) {
			list0.next = temp1;
		}else if(temp0 != null && temp2 != null)
			list0.next = temp2;
		
		if(temp1 != null && temp2 != null) {
			list1.next = temp2;
		}
		
		
		return head;
  
    }
}
