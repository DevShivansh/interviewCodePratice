package mustDo;

import mustDo.SortLLOf1s2s3s.Node;

public class Merge2SortedLL {
	
	static class Node
	    {
	        int data;
	        Node next;
	        Node(int d) {data = d; next = null; }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Merge2SortedLL demo = new Merge2SortedLL();
		Node list1 = new Node(5);
		list1.next = new Node(10);
		list1.next.next = new Node(15);
		list1.next.next.next = new Node(40);
		
		demo.traverse(list1);
		
		Node list2 = new Node(2);
		list2.next = new Node(3);
		list2.next.next = new Node(20);
		
		demo.traverse(list2);
		
		Node head = demo.sortedMerge(list1, list2);
		demo.traverse(head);

	}
	
	void traverse(Node head) {
		Node temp = head;
		
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
			
		System.out.println();
	}

	Node sortedMerge(Node headA, Node headB) {
	     if(headA == null)
	    	 return headB;
	     
	     if(headB== null)
	    	 return headA;
	     
	     Node newHead = null;
	     Node temp = null;
	     
	     while(headA!=null && headB!=null) {
	    	 
	    	 if(temp == null && newHead == null) {
	    		 if(headA.data <= headB.data) {
		    		temp = new Node(headA.data); 
		    		headA = headA.next;
		    	 }else {
		    		 temp = new Node(headB.data);
		    		 headB = headB.next;
		    	 }
	    		 newHead = temp;
	    	 }else {
	    		 
	    		 if(headA.data <= headB.data) {
			    		temp.next = new Node(headA.data); 
			    		headA = headA.next;
			    	 }else {
			    		 temp.next = new Node(headB.data);
			    		 headB = headB.next;
			    	 }
	    		 temp = temp.next;
	    		 
	    	 }
	    	 
	     }
	     
	     if(headA!=null) {
	    	 while(headA!=null) {
	    		 temp.next = new Node(headA.data);
	    		 headA = headA.next;
	    		 temp = temp.next;
	    	 }
	     }
	     
	     if(headB!=null) {
	    	 while(headB!=null) {
	    		 temp.next = new Node(headB.data);
	    		 headB = headB.next;
	    		 temp = temp.next;
	    	 }
	     }
	     
	     return newHead;
	    		 
	} 
}
