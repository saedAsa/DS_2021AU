package Lecture5;

public class StackLL<T> {
	Node<T> top;
	int size;

	public StackLL() {
		top = null;
		size = 0;
	}

	public void push(T data) {
		Node<T> p = new Node<T>(data, this.top);
		top = p;
		size++;
		System.out.println(data + " has been pushed.");
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public T pop() {
		if (top != null) {
			T tmp = top.data;
			top = top.next;
			size--;
			System.out.println(tmp + " has been poped.");
			return tmp;
		}
		System.err.println("The stack is empty, nothing to pop!");
		return null;
	}

	public T top() {
		return (top != null) ? top.data : null;
	}

	public String toString() {
//		return MytoString(top);
		String st = "";
		Node<T> p = null;
		for (p = top; p != null; p = p.next) {
			st = p.data + " " + st;
		}
		st = "-|" + st;
		return st;
	}
	//another option: recursive approach (just for fun)
	private String MytoString(Node<T> p) {
		if (p == null) {
			return "-|";
		}
		return MytoString(p.next) + " " + p.data;
	}
}
