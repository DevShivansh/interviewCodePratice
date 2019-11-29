package mustDo;

public class DiameterOfBinaryTree2 {
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		
		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}
	
	
	public static int diameter(Node root) {
		
		if(root == null)
			return 0;
		
		int lH = height(root.left);
		int rH = height(root.right);
		
		int lD = diameter(root.left);
		int rD = diameter(root.right);
		
		return Math.max((lH + rH + 1), Math.max(lD, rD));
		
	}
	
	
	
	public static int height(Node root) {
		
		if(root == null )
			return 0;
		
		int lHeight = height(root.left);
		int rHeight = height(root.right);
		
		return 1 + Math.max(lHeight, rHeight);
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		System.out.println(height(root));
	}

}
