package linkedList;

public class P6_AddTwoNumRepByLL {
	
	 private static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	public static Node addTwoNumbers(Node node1, Node node2) {
		
		if(node1 == null)
			return node2;
		
		if(node2 == null)
			return node1;
		
		int sum = node1.data + node2.data;
		int carry = sum > 9 ? 1 : 0;
		sum = sum % 10;
		Node temp = new Node(sum);
		Node res = temp;
		node1 = node1.next;
		node2 = node2.next;
		
		while(node1 != null || node2 != null) {
			
			sum = carry + (node1 != null ? node1.data : 0) + (node2 != null ? node2.data : 0);
			carry = sum > 9 ? 1 : 0;
			sum = sum % 10;
			temp.next = new Node(sum);
			temp = temp.next;
			
			if(node1 != null)
				node1 = node1.next;
			
			if(node2 != null)
				node2 = node2.next;
		}
		
		if( carry == 1)
			temp = new Node(carry);
		
		return res;
		
		
				
	}
	
	public static void printNode(Node head) {
		
		Node temp = head;
		
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		//7 5 9 4 6
		Node node1 = new Node(7);
		node1.next = new Node(5);
		node1.next.next = new Node(9);
		node1.next.next.next = new Node(4);
		node1.next.next.next.next = new Node(6);
		
		printNode(node1);
		
		//8 6
		Node node2 = new Node(8);
		node2.next = new Node(4);
		
		printNode(node2);;
		
		Node res = addTwoNumbers(node1, node2);
		
		printNode(res);
		
		
	}

}
