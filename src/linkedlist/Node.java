package linkedlist;

public class Node {
	Node next = null;
	int data;
	
	public Node(int d) {
		data = d;
	}
	
	void appendToTail(int d) {
		Node end = new Node(d);
		Node n = this;
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
	

	Node deleteNode(Node head, int d) {
		Node n = head;
		if (n.data == d) {
			return head.next;
		}
		
		while(n.next != null) {
			if (n.next.data == d) {
				n.next =  n.next.next;
				return head;
			}
			n = n.next;
		}
		return head;
	}
	
	public void printAll() {
	    if (next != null) {
	        System.out.println("; ");
	        next.printAll(); 
	    }
	}
//	void findKthElem(int k) {
//		Node n = this;
//		Node current = n;
//		for (i = 0; i < k; i++) {
//			if n.next != null {
//				n = n.next;
//			}
//		}
//		if n.next == null {
//			return current
//		}
//		else {
//			current = current.next
//
//
//	}
//	
}
