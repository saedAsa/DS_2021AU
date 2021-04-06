package Lecture5;

public class StackArrTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackArr st=new StackArr(10);
		try {
		st.push(5);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(st);
		for(int i=0;i<9;i++) {
			try {
			st.push((int)(Math.random()*10));
			}catch(Exception e) {System.out.println(e);}
			System.out.println(st);
		}
		try {
		st.push(15);
		}catch(Exception e) {System.out.println(e);}
		st.pop();
		st.pop();
		System.out.println(st);
		
	}

}
