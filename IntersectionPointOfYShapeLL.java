package mustDo;

import java.util.ArrayList;
import java.util.List;

public class IntersectionPointOfYShapeLL {
	
	class Node {
		   int data;
		    Node next;
		    Node(int d)  { data = d;  next = null; }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int intersectPoint(Node headA, Node headB)
	{
		 List<Integer> addresses = new ArrayList<Integer>();
		 Node temp = headA;
		 while(temp!=null) {
			 addresses.add(temp.hashCode());
			 temp = temp.next;
		 }
		 
		 temp = headB;
		 
		 while(temp!=null) {
			 Integer address = temp.hashCode();
			 if(addresses.contains(address)) {
				 return temp.data;
			 }
			 temp = temp.next;
		 }
         return -1;
	}

}
