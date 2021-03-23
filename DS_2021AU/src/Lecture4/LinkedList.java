package Lecture4;
/**
 * DS 2021 lecture codes v 0.1
 *  Single Linked List
 * @author asalysaed, Ariel University 
 *
 */
public class LinkedList {
	public Node head, tail;
	int size;

	public LinkedList() {
		head = tail = null;
		size = 0;
	}

	public void Add(int val) {

		Node p = new Node(val, head);
		head = p;
		size++;
		if (tail == null) {
			tail = head;
		}
	}

	public void Append(int val) {
		if (size == 0) {
			head = new Node(val, null);
			tail = head;
			size = 1;
		} else {
			Node newNode = new Node(val, null);
			tail.setNext(newNode);
			tail = tail.getNext();
			size++;
//			Node p=head;
//			while(p.getNext()!=null) {
//				p=p.getNext();
//			}
//			Node newNode=new Node(val,null);
//			p.setNext(newNode);
//			size++;
		}
		
		
	}
	public Node Remove(int data) {
		if(head.getData()==data) {
			Node tmp=head;
			head=head.getNext();
			size--;
			return tmp;
		}
		Node p=head;
		while(p.getNext()!=null&&p.getNext().getData()!=data) {
			p=p.getNext();
		}
		if(p.getNext()!=null) {
			Node tmp=p.getNext();
			p.setNext(p.getNext().getNext());
			size--;
			return tmp;
		}
		return null;
	}
	public void RemoveAllOccurences(int data) {
		Node p=Remove(data);
		while(p!=null) {
			p=Remove(data);
		}
	}
	public String toString() {
		if(size==0)
			return "->null";
		Node p=head;
		String st="-> ";
		while(p.getNext()!=null) {
			st+=p.getData()+"-> ";
			p=p.getNext();
		}
		st+=p.getData()+" -> null";
		return st;
	}
}
