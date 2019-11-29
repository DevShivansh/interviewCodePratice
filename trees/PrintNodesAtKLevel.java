package trees;


public class PrintNodesAtKLevel {

	
	private static class Node{
		int data;
		Node left, right = null;
		
		public Node(int i) {
			// TODO Auto-generated constructor stub
			this.data = i;
			left = right = null;
		}
		
	}
	
	public static void printAtKLevel(Node root, int i, int x) {
		
		if(root == null)
			return;
		
		if(i == x)
			System.out.print(root.data + " ");
		i++;
		printAtKLevel(root.left, i, x);
		printAtKLevel(root.right, i, x );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		printAtKLevel(root, 0, 2);

	}

}
