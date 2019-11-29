package linkedList;


public class P8_MergeSortOnLL {

	private static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public static void printNode(Node head) {

		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();

	}
	
	public static Node mergeSort(Node head) {
		
		if(head == null || head.next == null) {
			return head;
		}
		
		Node mid = getMiddle(head);
		Node midNext = mid.next;
		mid.next = null;
		
		Node left = mergeSort(head);
		Node right = mergeSort(midNext);
		
		Node sortedList = sortedMerge(left,right);
		return sortedList;
		
	}
	
	private static Node sortedMerge(Node left, Node right) {
		// TODO Auto-generated method stub
		if( left == null)
			return right;
		
		if ( right == null)
			return left;
		
		Node sorted = null;
		
		if(left.data <= right.data) {
			sorted = left;
			sorted.next = sortedMerge(left.next, right);
		}else {
			sorted = right;
			sorted.next = sortedMerge(left, right.next);
		}
		
		return sorted;
	}

	public static Node getMiddle(Node head) {
		
		if(head == null )
			return head;
		
		Node slow = head , fast = head;
		
		while(fast.next != null && fast.next.next !=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}
	
	public static void main(String[] args) {
		// 7 5 9 4 6
		Node node1 = new Node(7);
		node1.next = new Node(5);
		node1.next.next = new Node(9);
		node1.next.next.next = new Node(4);
		node1.next.next.next.next = new Node(6);

		printNode(node1);
		Node rev = mergeSort(node1);
		printNode(rev);

	}

}
