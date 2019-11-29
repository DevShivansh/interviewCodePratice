package trees;

public class Node<T> {
	
		T data;
		Node left, right = null;
		
		public Node(T data) {
			this.data = data;
			left = right = null;
		}
		

}
