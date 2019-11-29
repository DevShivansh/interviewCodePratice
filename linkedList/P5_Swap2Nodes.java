package linkedList;

public class P5_Swap2Nodes {
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			this.next = null;
		}
	}
	
	static Node head;
	
	@SuppressWarnings("unused")
	public static void swapNodes(int x, int y) {
		
		Node counter1 = head;
		Node counter2 = head;
		
		Node prev1 = null;
		Node prev2 = null;
		Node temp = null;
		
		while(counter1!=null && counter1.data!=x) {
			prev1 = counter1;
			counter1 = counter1.next;
		}
		
		while(counter2!=null && counter2.data!=y) {
			prev2 = counter2;
			counter2 = counter2.next;
		}
		
		if(prev1 == null) {
			temp = counter2;
			counter2.next = counter1.next;
			counter1.next = temp.next;
			prev2.next = counter1;
			return;
			
		}
		
		else if(prev2 == null) {
			temp = counter1;
			counter1.next = counter2.next;
			counter2.next = temp.next;
			prev1.next = counter2;
			return;
		}
		else {
			
			prev1.next = counter2;
			prev2.next = counter1;
			
			temp = 	counter1.next;
			counter1.next = counter2.next;
			counter2.next = temp;
		
		}
		
		
	}
	
	public static void swapNodes2(int x, int y) {
		
		Node node1 = head;
		Node node2 = head;
		
		Node prev1 = null;
		
		while(node1 != null && node1.data != x) {
			
			prev1 = node1;
			node1 = node1.next;
			
		}
		
		Node prev2 = null;
		
		while(node2 != null && node2.data != y) {
			
			prev2 = node2;
			node2 = node2.next;
			
		}
		
		
		if(prev1 != null)
			prev1.next = node2;
		else
			head = node2;
		
		if(prev2 != null)
			prev2.next = node1;
		else head = node1;
		
		Node temp = node1.next;
		node1.next = node2.next;
		node2.next = temp;
		
		
		
	}
	
	public static void reverse() {
		
		Node prev = null;
		Node next = null;
		Node current = head;
		
		while(current!=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	
	
	public static void reverse2() {
		
		
		Node current = head;
		Node prev = null;
		Node next = null;
		
		while(current!=null) {
			
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			
		}
		head = prev;
		
	}
	
	
	
	
	public static void push(int new_data) 
    { 
		
		if(head == null) {
			head = new Node(new_data);
			return;
		}
		
        /* 1. alloc the Node and put the data */
        Node new_Node = new Node(new_data); 
  
        /* 2. Make next of new Node as head */
        new_Node.next = head; 
  
        /* 3. Move the head to point to new Node */
        head = new_Node; 
    } 
  
    /* This function prints contents of linked list starting 
       from the given Node */
    public static void printList() 
    { 
        Node tNode = head; 
        while (tNode != null) 
        { 
            System.out.print(tNode.data+" "); 
            tNode = tNode.next; 
        } 
    } 
    
    
	
	public  static void findPrevAndCurrent(Node counter, Node prev, int x) {
		while(counter!=null && counter.data!=x) {
			prev = counter;
			counter = counter.next;
		}
	}

	public static Node mergeList(Node list1, Node list2) {
		Node newList = null;
		
		if(list1 == null)
			return list2;
		else if(list2 == null)
			return list1;
		
		if(list1.data < list2.data) {
			newList = new Node(list1.data);
			list1 = list1.next;
		}else {
			newList = new Node(list2.data);
			list2 = list2.next;
		}
		Node list = newList;
		
		
		while(list1 != null && list2!=null) {
			if(list1.data < list2.data) {
				newList.next = new Node(list1.data);
				list1 = list1.next;
			}else {
				newList.next = new Node(list2.data);
				list2 = list2.next;
			}
			newList = newList.next;
		}
		
		while(list1!=null) {
			newList.next = new Node(list1.data);
			list1 = list1.next;
			newList = newList.next;
		}
		
		while(list2!=null) {
			newList.next = new Node(list2.data);
			list2 = list2.next;
			newList = newList.next;
		}
		
		return list;
	}
	
	
	public static Node mergeList2(Node head1, Node head2) {
		
		Node temp1 = head1;
		Node temp2 = head2;
		Node newList = null;
		
		if(temp1.data < temp2.data) {
			newList = new Node(temp1.data);
			temp1 = temp1.next;
		}else {
			newList = new Node(temp2.data);
			temp2 = temp2.next;
		}
		
		Node tempList = newList;
		
		while(temp1 != null && temp2 != null) {
			
			if(temp1.data < temp2.data) {
				tempList.next = new Node(temp1.data);
				temp1 = temp1.next;
			}else {
				tempList = new Node(temp2.data);
				temp2 = temp2.next;
			}
			tempList = tempList.next;
			
		}
		
		while(temp1 != null) {
			tempList.next = new Node(temp1.data);
			temp1 = temp1.next;
		}
		
		while(temp2 != null) {
			tempList = new Node(temp2.data);
			temp2 = temp2.next;
		}
		
		return newList;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(7); 
		push(6); 
		push(5); 
		push(4); 
		push(3); 
		push(2); 
		push(1); 
		
		 System.out.print("\n Linked list before calling swapNodes() "); 
	        printList(); 
	  
	        //reverse();
	        swapNodes2(4, 3); 
	  
	        System.out.print("\n Linked list after calling swapNodes() "); 
	        printList(); 
		
	    /*Node list1 = new Node(5);
		list1.next = new Node(10);
		list1.next.next = new Node(15);
		
		Node list2 = new Node(2);
		list2.next = new Node(3);
		list2.next.next = new Node(20);
		
		Node mergedList = mergeList(list1, list2);
		head = mergedList;
		printList(); */
		

	}

}

