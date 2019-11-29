package mustDo;

import java.util.LinkedList;
import java.util.Queue;

public class RightViewBinaryTree {
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		
		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}
	
	public static void solution(Node root) {
		
		Queue<Node> queue = new LinkedList<RightViewBinaryTree.Node>();
		queue.add(root);
		StringBuilder output = new StringBuilder();
		while(!queue.isEmpty()) {
			Queue<Node> tempQueue = new LinkedList<RightViewBinaryTree.Node>();
			Node lastNode = null;
			while(!queue.isEmpty()) {
				Node temp = queue.poll();
				if(queue.isEmpty()) {
					lastNode = temp;
				}
				if(temp.left!=null) {
					tempQueue.add(temp.left);
				}
				if(temp.right!=null) {
					tempQueue.add(temp.right);
				}
			}
			
			if(lastNode!=null)
				output.append(lastNode.data + " ");
			
			queue.addAll(tempQueue);
			tempQueue.clear();
			
		}
		
		System.out.println(output.toString().trim());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 1 2 L 1 3 R 3 4 L
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		//root.left.left = new Node(4);
		//root.left.right = new Node(5);
		root.right.left = new Node(4);
		//root.right.right = new Node(7);
		//root.left.left.left = new Node(8);
		solution(root);

	}

}
