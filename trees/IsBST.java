package trees;


public class IsBST {
	
	
	public boolean isBST(Node<Integer> root, int min, int max) {
		
		if(root == null)
			return true;
		
		if( root.data < min || root.data > max)
			return false;
		
		return isBST(root.left, min, root.data) && isBST(root.right, root.data, max); 
			
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node<Integer> root = new Node<Integer>(1);

	}

}
