package facebookQuestion;

/*
 Class for Binary tree
 */
class BTNode {
	BTNode lchild = null;
	BTNode rchild = null;
	boolean visited = false;
	int data;

	public BTNode(int d) {
		data = d;
	}

	void addToTree(int d) {
		BTNode root = this;
		if (root == null) {
			root = new BTNode(d);
		} else {
			if (root.lchild == null) {
				root.lchild = new BTNode(d);
			} else if (root.rchild == null) {
				root.rchild = new BTNode(d);
			} else {
				root = root.lchild;
				root.addToTree(d);
			}

		}
	}

	void printTree() {
		BTNode root = this;
		System.out.println(root.data);
		if (root.lchild != null) {
			root.lchild.printTree();
		}
		if (root.rchild != null) {
			root.rchild.printTree();
		}
	}

}
