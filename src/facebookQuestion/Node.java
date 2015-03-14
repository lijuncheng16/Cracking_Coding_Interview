package facebookQuestion;

/*
 Node class for linked list
 */
class Node {
	Node next = null;
	Node prev = null;
	int data;

	public Node() {

	}

	public Node(int d) {
		data = d;
	}

	void appendToTail(int d) {
		Node end = new Node(d);
		Node curlast = this;
		// traverse to end of linked list
		while (curlast.next != null) {
			curlast = curlast.next;
		}
		curlast.next = end;
	}

	void printList() {
		Node current = this;
		System.out.print(current.data + "<->");
		while (current.next != null) {
			current = current.next;
			System.out.print(current.data + "<->");
		}
	}
}
