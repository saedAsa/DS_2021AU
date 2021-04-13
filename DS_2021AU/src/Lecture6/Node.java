package Lecture6;
/**
 * DS 2021 lecture codes v 0.1
 *  Binary Tree Node test class
 * @author asalysaed, Ariel University
 *
 */
public class Node<T> {
	T data;
	Node<T> right, left;

	public Node(T data) {
		this.data = data;
		right = left = null;
	}

	public String toString() {
		return "" + data;
	}
}
