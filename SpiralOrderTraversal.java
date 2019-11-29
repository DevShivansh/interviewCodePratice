package mustDo;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class SpiralOrderTraversal {
	
	private class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			left = right = null;
		}
	}
	
	public void spiralTraversal(Node root) {
		
		Queue<Node> queue = new LinkedList<SpiralOrderTraversal.Node>();
		Deque<Node> deque = new LinkedList<SpiralOrderTraversal.Node>();
		deque.add(root);
		boolean toogle = false;
		//1 2 3 4 5 6 7
		//1 2 3 7 6 5 4 
		
		while(!deque.isEmpty()) {
			
			if(!toogle) {
				
				Node temp = null;
				while(!deque.isEmpty()) {
					temp = deque.getLast();
					System.out.println(temp.data);
					
					if(temp.left != null) {
						queue.add(temp.left);
					}
					
					if(temp.right != null)
						queue.add(temp.right);
					
				}
				deque.addAll(queue);
				queue.clear();
				toogle = true;
				
			}else {
				toogle = false;
				Node temp = null;
				while(!deque.isEmpty()) {
					temp = deque.getFirst();
					System.out.println(temp.data);
					
					if(temp.left != null) {
						queue.add(temp.left);
					}
					
					if(temp.right != null)
						queue.add(temp.right);
					
				}
				deque.addAll(queue);
				queue.clear();
				
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
