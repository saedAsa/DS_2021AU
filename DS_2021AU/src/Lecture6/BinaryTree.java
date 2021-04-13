package Lecture6;

import java.util.LinkedList;
import java.util.Queue;
/**
 * DS 2021 lecture codes v 0.1
 *  Binary Tree class
 * @author asalysaed, Ariel University
 *
 */
public class BinaryTree<T> {
	Node<T> root;
	int size;// number of vertices

	public BinaryTree() {
		root = null;
		size = 0;
	}

	public boolean isEmpty() {
		return (root == null);
	}

	public void addIterative(T data) {
		boolean Added = false;
		if (isEmpty()) {
			root = new Node<T>(data);
			size++;
			Added = true;
		}
		Node<T> p = root;
		while (!Added) {
			if (Math.random() > 0.5) {
				if (p.right == null) {
					p.right = new Node<T>(data);
					size++;
					Added = true;
				} else {
					p = p.right;
				}
			} else {
				if (p.left == null) {
					p.left = new Node<T>(data);
					size++;
					Added = true;
				} else {
					p = p.left;
				}
			}
		}
	}

	public void addRecursive(T data) {
		if (root == null) {
			root = new Node<T>(data);
			size++;
			return;
		}
		addRecursive(data, root);

	}

	private void addRecursive(T data, Node<T> curr) {
		if (Math.random() > 0.5) {
			if (curr.right == null) {
				curr.right = new Node<T>(data);
				size++;
				return;
			} else {
				addRecursive(data, curr.right);
			}
		} else {
			if (curr.left == null) {
				curr.left = new Node<T>(data);
				size++;
				return;
			} else {
				addRecursive(data, curr.left);
			}
		}
	}

	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(Node<T> p) {
		if (p != null) {
			inOrder(p.left);
			System.out.print(p + " ");
			inOrder(p.right);
		}
	}
	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(Node<T> p) {
		if (p != null) {
			System.out.print(p + " ");
			preOrder(p.left);
			preOrder(p.right);
		}
	}
	public void postOrder() {
		postOrder(root);
	}

	private void postOrder(Node<T> p) {
		if (p != null) {
			postOrder(p.left);
			postOrder(p.right);
			System.out.print(p + " ");
		}
	}
	public void BFS() {
		Node<T> p=root;
		Queue<Node<T>> q=new LinkedList<> ();
		q.add(p);
		while(!q.isEmpty()){
			p=q.remove();
			System.out.print(p+" ");
			if(p.left!=null) {
				q.add(p.left);
			}
			if(p.right!=null)
				q.add(p.right);
		}
		
	}
}
