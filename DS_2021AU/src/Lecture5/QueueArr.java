package Lecture5;
/**
 * DS 2021 lecture codes v 0.1
 *  Queue using array
 * @author asalysaed, Ariel University
 *
 */
public class QueueArr {
	static int errorVal = Integer.MAX_VALUE;
	int[] Queue;
	int front, rear;
	int maxCap;
	int size;

	public QueueArr(int maxCap) {
		this.maxCap = maxCap;
		Queue = new int[maxCap];
		front = rear = -1;
		size = 0;
	}

	public boolean isEmpty() {
		return (size == 0);// (front==-1)&&(rear==-1)
	}

	public boolean isFull() {
		return ((rear + 1) % maxCap == front);
	}

	public boolean enqueue(int data) {
		if (isEmpty()) {
			front = rear = 0;
			Queue[front] = data;
			size++;
		} else if (isFull()) {
			return false;
		} else {
			rear = (rear + 1) % maxCap;
			Queue[rear] = data;
			size++;
		}
		return true;
	}

	public int dequeue() {
		int tmp;
		if (isEmpty()) {
			return errorVal;
		} else if (rear == front) {
			tmp = Queue[front];
			front = rear = -1;
			size--;
		} else {
			tmp = Queue[front];
			front = (front + 1) % maxCap;
			size--;
		}
		return tmp;
	}

	public int getFront() {
		return (front != -1) ? Queue[front] : errorVal;
	}

	public int getRear() {
		return (rear != -1) ? Queue[rear] : errorVal;
	}


	public String toString() {
		String st = "";
		
		for (int i = front; i != rear; i = (i + 1) % maxCap) {
			st = st + Queue[i] + " ";
		}
		if (rear != -1) {
			st += Queue[rear] + "|-";
		} else {
			st +=  "|-";
		}
		return st;
	}
}
