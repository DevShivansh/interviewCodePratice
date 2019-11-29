package linkedList;

public class P9_RotateLLByK {
	
	private static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public static void printNode(Node head) {

		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();

	}
	
	
	public static Node rotate(Node head, int k) {
		
		Node rotateHead = head;
		Node temp = head;
		
		int count = 0;
		Node prev = null;
		while(temp!=null && count < k) {
			count++;
			prev = temp;
			temp = temp.next;
		}
		
		prev.next = null;
		head = temp;
		
		temp = head;
		
		while(temp.next!=null)
			temp = temp.next;
		
		temp.next = rotateHead;
		
		
		return head;
	}

	public static void main(String[] args) {
		// 7 5 9 4 6
		Node node1 = new Node(7);
		node1.next = new Node(5);
		node1.next.next = new Node(9);
		node1.next.next.next = new Node(4);
		node1.next.next.next.next = new Node(6);

		printNode(node1);
		Node rev = rotate(node1, 3);
		printNode(rev);

	}

}
