package linkedList;


public class P7_ReverseInSetOfK {

	private static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	
	public static Node reverse(Node head, int k) {
		
		Node current = head;
		Node next = null;
		Node prev = null;
		
		int count = 0;
		
		while(current != null && count < k) {
			count++;
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			
		}
		
		if(next != null) {
			head.next = reverse(next, k);
		}
		return prev;
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
		// 7 5 9 4 6
		Node node1 = new Node(7);
		node1.next = new Node(5);
		node1.next.next = new Node(9);
		node1.next.next.next = new Node(4);
		node1.next.next.next.next = new Node(6);

		printNode(node1);
		Node rev = reverse(node1, 2);
		printNode(rev);

	}

}
