package Lecture6;

/**
 * DS 2021 lecture codes v 0.1 Binary Search Tree class
 * 
 * @author asalysaed, Ariel University
 *
 */
public class BinarySearchTree {
	BSTNode root;
	int size;

	public BinarySearchTree() {
		root = null;
		size = 0;
	}

	public void Add(int data) {
		if (root == null) {
			root = new BSTNode(data);
			size++;
		} else {
			BSTNode p = root;
			while (true) {
				if (p.data >= data) {
					if (p.left == null) {
						p.left = new BSTNode(data);
						size++;
						break;
					} else {
						p = p.left;
					}
				} else {
					if (p.right == null) {
						p.right = new BSTNode(data);
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

	private void inOrder(BSTNode p) {
		if (p != null) {
			inOrder(p.left);
			System.out.print(p + " ");
			inOrder(p.right);
		}
	}

	public BSTNode Search(int data) {
		BSTNode p = root;
		while (p != null && p.data != data) {
			if (p.data < data) {
				p = p.right;
			} else {
				p = p.left;
			}
		}
		return p;
	}

	public BSTNode getFather(int data) {
		if (root.data == data) {
			return null;
		}
		BSTNode p = root;
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
		return p;// we reach here just in case we are out of the loop (p is equals to null).
	}

	public BSTNode getMin(BSTNode curr) {
		BSTNode p = curr;
		while (p.left != null)
			p = p.left;
		return p;
	}

	public boolean Remove(int data) {
		BSTNode v = Search(data);
		if (v == null)
			return false;
		BSTNode father = getFather(data);
		if (v.left == null && v.right == null) {// v is leaf
			if (father == null) {
				root = null;
				size = 0;
				return true;
			}
			if (father.left == v) {
				father.left = null;
				size--;
				return true;
			} else {
				father.right = null;
				size--;
				return true;
			}
		}

		if ((v.left != null) && (v.right == null)) {
			if (father.right == v) {
				father.right = v.left;
				size--;
				return true;
			} else {
				father.left = v.left;
				size--;
				return true;
			}
		} else if ((v.left == null) && (v.right != null)) {
			if (father.right == v) {
				father.right = v.right;
				size--;
				return true;
			} else {
				father.left = v.right;
				size--;
				return true;
			}
		}
		BSTNode Min = getMin(v.right);
		int MinVal = Min.data;
		Remove(MinVal);
		v.data = MinVal;
		return true;
	}

}
