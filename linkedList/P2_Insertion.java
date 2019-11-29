package linkedList;


public class P2_Insertion {

	private static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
		}
	}
	
	private static void traverse(Node root) {
		
		if(root == null)
			return;
		Node temp = root;
		
		System.out.print("LIST:");
		while(temp!=null) {
			System.out.print("\t->" + temp.data );
			temp = temp.next;
		}
		System.out.println();
		
	}
	
	private static void push(Node head, int data) {
		
		Node first = head;
		Node temp = new Node(data);
		temp.next = first;
		head = temp;
	}
	
	private static void append(Node head, int data) {
		if(head== null) {
			head = new Node(data);
			return;
		}
		
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		Node temp = new Node(data);
		temp.next = null;
		last.next = temp;
	}
	
	private static void insertAfter(Node node, int data) {
		
		if( node == null) {
			System.out.println("Previous node cannot be null");
			return;
		}
		
		Node temp = new Node(data);
		temp.next = node.next;
		node.next = temp;
		
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(6);
		push(head, 7);
		push(head, 1);
		append(head, 4);
		insertAfter(head.next, 8);
		traverse(head);
		
		
		
	}

}
