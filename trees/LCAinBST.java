package trees;

public class LCAinBST {
	
	
	public static int LCA(Node<Integer> root, int n1, int n2) {
		
		if(root == null)
			return -1;
		
		if(root.data < n1 && root.data < n2)
			return LCA(root.right, n1, n2);
		
		if(root.data > n1 && root.data > n2)
			return LCA(root.left, n1, n2);
		
		return root.data;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
