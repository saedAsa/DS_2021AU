package Lecture5;

import javax.sql.rowset.spi.TransactionalWriter;

public class StackArr {
	int[] Stack;
	int topIndx;// index of last element added
	int MaxCapacity;

	public StackArr(int maxCap) {
		MaxCapacity = maxCap;
		Stack = new int[MaxCapacity];
		topIndx = -1;
	}

	public boolean IsEmpty() {
		return (topIndx == -1);
	}

	public boolean IsFull() {
		return (topIndx == MaxCapacity - 1);
	}

	public void push(int data) throws Exception {//O(1)
		
		if (!IsFull()) {
			topIndx++;
			Stack[topIndx] = data;
			System.out.println(data + " has been pushed.");
		} else {
			
			throw new Exception("The stack is Overflow!");//As suggested from the students, I changed the error to an exception 
//			throw new StackOverflowError("You are out of memory man!");

		}

	}

	public int pop() {//O(1)
		if (!IsEmpty()) {
			int tmp = Stack[topIndx];
			topIndx--;
			System.out.println(tmp + " has been poped.");
			return tmp;
		}
		System.err.println("The stack is empty, nothing to pop!");
		return Integer.MAX_VALUE;
	}

	public int top() {
		return (!IsEmpty()) ? Stack[topIndx] : Integer.MAX_VALUE;
	}

	public String toString() {//O(n)
		String st = "-|";
		if (!IsEmpty()) {
			for (int i = 0; i < topIndx; i++) {
				st += Stack[i] + ", ";
			}
			st += Stack[topIndx];
		}
		return st;
	}
}
