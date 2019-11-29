package linkedList;


public class P3_Deletion {
	
	private static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
		}
	}
	
	static Node head;
	
	public static void deleteNode(int key) {
		
		if(head.data == key) {
			head = head.next;
			return;
		}
		
		Node temp = head;
		Node prev = null;
		
		while(temp!=null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		
		if(prev == null)
			return;
		
		prev.next = temp.next;
	}
	
	
	public static void push(int data) {
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
	}
	
	
	public static void printList() {
		
		Node temp = head;
		System.out.print("LIST :");
		while(temp!=null) {
			System.out.print("\t->" + temp.data);
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		push(7);
		push(1);
		push(3);
		push(2);
		printList();
		
		deleteNode(1);
		printList();

	}

}
