package trees;

import java.util.ArrayList;
import java.util.List;


public class PrintAncestorOfNode {
	
	private static class Node{
		int data;
		Node left, right = null;
		
		public Node(int i) {
			// TODO Auto-generated constructor stub
			this.data = i;
			left = right = null;
		}
		
	}
	
	public static boolean foundKey(Node root, int key, List<Integer> ancestors) {
		
		if(root == null)
			return false;
		
		if(root.data == key)
			return true;
		
		if(foundKey(root.left, key, ancestors)) {
			ancestors.add(root.data);
			return true;
		}
		
		if(foundKey(root.right, key, ancestors)) {
			ancestors.add(root.data);
			return true;
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		List<Integer> ancestors = new ArrayList<Integer>();
		foundKey(root, 4, ancestors);
		System.out.println(ancestors);
	}

}
