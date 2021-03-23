package Lecture4_SortedLL;
/**
 * DS 2021 lecture codes v 0.1
 *  Sorted Linked List
 * @author asalysaed, Ariel University
 *
 */
public class Node {
	private double data;
	private Node next;
	public Node(double data, Node next) {
		this.data = data;
		this.next = next;
	}
	public double getData() {
		return data;
	}
	public void setData(double data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
