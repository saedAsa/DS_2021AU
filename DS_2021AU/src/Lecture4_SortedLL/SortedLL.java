package Lecture4_SortedLL;
/**
 * DS 2021 lecture codes v 0.1
 *  Sorted Linked List Node
 * @author asalysaed, Ariel University
 *
 */
public class SortedLL {
	Node head;
	int size;

	public SortedLL() {
		head = null;
		size = 0;
	}

	public void Add(double data) {
		Node p = head;
		if (p == null) {
			head = new Node(data, null);
			size = 1;
			return;
		}
		if (data < head.getData()) {
			head = new Node(data, head);
			size++;
			return;
		}
		while((p.getData()<data)&&(p.getNext()!=null)&&
				(p.getNext().getData()<data)) {
			p=p.getNext();
		}
		Node newNode=new Node(data,p.getNext());
		p.setNext(newNode);
		size++;
	}
}
