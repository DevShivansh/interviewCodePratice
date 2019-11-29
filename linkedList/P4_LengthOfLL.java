package linkedList;


public class P4_LengthOfLL {
	
	private static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			
		}
	}
	
	static Node head;
	
	public static int length() {
		
		Node temp = head;
		int count = 0;
		while(temp!=null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public static void push(int data) {
		
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
	}

	public static void main(String[] args) {
		push(1);
		push(2);
		push(3);
		push(4);
		System.out.println(length());
		push(5);
		System.out.println(length());
	}

}
