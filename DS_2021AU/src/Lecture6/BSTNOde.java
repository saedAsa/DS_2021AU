package Lecture6;
/**
 * DS 2021 lecture codes v 0.1
 *  Binary Search Tree Node class
 * @author asalysaed, Ariel University
 *
 */
public class BSTNOde {
	int data;
	BSTNOde right, left;

	public BSTNOde(int data) {
		this.data = data;
		right = left = null;
	}

	public String toString() {
		return "" + data;
	}
}
