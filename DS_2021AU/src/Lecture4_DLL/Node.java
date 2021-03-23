package Lecture4_DLL;
/**
 * DS 2021 lecture codes v 0.1
 *  Doubly Linked List Node
 * @author asalysaed, Ariel University
 *
 */
public class Node {
	int data;
	Node next,prev;
	public Node(int data) {
		this.data=data;
		next=prev=null;
	}
}
