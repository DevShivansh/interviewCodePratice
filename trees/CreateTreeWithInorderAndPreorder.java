package trees;

import java.util.HashMap;
import java.util.Map;

public class CreateTreeWithInorderAndPreorder {
	
	private static class Node{
		Character data;
		Node left, right = null;
		
		public Node(Character data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			left = right = null;
		}
		
	}
	
	public static void preorder(Node root) {
		
		if(root == null)
			return;
		
		System.out.print(root.data + " ");
		
		preorder(root.left);
		preorder(root.right);
	}
	
	
	public static Node buildTree(char[] in, char[] pre, int n) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i < n; i++)
			map.put(in[i], 1);
		
		return buildTreeUtil(in, pre, 0, n - 1, map);
		
	}
	
	static int preIndex = 0;

	private static Node buildTreeUtil(char[] in, char[] pre, int start, int end, Map<Character, Integer> map) {
		
		if(start > end)
			return null;
		
		Character c = pre[preIndex++];
		
		Node temp = new Node(c);
		
		if( start == end)
			return temp;
		
		int inIndex = map.get(c);
		
		temp.left = buildTreeUtil(in, pre, start, inIndex - 1, map);
		temp.right = buildTreeUtil(in, pre, inIndex + 1, end, map);
		
		return temp;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char in[] = { 'D', 'B', 'E', 'A', 'F', 'C' }; 
	    char pre[] = { 'A', 'B', 'D', 'E', 'C', 'F' };
	    
	    Node root = buildTree(in, pre, in.length);
	    
	    preorder(root);

	}

}
