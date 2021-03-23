package Lecture4_DLL;
/**
 * DS 2021 lecture codes v 0.1 
 *  Doubly Linked List
 * @author asalysaed, Ariel University
 *
 */
public class DLL {
	Node head;
	int size;
	public DLL() {
		head=null;
		size=0;
	}
	public void Add(int data) {
		Node new_Node=new Node(data);
		new_Node.next=head;
		if(head!=null) {
			head.prev=new_Node;
		}
		head=new_Node;
		size++;
	}
	public void append(int data) {
		Node new_Node=new Node(data);
		if(head==null) {
			new_Node.prev=null;
			head=new_Node;
			size++;
			return;
		}
		Node p=head;
		while(p.next!=null) {
			p=p.next;
		}
		p.next=new_Node;
		new_Node.prev=p;
		size++;
	}
}
