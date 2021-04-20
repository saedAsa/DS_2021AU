package Lecture6;
/**
 * DS 2021 lecture codes v 0.1
 *  Binary Search Tree Node class
 * @author asalysaed, Ariel University
 *
 */
public class BSTNode {
	int data;
	BSTNode right, left;

	public BSTNode(int data) {
		this.data = data;
		right = left = null;
	}

	public String toString() {
		return "" + data;
	}
}
