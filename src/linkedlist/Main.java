package linkedlist;


public class Main {
	public static void main(String[] args) {
		System.out.println("Hello");
		Node head = new Node(1);
		System.out.println(head.data);
		int[] inputArray = {
				1,2,3,4,5,6,7,8,9,10
		};
		
		for (int i = 0; i < inputArray.length; i++) {
			head.appendToTail(inputArray[i]);
		}
		
	}
}
