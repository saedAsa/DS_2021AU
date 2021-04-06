package Lecture5;

public class StackLLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackLL<Integer> st=new StackLL<>();
		st.push(34);
		st.push(-3);
		st.push(-9);
		System.out.println("The stack: " + st);
		st.push(10);
		st.push(11);
		System.out.println("top element: "+st.top());
		System.out.println("The stack: " + st);
		while(!st.isEmpty()) {
			st.pop();
		}
		//try to pop from empty stack
		st.pop();
	}

}
