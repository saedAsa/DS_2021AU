package Lecture6;
/**
 * DS 2021 lecture codes v 0.1
 *  Binary Search Tree class
 * @author asalysaed, Ariel University
 *
 */
public class BinarySearchTree {
	BSTNOde root;
	int size;

	public BinarySearchTree() {
		root = null;
		size = 0;
	}

	public void Add(int data) {
		if (root == null) {
			root = new BSTNOde(data);
			size++;
		} else {
			BSTNOde p = root;
			while (true) {
				if (p.data >= data) {
					if (p.left == null) {
						p.left = new BSTNOde(data);
						size++;
						break;
					} else {
						p = p.left;
					}
				} else {
					if (p.right == null) {
						p.right = new BSTNOde(data);
						size++;
						break;
					} else {
						p = p.right;
					}
				}
			}
		}
	}

	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(BSTNOde p) {
		if (p != null) {
			inOrder(p.left);
			System.out.print(p + " ");
			inOrder(p.right);
		}
	}

	public BSTNOde Search(int data) {
		BSTNOde p = root;
		while (p != null && p.data != data) {
			if (p.data < data) {
				p = p.right;
			} else {
				p = p.left;
			}
		}
		return p;
	}

	public BSTNOde getFather(int data) {
		if (root.data == data) {
			return null;
		}
		BSTNOde p = root;
		while (p != null) {
			if (p.data < data) {
				if (p.right.data == data) {
					return p;
				}
				p = p.right;
			} else {
				if (p.left.data == data)
					return p;
				p = p.left;
			}
		}
		return p;//we reach here just in case we are out of the loop (p is equals to null).
	}

	public BSTNOde getMin(BSTNOde curr) {
		BSTNOde p=curr;
		while(p.left!=null)
			p=p.left;
		return p;
	}
	
}
