package linkedList;

public class P1_Traversal {
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.next = new Node(2);
		root.next.next = new Node(3);
		root.next.next.next = new Node(4);
		
		traverse(root);
		traverse(root);

	}

}
