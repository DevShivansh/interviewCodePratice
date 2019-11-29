package mustDo;


public class IsBst {

	private static class Node{
		int data;
		Node left;
		Node right;
		
		
		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}
	
	private static boolean isBST(Node root) {
		
		return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	private static boolean isBSTUtil(Node root, int minValue, int maxValue) {
		
		if(root == null)
			return true;
		
		if( root.data < minValue || root.data > maxValue)
			return false;
		
		return ( isBSTUtil(root.left, minValue, root.data) && isBSTUtil(root.right, root.data, maxValue));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(4);
		root.left = new Node(2);
		root.right = new Node(5);
		root.left.left = new Node(1);
		root.left.right = new Node(9);
		System.out.println(isBST(root));

	}

}
