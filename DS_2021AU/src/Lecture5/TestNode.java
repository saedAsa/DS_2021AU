package Lecture5;

public class TestNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> p=new Node<Integer>(5,null);
		Node<Boolean> p2=new Node<Boolean>(false,p);
		Node<Character> p3=new Node<Character>('*',p2);

	}

}
