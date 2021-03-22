package Lecture4_SortedLL;

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
