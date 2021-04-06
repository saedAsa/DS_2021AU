package Lecture5;
/**
 * DS 2021 lecture codes v 0.1
 *  Node class
 * @author asalysaed, Ariel University
 *
 */
public class Node<T> {
	T data;
	Node<T> next;
	public Node(T data,Node next) {
		this.data=data;
		this.next=next;
	}
	public String toString() {
		return data+"";
	}
}
