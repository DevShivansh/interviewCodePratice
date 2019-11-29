package trees;

import java.util.ArrayList;
import java.util.List;

public class LCAinBinaryTree {

	
	
	public static boolean ancestors(Node<Integer> root, int n1, List<Integer> list){

		if(root == null)
			return false;
		
		if(root.data == n1)
			return true;
		
		if(ancestors(root.left, n1, list)) {
			list.add(root.data);
			return true;
		}
		
		if(ancestors(root.right, n1, list)) {
			list.add(root.data);
			return true;
		}
		
		return false;
	}
	
	public static int LCA(Node<Integer> root, int n1, int n2) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		ancestors(root, n1, list1);
		
		List<Integer> list2 = new ArrayList<Integer>();
		ancestors(root, n2, list2);
		
		list1.retainAll(list2);
		
		return list1.get(list1.size() - 1);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
