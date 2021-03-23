package Lecture4;
/**
 * DS 2021 lecture codes v 0.1
 *  Single Linked List  Node 
 * @author asalysaed, Ariel University
 *
 */
public class Node {
	private int data;
	private Node next;

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
}
